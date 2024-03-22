package org.projecttherevelation.edusync.Lecturers;


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
     return lecturerService.saveLecturer(lecturerModel);
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
