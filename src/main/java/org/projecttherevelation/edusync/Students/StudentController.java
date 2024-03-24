package org.projecttherevelation.edusync.Students;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/StudentApi")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/save")
    public StudentModel saveStudent(@RequestBody StudentModel studentModel){
        StudentModel createStudent=studentService.saveStudents(studentModel);
        System.out.println("Student Created: "+createStudent.getHitMail());
      return  createStudent;
    }
    @DeleteMapping("/delete/{id}")
    public String deleteStudent(@PathVariable Long id){
        studentService.deleteStudent(id);
        return "deleted...";
    }
    @GetMapping("/findAll")
    public List<StudentModel> find(){
        return studentService.findAll();
    }
    @GetMapping("/getById/{hitMail}")
    public Optional<StudentModel>findById(@PathVariable String hitMail){
        return studentService.findById(hitMail);
    }
}
