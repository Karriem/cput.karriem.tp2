/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.immutable_domain_model_assignment.Domain.Model.Patients;

/**
 *
 * @author karriem
 */
public final class ICUPatients{
 
    private static String id;
    private static String patID;
    private static String firstName;
    private static String lastName;
    private static int age;
    private static String address;
    private static String cellNumber;
    private static String illness;
    private static String treatment;
    private static String doctorID;
    private static String medicine;
    private static String bedNumber;

    public ICUPatients(Builder builder) {
        
        id = builder.id;
        patID = builder.patID;
        firstName = builder.firstName;
        lastName = builder.lastName;
        age = builder.age;
        address = builder.address;
        cellNumber = builder.cellNumber;
        illness = builder.illness;
        treatment = builder.treatment;
        doctorID = builder.doctorID;
        medicine = builder.medicine;
        bedNumber = builder.bedNumber;
    }

    public static String getBedNumber() {
        return bedNumber;
    }

    public static String getMedicine() {
        return medicine;
    }

    public static String getId() {
        return id;
    }

    public static String getPatID() {
        return patID;
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

    public static String getAddress() {
        return address;
    }

    public static String getCellNumber() {
        return cellNumber;
    }

    public static String getIllness() {
        return illness;
    }

    public static String getTreatment() {
        return treatment;
    }

    public static String getDoctorID() {
        return doctorID;
    }

    public static class Builder{
        
        private String id;
        private String patID;
        private String firstName;
        private String lastName;
        private int age;
        private String address;
        private String cellNumber;
        private String illness;
        private String treatment;
        private String doctorID;
        private String medicine;  
        private String bedNumber;
        
        public Builder id(String val){
            
            this.id = val;
            
            return this;
        }
        
        public Builder patID(String val){
            
            this.patID = val;
            
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
        public Builder address(String val){
            
            this.address = val;
            
            return this;
        }
        public Builder cellNumber(String val){
            
            this.cellNumber = val;
            
            return this;
        }
        public Builder illness(String val){
            
            this.illness = val;
            
            return this;
        }
        public Builder treatment(String val){
            
            this.treatment = val;
            
            return this;
        }
        public Builder doctorID(String val){
            
            this.doctorID = val;
            
            return this;
        }
        public Builder medicine(String val){
            
            this.medicine = val;
            
            return this;
        }
        
        public Builder bedNumber(String val){
            
            this.bedNumber = val;
            
            return this;
        }
        
        public ICUPatients build(){
            
            return new ICUPatients(this);
        }
        
        public Builder icuPatients(ICUPatients icu){
            
            this.id = icu.getId();
            this.patID = icu.getPatID();
            this.firstName = icu.getFirstName();
            this.lastName = icu.getLastName();
            this.age = icu.getAge();
            this.address = icu.getAddress();
            this.cellNumber = icu.getCellNumber();
            this.illness = icu.getIllness();
            this.treatment = icu.getTreatment();
            this.medicine = icu.getMedicine();
            this.doctorID = icu.getDoctorID();
            this.bedNumber = icu.getBedNumber();
            
            return this;
        }
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + (this.id != null ? this.id.hashCode() : 0);
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
        final ICUPatients other = (ICUPatients) obj;
        if ((this.id == null) ? (other.id != null) : !this.id.equals(other.id)) {
            return false;
        }
        return true;
    }
    
    
}
