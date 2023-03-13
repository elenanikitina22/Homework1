package org.example.Dao;
import org.example.Model.User;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UserDaoTest {

    private UserDaoImpl userDao;

    @Test
    public void shouldCheckUserByName()
    {
        User user = new User("Николай");
        Assert.assertEquals(userDao.getUserByName(user.getName()), null);
    }

    @Test
    public void shouldCheckUseNull()
    {
        User user = new User("Петр");
        Assertions.assertNull(userDao.getUserByName(user.getName()));
        Assertions.assertNotNull(userDao.getUserByName(user.getName()));
    }
}