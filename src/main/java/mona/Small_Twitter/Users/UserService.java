package mona.Small_Twitter.Users;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // Make UserService a bean (@Component would works the same)
public class UserService {
    public List<Users> getUsers(){
        return List.of(
                new Users(
                        "123455678",
                        "MonaWang@gmail.com",
                        "20021009",
                        "515 Sycamore Ln"
                )
        );
    }

}
