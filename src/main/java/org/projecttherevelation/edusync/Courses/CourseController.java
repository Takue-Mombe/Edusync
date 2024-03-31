package org.projecttherevelation.edusync.Courses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/courses")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @PostMapping("/save")
    public String saveCoursesModel(@ModelAttribute("coursesModel") CoursesModel coursesModel){
        CoursesModel createCourse = courseService.saveCourses(coursesModel);
        System.out.println("Event created successfully with ID: " + createCourse.getCourseId());
        return "redirect:/courses/all";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteCourse(@PathVariable Long id){
        courseService.deleteById(id);
        System.out.println("deleted");
        return "redirect:/courses/all";
    }


    @GetMapping("/all")
    public String getAllCourse(Model model){
        List<CoursesModel> courses = courseService.findAll();
        model.addAttribute("courses", courses);
        return "courses-list";
    }

    @GetMapping("/getCourse/{id}")
    public String getCourse(@PathVariable Long id, Model model){
        Optional<CoursesModel> course = courseService.findById(id);
        if (course.isPresent()) {
            model.addAttribute("course", course.get());
        }
        return "course-details";
    }
}
