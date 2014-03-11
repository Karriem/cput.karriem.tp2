/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.immutable_domain_model_assignment.Service.Crud.EquipmentCrud.Impl;

import com.karriem.tp2.immutable_domain_model_assignment.Domain.Model.Equipment.MedicalEquipment;
import com.karriem.tp2.immutable_domain_model_assignment.Service.Crud.EquipmentCrud.MedicalEquipmentCrudService;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author karriem
 */
public class MedicalEquipmentCrudServiceImpl implements MedicalEquipmentCrudService{

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public MedicalEquipment find(String id) {
        
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public MedicalEquipment persist(MedicalEquipment entity) {
        
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public MedicalEquipment merge(MedicalEquipment entity) {
        
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public MedicalEquipment remove(MedicalEquipment entity) {
       
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<MedicalEquipment> findAll() {
       
        return null;
    }

   
    
}
