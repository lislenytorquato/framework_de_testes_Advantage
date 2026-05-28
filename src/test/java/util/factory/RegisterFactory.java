package util.factory;

import util.model.Login;
import util.model.Register;

public class RegisterFactory {

    public Register createUserAccountOBrigatoryFields(){

       LoginFactory loginFactory = new LoginFactory();
       Login loginData = loginFactory.createLogin();

        Register register = new Register("USER", loginData.getEmail(),
                loginData.getLoginUser(),
                loginData.getLoginPassword());
        return register;


    }

}