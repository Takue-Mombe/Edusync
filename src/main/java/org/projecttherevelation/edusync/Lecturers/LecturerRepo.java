package org.projecttherevelation.edusync.Lecturers;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LecturerRepo extends JpaRepository<LecturerModel,Long> {
}
