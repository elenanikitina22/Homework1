package org.example.Service;
import org.example.Dao.UserDaoImpl;
import org.example.Model.User;

public class UserService {
    private UserDaoImpl userDao;

    public boolean checkUserExist(User user)
    {
        User item = userDao.getUserByName(user.getName());

        if (item != null)
            return true;

        return false;
    }
}