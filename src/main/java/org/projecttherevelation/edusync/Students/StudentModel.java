package org.projecttherevelation.edusync.Students;

import jakarta.persistence.*;

@Entity(name = "students")
public class StudentModel {
    @Id@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String hitMail;
    @Column
    private String yearEnrolled;
    @Column
    private String firstName;
    @Column
    private String Status;
    @Column
    private String lastName;
    @Column
    private String programme;
    @Column
    private String department;
    @Column
    private String dateOfBirth;
    @Column
    private String phoneNumber;
    @Column
    private String email;
    @Column
    private String nextOfKin;
    @Column
    private String GuardianNumber;
    @Column
    private String Address;

}
