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
public final class TerminalPatients {
    
    private static String id;
    private static String patID;
    private static String firstName;
    private static String lastName;
    private static int age;
    private static String illness;
    private static String treatment;
    private static String medicine;
    private static String doctorID;
    private static String address;
    private static String cellNumber;
    private static String timeLeft;
    private static String bedNumber;

    public TerminalPatients (Builder builder){
        
        id = builder.id;
        patID = builder.patID;
        firstName = builder.firstName;
        lastName = builder.lastName;
        age = builder.age;
        illness = builder.illness;
        treatment = builder.treatment;
        medicine = builder.medicine;
        doctorID = builder.doctorID;
        address = builder.address;
        cellNumber = builder.cellNumber;
        timeLeft = builder.timeLeft;
        bedNumber = builder.bedNumber;
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

    public static String getIllness() {
        return illness;
    }

    public static String getTreatment() {
        return treatment;
    }

    public static String getMedicine() {
        return medicine;
    }

    public static String getDoctorID() {
        return doctorID;
    }

    public static String getAddress() {
        return address;
    }

    public static String getCellNumber() {
        return cellNumber;
    }

    public static String getTimeLeft() {
        return timeLeft;
    }

    public static String getBedNumber() {
        return bedNumber;
    }
    
    public static class Builder{
        
        private String id;
        private String patID;
        private String firstName;
        private String lastName;
        private int age;
        private String illness;
        private String treatment;
        private String medicine;
        private String doctorID;
        private String address;
        private String cellNumber;
        private String timeLeft;
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
        
        public Builder illness(String val){
            
            this.illness = val;
            
            return this;
        }
        
        public Builder treatment(String val){
            
            this.treatment = val;
            
            return this;
        }
        
        public Builder medicine(String val){
            
            this.medicine = val;
            
            return this;
        }
        
        public Builder doctorID(String val){
            
            this.doctorID = val;
            
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
        
        public Builder timeLeft(String val){
            
            this.timeLeft = val;
            
            return this;
        }
        
        public Builder bedNumber(String val){
            
            this.bedNumber = val;
            
            return this;
        }
        
        public TerminalPatients build(){
            
            return new TerminalPatients(this);
        }
        
        public Builder terminalPatients(TerminalPatients tPat){
            
            this.id = tPat.getId();
            this.patID = tPat.getPatID();
            this.firstName = tPat.getFirstName();
            this.lastName = tPat.getLastName();
            this.age = tPat.getAge();
            this.illness = tPat.getIllness();
            this.treatment = tPat.getTreatment();
            this.medicine = tPat.getMedicine();
            this.doctorID = tPat.getDoctorID();
            this.address = tPat.getAddress();
            this.cellNumber = tPat.cellNumber;
            this.timeLeft = tPat.getTimeLeft();
            this.bedNumber = tPat.getBedNumber();
            
            return this;
        }
    }
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + (this.id != null ? this.id.hashCode() : 0);
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
        final TerminalPatients other = (TerminalPatients) obj;
        if ((this.id == null) ? (other.id != null) : !this.id.equals(other.id)) {
            return false;
        }
        return true;
    }
}
