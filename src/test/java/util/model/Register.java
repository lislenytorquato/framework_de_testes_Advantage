package util.model;

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
        
    public Register() {}

    public Register(String accountType,String email, String loginName, String password) {
        this.accountType = accountType;
        this.email = email;
        this.loginName = loginName;
        this.password = password;
    }
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

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isAllowOffersPromotion() {
        return allowOffersPromotion;
    }

    public void setAllowOffersPromotion(boolean allowOffersPromotion) {
        this.allowOffersPromotion = allowOffersPromotion;
    }

    public boolean isAobUser() {
        return aobUser;
    }

    public void setAobUser(boolean aobUser) {
        this.aobUser = aobUser;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getStateProvince() {
        return stateProvince;
    }

    public void setStateProvince(String stateProvince) {
        this.stateProvince = stateProvince;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
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