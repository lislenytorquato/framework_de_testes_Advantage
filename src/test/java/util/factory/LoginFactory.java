package util.factory;

import net.datafaker.Faker;
import net.datafaker.providers.base.Text;
import util.model.Login;

import static net.datafaker.providers.base.Text.*;

public class LoginFactory {
    private Login login = new Login();

    public Login createLogin(String email, String username, String password){

        login.setEmail(email);
        login.setLoginPassword(password);
        login.setLoginUser(username);
        return login;
    }
    public Login returnLogin(){
        return login;
    }
}