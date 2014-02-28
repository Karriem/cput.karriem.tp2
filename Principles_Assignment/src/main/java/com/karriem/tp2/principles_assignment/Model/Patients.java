/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.principles_assignment.Model;

import java.util.List;

/**
 *
 * @author karriem
 */
public class Patients {
    
    private String patientID;
    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    private String treatmentRisk;
    private List<String> staffAssign;

    public List<String> getStaffAssign() {
        return staffAssign;
    }

    public void setStaffAssign(List<String> staffAssign) {
        this.staffAssign = staffAssign;
    }

    public String getTreatmentRisk() {
        return treatmentRisk;
    }

    public void setTreatmentRisk(String treatmentRisk) {
        this.treatmentRisk = treatmentRisk;
    }

    public String getPatientID() {
        return patientID;
    }

    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;        
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
}
