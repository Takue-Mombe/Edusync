package org.projecttherevelation.edusync.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/userApi")
public class UserController {
    /*
    @Autowired
    private UserService userService;

    @PostMapping("/register")
    @ResponseBody
    public UserModel registerUser(@RequestBody UserModel user) {
        return userService.registerUser(user);
    }

    @GetMapping("/login")
    @ResponseBody
    public String loginUser() {
        return "Login successful!";
    }*/
}
