package org.projecttherevelation.edusync.Students;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    private StudentRepo studentRepo;

    public StudentModel saveStudents(StudentModel studentModel){
        return studentRepo.save(studentModel);
    }
    public void deleteStudent(@PathVariable Long id)
    {
        studentRepo.deleteById(id);
    }
    public List<StudentModel>findAll(){
        return studentRepo.findAll();
    }
    public Optional<StudentModel> findById(String hitmail){
        return studentRepo.findByHitMail(hitmail);
    }

}
