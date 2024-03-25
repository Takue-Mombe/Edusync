package org.projecttherevelation.edusync.Students;


import org.projecttherevelation.edusync.Courses.CourseService;
import org.projecttherevelation.edusync.Courses.CoursesModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/StudentApi")
public class StudentController {

    @Autowired
    private StudentService studentService;


    @PostMapping("/save")
    public String saveStudent(@ModelAttribute StudentModel studentModel){
        StudentModel createStudent = studentService.saveStudents(studentModel);
        System.out.println("Student Created: " + createStudent.getHitMail());
        return "redirect:/StudentApi/students/all"; // Redirect to the student list page after saving
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
    @GetMapping("/students/all")
    public String getAllStudents(Model model) {
        // Retrieve all student data from the database
        List<StudentModel> students = studentService.findAll();

        // Add the list of students to the model
        model.addAttribute("students", students);

        // Return the name of your Thymeleaf template
        return "student-list";
    }

    @GetMapping("/getById/{hitMail}")
    public Optional<StudentModel>findById(@PathVariable String hitMail){
        return studentService.findById(hitMail);
    }
}
