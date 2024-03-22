package org.projecttherevelation.edusync.Courses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @PostMapping("/save")
    public CoursesModel saveCoursesModel(@RequestBody CoursesModel coursesModel){
        return  courseService.saveCourses(coursesModel);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteCourse(@PathVariable Long id){
        courseService.deleteById(id);
        System.out.println("deleted");
    }
    @GetMapping("/findAllCourses")
    public List<CoursesModel> getAllCourse(){
        return courseService.findAll();
    }
    @GetMapping("/getCourse/{id}")
    public Optional<CoursesModel>getCourse(@PathVariable Long id){
     return    courseService.findById(id);
    }
}
