package org.projecttherevelation.edusync.Programmes;

import jakarta.persistence.*;

@Entity(name = "programmes")
public class ProgrammeModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String ProgrammeName;
    @Column private String Department;
    @Column private String Chairperson;

}
