package org.example;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UserTest {

    @Test
    public void shouldCreateUserWithoutParams()
    {
        User user = new User();
        Assertions.assertTrue(user.getLogin().equals("Логин"));
        Assertions.assertTrue(user.getEmail().equals("email@test.ru"));
    }

    @Test
    public void shouldCreateUserWithParams() throws Exception {
        User user = new User("Иван", "ivan@test.ru");
        Assertions.assertTrue(user.getLogin().equals("Иван"));
        Assertions.assertTrue(user.getEmail().equals("ivan@test.ru"));
    }

    @Test
    public void shouldCheckCorrectEmail() {
        Assertions.assertThrows(Exception.class, () -> new User("Иван", "ivan@test.ru"));
        Assertions.assertThrows(Exception.class, () -> new User("Иван", "ivantestru"));
    }

    @Test
    public void shouldCheckEmailAndLogin() {
        Assertions.assertThrows(Exception.class, () -> new User("Иван", "ivan@test.ru"));
        Assertions.assertThrows(Exception.class, () -> new User("Ivan", "Ivan"));
    }
}