package org.example.Dao;
import org.example.Model.User;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl {

    List<User> users;

    public UserDaoImpl()
    {
        users = new ArrayList<User>();
        users.add(new User("Иван"));
        users.add(new User("Николай"));
        users.add(new User("Петр"));
    }

    public User getUserByName(String name)
    {
        for (var user : users)
        {
            if (user.equals(name))
                return user;
        }

        return null;
    }

    public List<User> findAllUsers()
    {
        return users;
    }
}