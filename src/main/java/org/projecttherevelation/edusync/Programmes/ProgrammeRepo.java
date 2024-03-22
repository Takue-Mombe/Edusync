package org.projecttherevelation.edusync.Programmes;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProgrammeRepo extends JpaRepository<ProgrammeModel,Long> {



}
