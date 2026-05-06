package database;

import org.junit.jupiter.api.BeforeAll;
import util.factory.LoginFactory;

public class Database {

    @BeforeAll
    static void setup(){
        LoginFactory loginFactory = new LoginFactory();
        loginFactory.createLogin();
    }
    private void createAccount
}
