/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.immutable_domain_model_assignment.Service.Crud.EquipmentCrud.Impl;

import com.karriem.tp2.immutable_domain_model_assignment.Domain.Model.Equipment.GeneralEquipment;
import com.karriem.tp2.immutable_domain_model_assignment.Service.Crud.EquipmentCrud.GeneralEquipmentCrudService;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author karriem
 */
public class GeneralEquipmentCrudServiceImpl implements GeneralEquipmentCrudService{

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public GeneralEquipment find(String id) {
        
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public GeneralEquipment persist(GeneralEquipment entity) {
        
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public GeneralEquipment merge(GeneralEquipment entity) {
        
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public GeneralEquipment remove(GeneralEquipment entity) {
        
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<GeneralEquipment> findAll() {
        
        return null;
    }

    
    
}
