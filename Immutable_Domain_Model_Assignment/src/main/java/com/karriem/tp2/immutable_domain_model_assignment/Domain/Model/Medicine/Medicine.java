/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.immutable_domain_model_assignment.Domain.Model.Medicine;

/**
 *
 * @author karriem
 */
public final class Medicine {
    
    private static String id;
    private static String medID;
    private static String medDescription;
    private static int quantity;
    
    public Medicine(Builder builder){
        
        id = builder.id;
        medID = builder.medID;
        medDescription = builder.medDescription;
        quantity = builder.quantity;
    }

    public static String getId() {
        return id;
    }

    public static String getMedID() {
        return medID;
    }

    public static String getMedDescription() {
        return medDescription;
    }

    public static int getQuantity() {
        return quantity;
    }
    
    public static class Builder{
    
        private String id;
        private String medID;
        private String medDescription;
        private int quantity;
        
        public Builder id(String val){
            
            this.id = val;
            
            return this;
        }
        
        public Builder medID(String val){
            
            this.medID = val;
            
            return this;
        }
        
        public Builder medDescription(String val){
            
            this.medDescription = val;
            
            return this;
        }
        
        public Builder quantity(int val){
            
            this.quantity = val;
            
            return this;
        }
        
        public Medicine build(){
            
            return new Medicine(this);
        }
        
        public Builder medicine(Medicine med){
            
            this.id = med.getId();
            this.medDescription = med.getMedDescription();
            this.medID = med.getMedID();
            this.quantity = med.getQuantity();
            
            return this;
        }
    }    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + (this.id != null ? this.id.hashCode() : 0);
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
        final Medicine other = (Medicine) obj;
        if ((this.id == null) ? (other.id != null) : !this.id.equals(other.id)) {
            return false;
        }
        return true;
    }
    
}
