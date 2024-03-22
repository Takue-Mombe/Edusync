package org.projecttherevelation.edusync.Programmes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class ProgrammeService {
    @Autowired
    private ProgrammeRepo programmeRepo;

    public ProgrammeModel saveProgramme(ProgrammeModel programmeModel){
        return programmeRepo.save(programmeModel);
    }
    public void deleteById(Long id){
        programmeRepo.deleteById(id);
    }
    public List<ProgrammeModel> getAllProgrammes(){
        return programmeRepo.findAll();
    }
}
