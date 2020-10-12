package by.epamtc.rumiantsau.bean;

import java.io.Serializable;
import java.util.Objects;

public class InfoForAuthorization implements Serializable {

    private static final long serialVersionUID = 1556899559665584887L;

    private String login;
    private String password;

    public InfoForAuthorization() {}

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
        InfoForAuthorization that = (InfoForAuthorization) o;
        return Objects.equals(login, that.login) &&
                Objects.equals(password, that.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, password);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
