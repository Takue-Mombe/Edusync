package org.projecttherevelation.edusync.Courses;

import org.apache.catalina.LifecycleState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
public class CourseService {

    @Autowired
    private CourseRepo courseRepo;

    public Optional<CoursesModel>findById(Long id){
        return courseRepo.findById(id);
    }
    public CoursesModel saveCourses(CoursesModel coursesModel){

        return courseRepo.save(coursesModel);
    }
    public List<CoursesModel>findAll(){
        return courseRepo.findAll();
    }
    public void deleteById(@PathVariable Long courseId){
         courseRepo.deleteById(courseId);
    }
}
