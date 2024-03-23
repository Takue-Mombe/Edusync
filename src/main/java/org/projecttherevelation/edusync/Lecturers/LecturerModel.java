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

 public Long getId() {
  return id;
 }

 public void setId(Long id) {
  this.id = id;
 }

 public String getLecturerId() {
  return lecturerId;
 }

 public void setLecturerId(String lecturerId) {
  this.lecturerId = lecturerId;
 }

 public String getLecturerName() {
  return lecturerName;
 }

 public void setLecturerName(String lecturerName) {
  this.lecturerName = lecturerName;
 }

 public String getDateOfBirth() {
  return dateOfBirth;
 }

 public void setDateOfBirth(String dateOfBirth) {
  this.dateOfBirth = dateOfBirth;
 }

 public String getEmail() {
  return email;
 }

 public void setEmail(String email) {
  this.email = email;
 }

 public String getPhoneNumber() {
  return phoneNumber;
 }

 public void setPhoneNumber(String phoneNumber) {
  this.phoneNumber = phoneNumber;
 }

 public String getAddress() {
  return address;
 }

 public void setAddress(String address) {
  this.address = address;
 }

 public String getDepartment() {
  return department;
 }

 public void setDepartment(String department) {
  this.department = department;
 }

 public Date getHireDate() {
  return hireDate;
 }

 public void setHireDate(Date hireDate) {
  this.hireDate = hireDate;
 }

 public String getHighestDegree() {
  return highestDegree;
 }

 public void setHighestDegree(String highestDegree) {
  this.highestDegree = highestDegree;
 }

 public String getResearchInterest() {
  return researchInterest;
 }

 public void setResearchInterest(String researchInterest) {
  this.researchInterest = researchInterest;
 }

 @Column
        private String researchInterest;





         }
