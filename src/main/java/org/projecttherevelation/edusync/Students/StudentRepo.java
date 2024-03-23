package org.projecttherevelation.edusync.Students;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepo extends JpaRepository<StudentModel,Long> {
    Optional<StudentModel>findByHitMail(String hitMail);
}
