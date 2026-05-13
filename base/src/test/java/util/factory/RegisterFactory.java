package util.factory;

import net.datafaker.Faker;
import net.datafaker.providers.base.Text;
import util.model.Login;
import util.model.Register;

import static net.datafaker.providers.base.Text.DIGITS;
import static net.datafaker.providers.base.Text.EN_UPPERCASE;

public class RegisterFactory {

    private Register register;
    public Register createUserAccountOBrigatoryFields(){

       LoginFactory loginFactory = new LoginFactory();

        register = new Register("USER", loginFactory.createLogin().getEmail(),
                loginFactory.createLogin().getLoginUser(),
                loginFactory.createLogin().getLoginPassword());
        return register;
    }




}
