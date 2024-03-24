package org.projecttherevelation.edusync.users;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/userApi")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/saveUser")
    public String  saveUser(UserModel userModel){

        userService.saveUser(userModel);
        return "saved....";
    }
}
