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
        login.setEmail(faker.internet().emailAddress());
        login.setLoginPassword(faker.text().text(Text.TextSymbolsBuilder.builder()
                .len(8)
                .with(EN_UPPERCASE, 2)
                .with(DIGITS, 3).build()));
        login.setLoginUser(faker.text().text(Text.TextSymbolsBuilder.builder()
                .len(8)
                .with(EN_UPPERCASE, 1)
                .with(DIGITS, 2).build()));
    }

}
