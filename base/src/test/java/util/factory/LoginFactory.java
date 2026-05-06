package util.factory;

import net.datafaker.Faker;
import net.datafaker.providers.base.Text;
import util.model.Login;

import static net.datafaker.providers.base.Text.DIGITS;
import static net.datafaker.providers.base.Text.EN_UPPERCASE;

public class LoginFactory {
    private Login login;

    public void createLogin(){
       Faker faker = new Faker();
        login.setEmail(faker.internet().emailAddress()+"__TEST");
        login.setLoginPassword(createText(faker,8,2,3)+"__TEST");
        login.setLoginUser(createText(faker,8,1,2)+"__TEST");
    }


}
