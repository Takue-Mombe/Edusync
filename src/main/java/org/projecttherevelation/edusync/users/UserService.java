package org.projecttherevelation.edusync.users;


import org.projecttherevelation.edusync.Students.StudentModel;
import org.projecttherevelation.edusync.Students.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepo userRepo;
    private final StudentRepo studentRepo;

    public UserService(UserRepo userRepo, StudentRepo studentRepo) {
        this.userRepo = userRepo;
        this.studentRepo = studentRepo;
    }
  public  Optional<UserModel>findByHitmail(String hitmail){
        return userRepo.findByHitMail(hitmail);
    }

    public UserModel saveUser(UserModel userModel) {
        String hitMail = userModel.getHitMail();
        if (studentRepo.existsByHitMail(hitMail)) {
            // Profile already exists, then you can save
            UserModel savedUser = userRepo.save(userModel);
            return savedUser;

        } else {
            // Profile doesn't exist, do not save
            return null;
        }
    }
    public List<UserModel> getUser(){
        return userRepo.findAll();
    }
}