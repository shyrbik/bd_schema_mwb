package by.epamtc.rumiantsau.bean;

import java.io.Serializable;
import java.util.Objects;

public class InfoForRegistration implements Serializable {

    private static final long serialVersionUID = 4588211699884744488L;

    private String email;
    private String login;
    private String password;

    public InfoForRegistration() {}

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InfoForRegistration that = (InfoForRegistration) o;
        return Objects.equals(email, that.email) &&
                Objects.equals(login, that.login) &&
                Objects.equals(password, that.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, login, password);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "email='" + email + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
