/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.immutable_domain_model_assignment.Domain.Model.Equipment;

/**
 *
 * @author karriem
 */
public class MedicalEquipment {
    
    private static String id;
    private static String equipID;
    private static String equipName;
    private static int quantity;
    private static String condition;
    
    public MedicalEquipment(Builder builder){
        
        id = builder.id;
        equipID = builder.equipID;
        equipName = builder.equipName;
        quantity = builder.quantity;
        condition = builder.condition;
    }

    public static String getId() {
        return id;
    }

    public static String getEquipID() {
        return equipID;
    }

    public static String getEquipName() {
        return equipName;
    }

    public static int getQuantity() {
        return quantity;
    }

    public static String getCondition() {
        return condition;
    }
    
    public static class Builder{
        
        private String id;
        private String equipID;
        private String equipName;
        private int quantity;
        private String condition;
        
        public Builder id(String val){
            
            this.id = val;
            
            return this;
        }
        
        public Builder equipID(String val){
            
            this.equipID = val;
            
            return this;
        }
        
        public Builder equipName(String val){
            
            this.equipName = val;
            
            return this;
        }
        
        public Builder quantity(int val){
            
            this.quantity = val;
            
            return this;
        }
        
        public Builder condition(String val){
            
            this.condition = val;
            
            return this;
        }
        
        public MedicalEquipment build(){
            
            return new MedicalEquipment(this);
        }
        
        public Builder medEquipment(MedicalEquipment equip){
            
            this.id = equip.getId();
            this.equipID = equip.getEquipID();
            this.equipName = equip.getEquipName();
            this.quantity = equip.getQuantity();
            this.condition = equip.getCondition();
            
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
        final MedicalEquipment other = (MedicalEquipment) obj;
        if ((this.id == null) ? (other.id != null) : !this.id.equals(other.id)) {
            return false;
        }
        return true;
    }
    
}
