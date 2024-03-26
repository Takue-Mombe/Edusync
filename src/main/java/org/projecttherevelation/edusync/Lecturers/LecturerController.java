package org.projecttherevelation.edusync.Lecturers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/LecturerApi")
public class LecturerController {
    @Autowired
    private LecturerService lecturerService;

    @PostMapping("/save")
    public String saveLecturer(@ModelAttribute("LecturerModel") LecturerModel lecturerModel){
        LecturerModel createLecturer=lecturerService.saveLecturer(lecturerModel);
        System.out.println("Lecturer created successfully with ID: " + createLecturer.getLecturerId());
        return "redirect:/LecturerApi/getAll";
    }
    @DeleteMapping("/delete/{id}")
    public String deleteLecturer(@PathVariable Long id){
        lecturerService.deleteLecturer(id);
        return "redirect:/LecturerApi/getAll";
    }
    @GetMapping("/getAll")
    public String getAll(Model model){
        List<LecturerModel>lecturer=lecturerService.getAllLecturers();
        model.addAttribute("lecturers",lecturer);
        return "table";
    }
    @GetMapping("/getByID/{id}")
    public String getLecturer(@PathVariable Long id, Model model){
       Optional<LecturerModel>lecturer=lecturerService.getLecturerId(id);
        return "Found";
    }
}
