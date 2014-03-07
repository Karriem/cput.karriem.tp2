/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.immutable_domain_model_assignment.Domain.Model.Suppliers;

/**
 *
 * @author karriem
 */
public final class MedicalSupplies {
    
    private static String id;
    private static String suppliersID;
    private static String suppliersName;
    private static String equipmentID;
    private static String description;
    private static String date;
    private static int amt;
    private static int cost;
    
    public MedicalSupplies(Builder builder){
        
        id = builder.id;
        suppliersID = builder.suppliersID;
        suppliersName = builder.suppliersName;
        equipmentID = builder.equipmentID;
        description = builder.description;
        amt = builder.amt;
        date = builder.date;
        cost = builder.cost;
    }

    public static String getSuppliersName() {
        return suppliersName;
    }

    public static String getId() {
        return id;
    }

    public static String getSuppliersID() {
        return suppliersID;
    }

    public static String getEquipmentID() {
        return equipmentID;
    }

    public static String getDescription() {
        return description;
    }

    public static String getDate() {
        return date;
    }

    public static int getAmt() {
        return amt;
    }

    public static int getCost() {
        return cost;
    }
    
    public static class Builder{
        
        private String id;
        private String suppliersID;
        private String equipmentID;
        private String description;
        private String date;
        private int amt;
        private int cost;
        private String suppliersName;
        
        public Builder id(String val){
            
            this.id = val;
            
            return this;
        }
        
        public Builder suppliersID(String val){
            
            this.suppliersID = val;
            
            return this;
        }
        
        public Builder equipmentID(String val){
            
            this.equipmentID = val;
            
            return this;
        }
        
        public Builder description(String val){
            
            this.description = val;
            
            return this;
        }
        
        public Builder date(String val){
            
            this.date = val;
            
            return this;
        }
        
        public Builder amt(int val){
            
            this.amt = val;
            
            return this;
        }
        
        public Builder cost(int val){
            
            this.cost = val;
            
            return this;
        }
        
        public Builder suppliersName(String val){
            
            this.suppliersName = val;
            
            return this;
        }
        
        public MedicalSupplies build(){
            
            return new MedicalSupplies(this);
        }
        
        public Builder medSupplier(MedicalSupplies medS){
            
            this.id = medS.getId();
            this.suppliersID = medS.getSuppliersID();
            this.equipmentID = medS.getEquipmentID();
            this.description = medS.getDescription();
            this.date = medS.getDate();
            this.amt = medS.getAmt();
            this.cost = medS.getCost();
            this.suppliersName = medS.getSuppliersName();
            
            return this;
        }
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + (this.id != null ? this.id.hashCode() : 0);
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
        final MedicalSupplies other = (MedicalSupplies) obj;
        if ((this.id == null) ? (other.id != null) : !this.id.equals(other.id)) {
            return false;
        }
        return true;
    }
    
}
