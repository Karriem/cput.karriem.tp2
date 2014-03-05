/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.immutable_domain_model_assignment.Domain.Model.Treatment;

/**
 *
 * @author karriem
 */
public final class GeneralTreatments {
    
    private static String id;
    private static String treatmetnID;
    private static String treatmentDescription;
    private static String doctorID;
    private static String nurseID;
    private static String medicineID;
    private static int cost;
    
    public GeneralTreatments(Builder builder){
        
        id = builder.id;
        treatmetnID = builder.treatmetnID;
        treatmentDescription = builder.treatmentDescription;
        doctorID = builder.doctorID;
        nurseID = builder.nurseID;
        medicineID = builder.medicineID;
        cost = builder.cost;
    }

    public static String getId() {
        return id;
    }

    public static String getTreatmetnID() {
        return treatmetnID;
    }

    public static String getTreatmentDescription() {
        return treatmentDescription;
    }

    public static String getDoctorID() {
        return doctorID;
    }

    public static String getNurseID() {
        return nurseID;
    }

    public static String getMedicineID() {
        return medicineID;
    }

    public static int getCost() {
        return cost;
    }
    
    public static class Builder{
        
        private String id;
        private String treatmetnID;
        private String treatmentDescription;
        private String doctorID;
        private String nurseID;
        private String medicineID;
        private int cost;
        
        public Builder id(String val){
            
            this.id = val;
                    
            return this;        
        }
        
        public Builder treatmetnID(String val){
            
            this.treatmetnID = val;
                    
            return this;        
        }
        
        public Builder treatmentDescription(String val){
            
            this.treatmentDescription = val;
                    
            return this;        
        }
        
        public Builder doctorID(String val){
            
            this.doctorID = val;
                    
            return this;        
        }
        
        public Builder nurseID(String val){
            
            this.nurseID = val;
                    
            return this;        
        }
        
        public Builder medicineID(String val){
            
            this.medicineID = val;
                    
            return this;        
        }
        
        public Builder cost(int val){
            
            this.cost = val;
                    
            return this;        
        }
        
        public GeneralTreatments build(){
            
            return new GeneralTreatments(this);
        }
        
        public Builder genTreatment(GeneralTreatments genT){
            
            this.id = genT.getId();
            this.treatmetnID = genT.getTreatmetnID();
            this.treatmentDescription = genT.getTreatmentDescription();
            this.doctorID = genT.getDoctorID();
            this.nurseID = genT.getNurseID();
            this.medicineID = genT.getMedicineID();
            this.cost = genT.getCost();
            
            return this;
        }               
    }
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + (this.id != null ? this.id.hashCode() : 0);
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
        final GeneralTreatments other = (GeneralTreatments) obj;
        if ((this.id == null) ? (other.id != null) : !this.id.equals(other.id)) {
            return false;
        }
        return true;
    }
    
}
