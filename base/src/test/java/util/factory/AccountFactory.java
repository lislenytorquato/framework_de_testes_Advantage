package util.factory;

import net.datafaker.Faker;
import net.datafaker.providers.base.Country;
import net.datafaker.providers.base.Text;
import util.enums.AccountType;
import util.model.Account;

import static net.datafaker.providers.base.Text.DIGITS;
import static net.datafaker.providers.base.Text.EN_UPPERCASE;

public class AccountFactory {

    private Account account;

    public void createUserAccount(){
        Faker faker = new Faker();
        account = new Account("USER", faker.address(),faker.random().nextBoolean(), faker.random().nextBoolean(),faker.address().cityName(), faker.country().name(),faker.internet().emailAddress(),faker.name().firstName(),faker.name().lastName(),faker.)
    }

    private String createText(Faker faker, int len, int times_UPPERCASE, int times_DIGITS){
        return faker.text().text(Text.TextSymbolsBuilder.builder()
                .len(len)
                .with(EN_UPPERCASE, times_UPPERCASE)
                .with(DIGITS, times_DIGITS).build());
    }
}
