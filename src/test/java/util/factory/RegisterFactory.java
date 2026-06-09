package util.factory;

import net.datafaker.Faker;
import util.model.Login;
import util.model.Register;

public class RegisterFactory {

    public Register createUserAccount(String email, String username, String password){

       LoginFactory loginFactory = new LoginFactory();
       Login loginData = loginFactory.createLogin(email,username,password);
       Faker faker = new Faker();

        Register register = new Register("USER", faker.address().streetAddress(),true,true,faker.address().cityName(),
                "AUSTRALIA_AU",loginData.getEmail(),faker.name().firstName(),faker.name().lastName(),
                loginData.getLoginUser(),
                loginData.getLoginPassword(), faker.phoneNumber().phoneNumber(),faker.address().stateAbbr(),faker.address().zipCode());
        return register;


    }

}