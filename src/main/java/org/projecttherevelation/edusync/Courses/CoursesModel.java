package org.projecttherevelation.edusync.Courses;


import jakarta.persistence.*;

@Entity(name = "courses")

public class CoursesModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String courseId;
    @Column
    private String courseName;
    @Column
    private String department;
    @Column
    private String programme;
    @Column
    private String lecturerId;
    @Column private int numberOfStudents;




}
