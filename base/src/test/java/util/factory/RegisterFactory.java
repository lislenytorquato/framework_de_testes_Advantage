package util.factory;

import net.datafaker.Faker;
import net.datafaker.providers.base.Text;
import util.model.Register;

import static net.datafaker.providers.base.Text.DIGITS;
import static net.datafaker.providers.base.Text.EN_UPPERCASE;

public class RegisterFactory {

    private Register register;

    public Register createUserAccount(){
        Faker faker = new Faker();
        register = new Register("USER", faker.address().fullAddress(),faker.random().nextBoolean(),
                faker.random().nextBoolean(),faker.address().cityName(),
                faker.country().name(),faker.internet().emailAddress(),
                faker.name().firstName(),faker.name().lastName(),
                createText(faker,8,3,3),
                createText(faker,9,2,2),
                faker.phoneNumber().phoneNumber(),faker.address().state(),
                faker.address().zipCode());
        return register;
    }

    private String createText(Faker faker, int len, int times_UPPERCASE, int times_DIGITS){
        return faker.text().text(Text.TextSymbolsBuilder.builder()
                .len(len)
                .with(EN_UPPERCASE, times_UPPERCASE)
                .with(DIGITS, times_DIGITS).build());
    }
}
