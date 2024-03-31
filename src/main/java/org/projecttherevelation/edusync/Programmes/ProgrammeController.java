package org.projecttherevelation.edusync.Programmes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/programmeApi")
public class ProgrammeController {
    @Autowired
    private ProgrammeService programmeService;

    @PostMapping("/save")
    public String programmeModel(@RequestBody ProgrammeModel programmeModel){
        ProgrammeModel createProgramme = programmeService.saveProgramme(programmeModel);
        System.out.println("Event created successfully with ID: " + createProgramme.getId());
        return "Saved...";

    }

    @GetMapping("/getAll")
    public String getProgrammes(Model model){
        List<ProgrammeModel>programmes=programmeService.getAllProgrammes();
        model.addAttribute("programmes",programmes);
        return "Programmes";
    }
    @GetMapping("/getALlProgrammes")
    public List<ProgrammeModel> getAllProgrammes()
    {
        return programmeService.getAllProgrammes();
    }

    @DeleteMapping("/delete/{id}")
    public String deleteProgram(@PathVariable Long id){

        programmeService.deleteById(id);
        return "Deleted....";
    }

}
