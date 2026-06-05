package database;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import util.factory.RegisterFactory;
import util.model.Register;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Database {

    private static Register register;
    private static Response response;

    @BeforeAll
    static void setup() throws IOException {
        String payload = Files.readString(Paths.get("src/test/resources/payload/conta-maria-silva.json"));

        ObjectMapper mapper = new ObjectMapper();

        JsonNode jsonNode = mapper.readTree(payload);

        RegisterFactory registerFactory = new RegisterFactory();
        register = registerFactory.createUserAccount(jsonNode.get("email").asText(), jsonNode.get("loginName").asText(), jsonNode.get("password").asText());
    }
    
    @Test
    void createAccount(){
      response = RestAssured.given()
                .baseUri("https://www.advantageonlineshopping.com")
              .basePath("/accountservice")
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(register)
                .when()
                .post("/accountrest/api/v1/register")
                .then()
              .log().all()
                .statusCode(200)
                .extract()
                .response();
    }
}