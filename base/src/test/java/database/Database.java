package database;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import util.factory.RegisterFactory;
import util.model.Register;

public class Database {

    private static Register register;

    @BeforeAll
    static void setup(){
        RegisterFactory registerFactory = new RegisterFactory();
        register = registerFactory.createUserAccount();
    }
    @Test
    void createAccount(){
        RestAssured.given()
                .baseUri("https://www.advantageonlineshopping.com/api/docs/")
                .pa
    }
}
