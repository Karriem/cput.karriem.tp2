/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.immutable_domain_model_assignment.Service.Crud.TreatmentCrud.Impl;

import com.karriem.tp2.immutable_domain_model_assignment.Domain.Model.Treatment.GeneralTreatments;
import com.karriem.tp2.immutable_domain_model_assignment.Service.Crud.TreatmentCrud.GeneralTreatmentCrudService;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author karriem
 */
public class GeneralTreatmentCrudServiceImpl implements GeneralTreatmentCrudService{

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public GeneralTreatments find(String id) {
        
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public GeneralTreatments persist(GeneralTreatments entity) {
        
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public GeneralTreatments merge(GeneralTreatments entity) {
        
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public GeneralTreatments remove(GeneralTreatments entity) {
        
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<GeneralTreatments> findAll() {
        
        return null;
    }

   
    
}
