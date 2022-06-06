package com.company.users;

public abstract class User {
    protected String name;
    protected String surname;
    protected String number;
    protected String email;
    protected String password;
    protected String password2;
    protected int cash;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public boolean verifyPassword(String checkPassword) {
        return password.equals(checkPassword);
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword2() {
        return password2;
    }

    public void setPassword2(String password2) {
        this.password2 = password2;
    }

    public Integer getCash() {
        return cash;
    }

    public void setCash(Integer cash) {
        this.cash = cash;
    }

    public String toString(){
        return name + ";" + surname + ";" + number + ";" + email + ";" + password + ";" + cash;
    }
}
