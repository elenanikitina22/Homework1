package org.example;

public class User {
    private String login;
    private String email;

    public User()
    {
        login = "Логин";
        email = "email@test.ru";
    }

    public User(String login, String email) throws Exception {
        if (email.contains("@") && email.contains("."))
        {
            this.login = login;
            this.email = email;
        }

        if (login.equals(email))
        {
            throw new Exception("Логин и email совпадают!");
        }
    }

    public String getLogin() {
        return login;
    }

    public String getEmail() {
        return email;
    }
}