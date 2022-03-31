package mona.Small_Twitter.Users;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;



@RestController

@RequestMapping
public class Users_Controller {
    @GetMapping("users/register")
    public List<Users> registerUsers(){
        return List.of(
                new Users(
                        1234556789,
                        "MonaWang"
                )
        );
    }
}

