package org.example;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UserTest {

    @Test
    public void shouldCreateUserWithoutParams()
    {
        User user = new User();
        Assertions.assertTrue(user.getLogin() == "Логин");
        Assertions.assertTrue(user.getEmail() == "email@test.ru");
    }

    @Test
    public void shouldCreateUserWithParams()
    {
        User user = new User("Иван", "ivan@test.ru");
        Assertions.assertTrue(user.getLogin() == "Иван");
        Assertions.assertTrue(user.getEmail() == "ivan@test.ru");
    }

    @Test
    public void shouldCheckCorrectEmail()
    {
        User user = new User("Иван", "ivan@test.ru");
        Assertions.assertTrue(user.getEmail().contains("@"));
        Assertions.assertTrue(user.getEmail().contains("."));
    }

    @Test
    public void shouldCheckEmailAndLogin()
    {
        User user = new User("Иван", "ivan@test.ru");
        Assertions.assertEquals(user.getEmail(), user.getLogin());
    }
}