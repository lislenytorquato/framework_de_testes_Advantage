package util.factory;

import net.datafaker.Faker;
import net.datafaker.providers.base.Text;
import util.model.Login;

import static net.datafaker.providers.base.Text.*;

public class LoginFactory {
    
    public Login createLogin(){
       Faker faker = new Faker();
       Login login = new Login();
        login.setEmail(faker.internet().emailAddress()+"__TEST");
        login.setLoginPassword(createText(faker,8,2,3, 1)+"__TEST");
        login.setLoginUser(createText(faker,8,1,2,2)+"__TEST");
        return login;
    }
    private String createText(Faker faker, int len, int times_UPPERCASE, int times_DIGITS, int times_LOWERCASE){
        return faker.text().text(Text.TextSymbolsBuilder.builder()
                .len(len)
                .with(EN_UPPERCASE, times_UPPERCASE)
                .with(EN_LOWERCASE, times_LOWERCASE)
                .with(DIGITS, times_DIGITS).build());
    }

}