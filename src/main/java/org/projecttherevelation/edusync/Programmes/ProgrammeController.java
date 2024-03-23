package org.projecttherevelation.edusync.Programmes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
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
