package database;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import util.factory.RegisterFactory;
import util.model.Register;

public class Database {

    private static Register registerObrigatoryFields;
    private static Register registerAllFields;
    private static Response response;

    @BeforeAll
    static void setup(){
        RegisterFactory registerFactory = new RegisterFactory();
        registerObrigatoryFields = registerFactory.createUserAccountOBrigatoryFields();
    }
    
    @Test
    void createAccount(){
      response = RestAssured.given()
                .baseUri("https://www.advantageonlineshopping.com/accountservice")
              .basePath("accountrest/api/v1/")
                .contentType(ContentType.JSON)
                .body(registerObrigatoryFields)
                .when()
                .post("register")
                .then()
                .statusCode(200)
                .extract()
                .response();
    }

    @Test
    void deleteAccount(){
        String token = response.jsonPath().getString("token");
        String accountId = response.jsonPath().getString("accountType");

        RestAssured.given()
                .baseUri("https://www.advantageonlineshopping.com")
                .basePath("/accountrest/api/v1/register")
                .contentType(ContentType.JSON)
                .auth().oauth2(token)
                .body(accountId)
                .when()
                .post()
                .then()
                .statusCode(200);

    }
}