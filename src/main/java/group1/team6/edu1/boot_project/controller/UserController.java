package group1.team6.edu1.boot_project.controller;

import group1.team6.edu1.boot_project.model.*;
import group1.team6.edu1.boot_project.service.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// @RestController
@Controller
public class UserController {
    
    @Autowired
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("mysql")
    public String getUsers(Model model) {
    // public List<User> getUsers(Model model) {
        List<User> users = userService.getAllUser();
        model.addAttribute("users", users);
        return "user_value";
        // return userService.getAllUser();
    }
    
}
