/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.cput.tp.student;

/**
 *
 * @author uchiha-clan
 */
public class StudentDetails {
    
    private String firstName;
    private String lastName;
    private String studNo;
    private String phoneNo;

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

    public String getStudNo() {
        return studNo;
    }

    public void setStudNo(String studNo) {
        this.studNo = studNo;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + (this.firstName != null ? this.firstName.hashCode() : 0);
        hash = 97 * hash + (this.lastName != null ? this.lastName.hashCode() : 0);
        hash = 97 * hash + (this.studNo != null ? this.studNo.hashCode() : 0);
        hash = 97 * hash + (this.phoneNo != null ? this.phoneNo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final StudentDetails other = (StudentDetails) obj;
        if ((this.firstName == null) ? (other.firstName != null) : !this.firstName.equals(other.firstName)) {
            return false;
        }
        if ((this.lastName == null) ? (other.lastName != null) : !this.lastName.equals(other.lastName)) {
            return false;
        }
        if ((this.studNo == null) ? (other.studNo != null) : !this.studNo.equals(other.studNo)) {
            return false;
        }
        if ((this.phoneNo == null) ? (other.phoneNo != null) : !this.phoneNo.equals(other.phoneNo)) {
            return false;
        }
        return true;
     }  
}
