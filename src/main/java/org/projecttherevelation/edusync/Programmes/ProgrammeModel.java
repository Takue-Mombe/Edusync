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
    @Column private int numberOfStudents;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProgrammeName() {
        return ProgrammeName;
    }

    public void setProgrammeName(String programmeName) {
        ProgrammeName = programmeName;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public String getChairperson() {
        return Chairperson;
    }

    public void setChairperson(String chairperson) {
        Chairperson = chairperson;
    }
}
