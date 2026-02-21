package summa.consellorcontrollerminiproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import summa.consellorcontrollerminiproject.Entity.UserEntity;
import summa.consellorcontrollerminiproject.Repo.UserRepository;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public String checkUser(String username, String password) {

        UserEntity user = userRepository.findByUsernameAndPassword(username, password);

        if (user != null) {
            return "User exists";
        } else {
            return "Invalid username or password";
        }
    }
    public String registerUser(String username,String password)
    {
        UserEntity user = new UserEntity();
        if(userRepository.findUserByUsername(username))
        {
            userRepository.save(user); // commit automatically by internally coding
            return "user Registered successfully";
        }
        return "user already exists";

    }

}
