package mona.Small_Twitter.Users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // Make UserService a bean (@Component would works the same)
public class UserService {
    private final UserRepository UserRepository;

    @Autowired
    public UserService(mona.Small_Twitter.Users.UserRepository userRepository) {
        this.UserRepository = userRepository;
    }

    public List<Users> getUsers(){
        return UserRepository.findAll();

    }

}
