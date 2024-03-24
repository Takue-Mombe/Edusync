package org.projecttherevelation.edusync.users;


import org.projecttherevelation.edusync.Students.StudentModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;
    StudentModel studentModel = new StudentModel();

    public String saveUser(UserModel userModel) {
        String trial = studentModel.getHitMail();
        if (Objects.equals(trial, userModel.getHitMail())) {
            UserModel saveModel=userRepo.save(userModel);

            return "matched..."+saveModel;
        } else {
            return "not found";

        }

    }
}
