package org.example.Service;
import org.example.Model.User;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.when;

class UserServiceTest {

    @InjectMocks
    private UserService userService;

    public UserServiceTest()
    {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void shouldCheckUserExist()
    {
        User user = new User("Николай");
        when(userService.checkUserExist(user));
    }
}