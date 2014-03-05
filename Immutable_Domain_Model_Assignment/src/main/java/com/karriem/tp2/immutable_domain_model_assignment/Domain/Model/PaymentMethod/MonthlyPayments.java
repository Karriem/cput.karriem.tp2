/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.immutable_domain_model_assignment.Domain.Model.PaymentMethod;

/**
 *
 * @author karriem
 */
public final class MonthlyPayments {
    
    private static String id;
    private static String paymentID;
    private static int treatmentCost;
    private static int monthlyInstallments;
    private static String patientID;

    public MonthlyPayments(Builder builder){
        
        id = builder.id;
        paymentID = builder.paymentID;
        treatmentCost = builder.treatmentCost;
        monthlyInstallments = builder.monthlyInstallments;
        patientID = builder.patientID;
    }

    public static String getId() {
        return id;
    }

    public static String getPaymentID() {
        return paymentID;
    }

    public static int getTreatmentCost() {
        return treatmentCost;
    }

    public static int getMonthlyInstallments() {
        return monthlyInstallments;
    }

    public static String getPatientID() {
        return patientID;
    }
    
    public static class Builder{
        
        private String id;
        private String paymentID;
        private int treatmentCost;
        private int monthlyInstallments;
        private String patientID;
        
        public Builder id(String val){
            
            this.id = val;
            
            return this;
        }
        
        public Builder paymentID(String val){
            
            this.paymentID = val;
            
            return this;
        }
        
        public Builder treatmentCost(int val){
            
            this.treatmentCost = val;
            
            return this;
        }
        
        public Builder monthlyInstallments(int val){
            
            this.monthlyInstallments = val;
            
            return this;
        }
        
        public Builder patientID(String val){
            
            this.patientID = val;
            
            return this;
        }
        
        public MonthlyPayments build(){
            
            return new MonthlyPayments(this);
        }
        
        public Builder monthlyPayments(MonthlyPayments mp){
            
            this.id = mp.getId();
            this.paymentID = mp.getPaymentID();
            this.treatmentCost = mp.getTreatmentCost();
            this.monthlyInstallments = mp.getMonthlyInstallments();
            this.patientID = mp.getPatientID();
            
            return this;
        } 
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + (this.id != null ? this.id.hashCode() : 0);
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
        final MonthlyPayments other = (MonthlyPayments) obj;
        if ((this.id == null) ? (other.id != null) : !this.id.equals(other.id)) {
            return false;
        }
        return true;
    }
    
}
