package mona.Small_Twitter.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

// Student Controller is a place for all the student resources


@RestController

@RequestMapping("/users")
public class Users_Controller {
    private final UserService UserService;

    @Autowired //This means that UserService would be instantiated and injected into the constructor
    public Users_Controller(mona.Small_Twitter.Users.UserService userService) {
        this.UserService = userService;
    }

    @GetMapping("/register")
    public List<Users> getUsers(){
        return UserService.getUsers();
    }
}

