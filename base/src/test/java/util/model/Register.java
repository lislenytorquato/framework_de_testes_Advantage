package util.model;

import util.enums.AccountType;
import util.enums.Country;

import java.util.Objects;

public class Register {

        private String accountType;
        private String address;
        private boolean allowOffersPromotion;
        private boolean aobUser;
        private String cityName;
        private String country;
        private String email;
        private String firstName;
        private String lastName;
        private String loginName;
        private String password;
        private String phoneNumber;
        private String stateProvince;
        private String zipcode;

    public Register(String accountType, String address, boolean allowOffersPromotion, boolean aobUser, String cityName, String country, String email, String firstName, String lastName, String loginName, String password, String phoneNumber, String stateProvince, String zipcode) {
        this.accountType = accountType;
        this.address = address;
        this.allowOffersPromotion = allowOffersPromotion;
        this.aobUser = aobUser;
        this.cityName = cityName;
        this.country = country;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.loginName = loginName;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.stateProvince = stateProvince;
        this.zipcode = zipcode;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Register register = (Register) o;
        return allowOffersPromotion == register.allowOffersPromotion && aobUser == register.aobUser && Objects.equals(accountType, register.accountType) && Objects.equals(address, register.address) && Objects.equals(cityName, register.cityName) && Objects.equals(country, register.country) && Objects.equals(email, register.email) && Objects.equals(firstName, register.firstName) && Objects.equals(lastName, register.lastName) && Objects.equals(loginName, register.loginName) && Objects.equals(password, register.password) && Objects.equals(phoneNumber, register.phoneNumber) && Objects.equals(stateProvince, register.stateProvince) && Objects.equals(zipcode, register.zipcode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountType, address, allowOffersPromotion, aobUser, cityName, country, email, firstName, lastName, loginName, password, phoneNumber, stateProvince, zipcode);
    }
}
