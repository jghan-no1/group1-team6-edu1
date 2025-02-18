package group1.team6.edu1.boot_project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
// import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/")
public class HelloController {
    
    @GetMapping
    // public String home(@RequestParam String param) {
        public String home() {
        return "team6";
    }
    
}
