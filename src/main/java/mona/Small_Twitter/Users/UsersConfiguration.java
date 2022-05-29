package mona.Small_Twitter.Users;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import java.util.Arrays;
import java.util.List;


@Configuration
public class UsersConfiguration {

    @Bean
    CommandLineRunner commandLineRunner(
            UserRepository repository){
        return args -> {
            repository.saveAll(
            Arrays.asList(

                    new Users(
                            "wangtangbaihe1009@gmail.com",
                            "20021009"
                    ),
                    new Users(
                    "apache",
                    "wangtangbaihe1009@gmail.com",
                    "20021009"
                    ),

                    new Users(
                    "Chan Chong",
                    "wangtangbaihe1009@gmail.com",
                    "5302312667"
            )

            )
            );
        };
    }
}
