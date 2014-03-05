/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.immutable_domain_model_assignment.Domain.Model.Employees;

/**
 *
 * @author karriem
 */
public final class DoctorsPersonal {
    
    private static String id;
    private static String docID;
    private static String firstName;
    private static String lastName;
    private static int age;
    private static String jobDescription;
    private static String postalAddress;
    private static String cellNumber;

    public DoctorsPersonal(Builder builder){
        
        id = builder.id;
        docID = builder.docID;
        firstName = builder.firstName;
        lastName = builder.lastName;
        age = builder.age;
        jobDescription = builder.jobDescription;
        postalAddress = builder.postalAddress;
        cellNumber = builder.cellNumber;
    }
        
    public String getId() {
        return id;
    }

    public String getDocID() {
        return docID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public String getPostalAddress() {
        return postalAddress;
    }

    public String getCellNumber() {
        return cellNumber;
    }

    public static class Builder {
        
        private String id;
        private String docID;
        private String firstName;
        private String lastName;
        private int age;
        private String jobDescription;
        private String postalAddress;
        private String cellNumber;

        public Builder() {
        }

        public Builder id(String val){
            
            this.id = val;
            
            return this;
        }  
        
        public Builder docId(String val){
            
            this.docID = val;
            
            return this;
        }
        
        public Builder firstName(String val){
            
            this.firstName = val;
            
            return this;
        }
        
        public Builder lastName(String val){
            
            this.lastName = val;
            
            return this;
        }
        
        public Builder jobDescription(String val){
            
            this.jobDescription = val;
            
            return this;
        }
        
        public Builder age(int val){
            
            this.age = val;
            
            return this;
        }
        
        public Builder postalAddress(String val){
            
            this.postalAddress = val;
            
            return this;
        }
        
        public Builder cellNumber(String val){
            
            this.cellNumber = val;
            
            return this;
        }
        
        public DoctorsPersonal build(){
            
            return new DoctorsPersonal(this);
        }
        
        public Builder doctor(DoctorsPersonal doctor){
            
            this.id = doctor.getId();
            this.docID = doctor.getDocID();
            this.firstName = doctor.getFirstName();
            this.lastName = doctor.getLastName();
            this.age = doctor.getAge();
            this.jobDescription = doctor.getJobDescription();
            this.postalAddress = doctor.getPostalAddress();
            this.cellNumber = doctor.getCellNumber();
            
            return this;
        }
    }
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + (this.id != null ? this.id.hashCode() : 0);
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
        final DoctorsPersonal other = (DoctorsPersonal) obj;
        if ((this.id == null) ? (other.id != null) : !this.id.equals(other.id)) {
            return false;
        }
        return true;
    }   
}
