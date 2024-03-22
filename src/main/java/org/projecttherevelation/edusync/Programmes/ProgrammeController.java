package org.projecttherevelation.edusync.Programmes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("programme")
public class ProgrammeController {
    @Autowired
    private ProgrammeService programmeService;

    @PostMapping("/save")
    public String programmeModel(ProgrammeModel programmeModel){
        programmeService.saveProgramme(programmeModel);
        return "Saved...";

    }

    @GetMapping("/getALlProgrammes")
    public List<ProgrammeModel> getAllProgrammes()
    {
        return programmeService.getAllProgrammes();
    }

    @DeleteMapping("/delete/{id}")
    public String deleteProgram(@PageableDefault Long id){

        programmeService.deleteById(id);
        return "Deleted....";
    }

}
