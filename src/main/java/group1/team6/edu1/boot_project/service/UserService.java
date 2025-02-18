package group1.team6.edu1.boot_project.service;

import group1.team6.edu1.boot_project.model.User;
import group1.team6.edu1.boot_project.repository.UserRepository;

// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class UserService {

    // @Autowired
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/users")
    public List<User> getAllUser() {
        return userRepository.findAll();
    }
}
