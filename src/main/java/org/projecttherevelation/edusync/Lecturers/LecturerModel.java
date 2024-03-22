package org.projecttherevelation.edusync.Lecturers;


import jakarta.persistence.*;

import java.util.Date;

@Entity(name = "lecturers")
public class LecturerModel {

       @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;

        @Column(unique = true)
        private String lecturerId;

        @Column
        private String lecturerName;

        @Column
        private String dateOfBirth;

        @Column
        private String email;

        @Column
        private String phoneNumber;

        @Column
        private String address;

        @Column
        private String department;

        @Temporal(TemporalType.DATE)
        @Column
        private Date hireDate;

        @Column
        private String highestDegree;

        @Column
        private String researchInterest;





         }
