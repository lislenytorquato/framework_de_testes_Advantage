package database;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import util.factory.RegisterFactory;
import util.model.Register;

public class Database {

    private static Register registerObrigatoryFields;
    private static Register registerAllFields;

    @BeforeAll
    static void setup(){
        RegisterFactory registerFactory = new RegisterFactory();
        registerObrigatoryFields = registerFactory.createUserAccountOBrigatoryFields();
    }
    @Test
    void createAccount(){
        RestAssured.given()
                .baseUri("https://www.advantageonlineshopping.com/api/docs/")
                .basePath("/accountrest/api/v1/register")
                .body(registerObrigatoryFields)
                .when()
                .post()
                .then()
                .statusCode(200);
    }
}
