package org.projecttherevelation.edusync.Lecturers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class LecturerService {

    @Autowired
    private LecturerRepo lecturerRepo;

    public List<LecturerModel>getAllLecturers(){
        return lecturerRepo.findAll();
    }
    public LecturerModel saveLecturer(LecturerModel lecturerModel){
     return   lecturerRepo.save(lecturerModel);
    }
    public void deleteLecturer(@PathVariable Long id){
        lecturerRepo.deleteById(id);
    }

}
