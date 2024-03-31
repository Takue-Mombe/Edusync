package org.projecttherevelation.edusync.users;

import org.projecttherevelation.edusync.Students.StudentModel;
import org.projecttherevelation.edusync.Students.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
/*
    private final UserRepo userRepo;
    private final StudentRepo studentRepo;
    private final PasswordEncoder passwordEncoder;

    public UserService(UserRepo userRepo, StudentRepo studentRepo, PasswordEncoder passwordEncoder) {
        this.userRepo = userRepo;
        this.studentRepo = studentRepo;
        this.passwordEncoder = passwordEncoder;
    }

    public Optional<UserModel> findByHitmail(String hitmail) {
        return userRepo.findByHitMail(hitmail);
    }

    public UserModel registerUser(UserModel userModel) {
        String hitMail = userModel.getHitMail();
        Optional<StudentModel> studentOptional = studentRepo.findByHitMail(hitMail);
        if (studentOptional.isPresent()) {
            if (userRepo.existsByHitMail(hitMail)) {
                throw new IllegalArgumentException("User with provided hitmail already exists.");
            }
            userModel.setPassword(passwordEncoder.encode(userModel.getPassword()));
            return userRepo.save(userModel);
        } else {
            throw new IllegalArgumentException("Student not found with provided hitmail.");
        }
    }

    public List<UserModel> getUsers() {
        return userRepo.findAll();
    }*/
}
