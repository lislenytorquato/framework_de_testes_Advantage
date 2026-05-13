package util.factory;

import net.datafaker.Faker;
import net.datafaker.providers.base.Text;
import util.model.Login;

import static net.datafaker.providers.base.Text.DIGITS;
import static net.datafaker.providers.base.Text.EN_UPPERCASE;

public class LoginFactory {
    private Login login;

    public Login createLogin(){
       Faker faker = new Faker();
        login.setEmail(faker.internet().emailAddress()+"__TEST");
        login.setLoginPassword(createText(faker,8,2,3)+"__TEST");
        login.setLoginUser(createText(faker,8,1,2)+"__TEST");
        return login;
    }
    private String createText(Faker faker, int len, int times_UPPERCASE, int times_DIGITS){
        return faker.text().text(Text.TextSymbolsBuilder.builder()
                .len(len)
                .with(EN_UPPERCASE, times_UPPERCASE)
                .with(DIGITS, times_DIGITS).build());
    }

}
