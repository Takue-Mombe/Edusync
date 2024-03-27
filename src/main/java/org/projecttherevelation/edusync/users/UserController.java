package org.projecttherevelation.edusync.users;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/userApi")
public class UserController {
    @Autowired(required = true)
    private UserService userService;

    @PostMapping("/register")
    public UserModel registerUser(@RequestBody UserModel user) {
        UserModel registeredUser = userService.saveUser(user);
        System.out.println("User registered successfully with username: " + registeredUser.getHitMail());
        return registeredUser;
    }

    @GetMapping("/login")
    public String loginUser() {
        return "Login successful!";
    }
}
