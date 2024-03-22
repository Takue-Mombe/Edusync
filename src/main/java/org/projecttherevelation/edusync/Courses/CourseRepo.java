package org.projecttherevelation.edusync.Courses;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CourseRepo extends JpaRepository<CoursesModel,Long> {
    Optional<CoursesModel> findByCourseId(String courseId);
}
