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
public class MaintenancePersonal {
    
    private static String id;
    private static String mID;
    private static String firstName;
    private static String lastName;
    private static int age;
    private static String jobDescription;
    private static String postalAddress;
    private static String cellNumber;

    private MaintenancePersonal(Builder builder) {
        
        id = builder.id;
        mID = builder.mID;
        firstName = builder.firstName;
        lastName = builder.lastName;
        age = builder.age;
        jobDescription = builder.jobDescription;
        postalAddress = builder.postalAddress;
        cellNumber = builder.cellNumber;
    }
    
    public static String getId() {
        return id;
    }

    public static String getMID() {
        return mID;
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
   
    public static class Builder{
        
        private String id;
        private String mID;
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
        
        public Builder mID(String val){
            
            this.mID = val;
            
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
        
        public MaintenancePersonal build(){
            
            return new MaintenancePersonal(this);
        }
        
        public Builder maintenance(MaintenancePersonal mainten){
            
            this.id = mainten.getId();
            this.mID = mainten.getMID();
            this.firstName = mainten.getFirstName();
            this.lastName = mainten.getLastName();
            this.age = mainten.getAge();
            this.jobDescription = mainten.getJobDescription();
            this.postalAddress = mainten.getPostalAddress();
            this.cellNumber = mainten.getCellNumber();
            
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
        final MaintenancePersonal other = (MaintenancePersonal) obj;
        if ((this.id == null) ? (other.id != null) : !this.id.equals(other.id)) {
            return false;
        }
        return true;
    }
}
