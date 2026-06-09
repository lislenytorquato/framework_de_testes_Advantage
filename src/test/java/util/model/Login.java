package util.model;

import java.util.Objects;

public class Login {
    private String email;
    private String loginPassword;
    private String loginUser;
    
    public Login() {}
    
    public Login(String email, String loginPassword, String loginUser) {
        this.email = email;
        this.loginPassword = loginPassword;
        this.loginUser = loginUser;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLoginPassword() {
        return loginPassword;
    }

    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
    }

    public String getLoginUser() {
        return loginUser;
    }

    public void setLoginUser(String loginUser) {
        this.loginUser = loginUser;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Login login = (Login) o;
        return Objects.equals(email, login.email) && Objects.equals(loginPassword, login.loginPassword) && Objects.equals(loginUser, login.loginUser);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, loginPassword, loginUser);
    }
}