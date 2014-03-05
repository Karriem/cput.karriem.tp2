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
public final class NursesPersonal {
    
    private static String id;
    private static String nurID;
    private static String firstName;
    private static String lastName;
    private static int age;
    private static String jobDescription;
    private static String postalAddress;
    private static String cellNumber;
    private static String ward;

    private NursesPersonal(Builder builder) {
        
        id = builder.id;
        nurID = builder.nurID;
        firstName = builder.firstName;
        lastName = builder.lastName;
        age = builder.age;
        jobDescription = builder.jobDescription;
        postalAddress = builder.postalAddress;
        cellNumber = builder.cellNumber;
        ward = builder.ward;
    }
    
    public static String getId() {
        return id;
    }

    public static String getNurID() {
        return nurID;
    }

    public static String getFirstName() {
        return firstName;
    }

    public static String getLastName() {
        return lastName;
    }

    public static int getAge() {
        return age;
    }

    public static String getJobDescription() {
        return jobDescription;
    }

    public static String getPostalAddress() {
        return postalAddress;
    }

    public static String getCellNumber() {
        return cellNumber;
    }

    public static String getWard() {
        return ward;
    }    
   
    public static class Builder{
        
        private String id;
        private String nurID;
        private String firstName;
        private String lastName;
        private int age;
        private String jobDescription;
        private String postalAddress;
        private String cellNumber;
        private String ward;

        public Builder() {
            
        }
        
        public Builder id(String val){
            
            this.id = val;
            
            return this;
        }
        
        public Builder nurID(String val){
            
            this.nurID = val;
            
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
        
        public Builder age(int val){
            
            this.age = val;
            
            return this;
        }
        
        public Builder jobDescription(String val){
            
            this.jobDescription = val;
            
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
        
        public Builder ward(String val){
            
            this.ward = val;
            
            return this;
        }
        
        public NursesPersonal build(){
            
            return new NursesPersonal(this);
        }
        
        public Builder nurse(NursesPersonal nurse){
            
            this.id = nurse.getId();
            this.nurID = nurse.getNurID();
            this.firstName = nurse.getFirstName();
            this.lastName = nurse.getLastName();
            this.age = nurse.getAge();
            this.jobDescription = nurse.getJobDescription();
            this.postalAddress = nurse.getPostalAddress();
            this.cellNumber = nurse.getCellNumber();
            this.ward = nurse.getWard();
            
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
        final NursesPersonal other = (NursesPersonal) obj;
        if ((this.id == null) ? (other.id != null) : !this.id.equals(other.id)) {
            return false;
        }
        return true;
    }
}
