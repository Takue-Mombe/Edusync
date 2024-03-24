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
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHitMail() {
        return hitMail;
    }

    public void setHitMail(String hitMail) {
        this.hitMail = hitMail;
    }

    public String getYearEnrolled() {
        return yearEnrolled;
    }

    public void setYearEnrolled(String yearEnrolled) {
        this.yearEnrolled = yearEnrolled;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getProgramme() {
        return programme;
    }

    public void setProgramme(String programme) {
        this.programme = programme;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNextOfKin() {
        return nextOfKin;
    }

    public void setNextOfKin(String nextOfKin) {
        this.nextOfKin = nextOfKin;
    }

    public String getGuardianNumber() {
        return GuardianNumber;
    }

    public void setGuardianNumber(String guardianNumber) {
        GuardianNumber = guardianNumber;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }



}
