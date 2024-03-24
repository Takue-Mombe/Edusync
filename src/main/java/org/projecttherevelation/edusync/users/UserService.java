package org.projecttherevelation.edusync.users;


import org.projecttherevelation.edusync.Students.StudentModel;
import org.projecttherevelation.edusync.Students.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;
@Service
public class UserService {

    private final UserRepo userRepo;
    private final StudentRepo studentRepo;

    public UserService(UserRepo userRepo, StudentRepo studentRepo) {
        this.userRepo = userRepo;
        this.studentRepo = studentRepo;
    }

    public UserModel saveUser(UserModel userModel) {
        String hitMail = userModel.getHitMail();
        if (studentRepo.existsByHitMail(hitMail)) {
            // Profile already exists, return null or throw an exception
            return null;
        } else {
            // Profile doesn't exist, proceed with saving
            UserModel savedUser = userRepo.save(userModel);
            return savedUser;
        }
    }
}