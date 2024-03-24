package org.projecttherevelation.edusync.Lecturers;


import org.projecttherevelation.edusync.Courses.CoursesModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Lecturerapi")
public class LecturerController {
    @Autowired
    private LecturerService lecturerService;

    @PostMapping("/save")
    public LecturerModel saveLecturer(@RequestBody LecturerModel lecturerModel){
        LecturerModel createLecturer=lecturerService.saveLecturer(lecturerModel);
        System.out.println("Lecturer created successfully with ID: " + createLecturer.getLecturerId());
        return createLecturer;
    }
    @DeleteMapping("/delete/{id}")
    public String deleteLecturer(@PathVariable Long id){
        lecturerService.deleteLecturer(id);
        return "deleted";
    }
    @GetMapping("/getAll")
    public List<LecturerModel>getAll(){
        return lecturerService.getAllLecturers();
    }
}
