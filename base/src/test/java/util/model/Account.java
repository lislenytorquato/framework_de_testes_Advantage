package util.model;

import util.enums.AccountType;
import util.enums.Country;

import java.util.Objects;

public class Account {

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

    public Account(String accountType, String address, boolean allowOffersPromotion, boolean aobUser, String cityName, String country, String email, String firstName, String lastName, String loginName, String password, String phoneNumber, String stateProvince, String zipcode) {
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
        Account account = (Account) o;
        return allowOffersPromotion == account.allowOffersPromotion && aobUser == account.aobUser && Objects.equals(accountType, account.accountType) && Objects.equals(address, account.address) && Objects.equals(cityName, account.cityName) && Objects.equals(country, account.country) && Objects.equals(email, account.email) && Objects.equals(firstName, account.firstName) && Objects.equals(lastName, account.lastName) && Objects.equals(loginName, account.loginName) && Objects.equals(password, account.password) && Objects.equals(phoneNumber, account.phoneNumber) && Objects.equals(stateProvince, account.stateProvince) && Objects.equals(zipcode, account.zipcode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountType, address, allowOffersPromotion, aobUser, cityName, country, email, firstName, lastName, loginName, password, phoneNumber, stateProvince, zipcode);
    }
}
