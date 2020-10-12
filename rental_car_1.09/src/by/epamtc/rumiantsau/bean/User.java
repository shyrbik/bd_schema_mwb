package by.epamtc.rumiantsau.bean;

import java.io.Serializable;
import java.util.Objects;

public class User implements Serializable {

    private static final long serialVersionUID = 880041323907629570L;

    private int id;
    private String login;
    private String role;
    private String client_name;
    private String client_surname;
    private String client_passport_number;
    private String client_date_birth;
    private String client_phone_number;
    private String client_adress;
    private String client_driver_licence;

    public User() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id &&
                Objects.equals(login, user.login) &&
                Objects.equals(role, user.role) &&
                Objects.equals(client_name, user.client_name) &&
                Objects.equals(client_surname, user.client_surname) &&
                Objects.equals(client_passport_number, user.client_passport_number) &&
                Objects.equals(client_date_birth, user.client_date_birth) &&
                Objects.equals(client_phone_number, user.client_phone_number) &&
                Objects.equals(client_adress, user.client_adress) &&
                Objects.equals(client_driver_licence, user.client_driver_licence);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, login, role, client_name, client_surname, client_passport_number, client_date_birth, client_phone_number, client_adress, client_driver_licence);
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getClient_name() {
        return client_name;
    }

    public void setClient_name(String client_name) {
        this.client_name = client_name;
    }

    public String getClient_surname() {
        return client_surname;
    }

    public void setClient_surname(String client_surname) {
        this.client_surname = client_surname;
    }

    public String getClient_passport_number() {
        return client_passport_number;
    }

    public void setClient_passport_number(String client_passport_number) {
        this.client_passport_number = client_passport_number;
    }

    public String getClient_date_birth() {
        return client_date_birth;
    }

    public void setClient_date_birth(String client_date_birth) {
        this.client_date_birth = client_date_birth;
    }

    public String getClient_phone_number() {
        return client_phone_number;
    }

    public void setClient_phone_number(String client_phone_number) {
        this.client_phone_number = client_phone_number;
    }

    public String getClient_adress() {
        return client_adress;
    }

    public void setClient_adress(String client_adress) {
        this.client_adress = client_adress;
    }

    public String getClient_driver_licence() {
        return client_driver_licence;
    }

    public void setClient_driver_licence(String client_driver_licence) {
        this.client_driver_licence = client_driver_licence;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", role='" + role + '\'' +
                ", client_name='" + client_name + '\'' +
                ", client_surname='" + client_surname + '\'' +
                ", client_passport_number='" + client_passport_number + '\'' +
                ", client_date_birth='" + client_date_birth + '\'' +
                ", client_phone_number='" + client_phone_number + '\'' +
                ", client_adress='" + client_adress + '\'' +
                ", client_driver_licence='" + client_driver_licence + '\'' +
                '}';
    }
}
