/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.immutable_domain_model_assignment.Service.Crud.TreatmentCrud.Impl;

import com.karriem.tp2.immutable_domain_model_assignment.Domain.Model.Treatment.ICUTreatment;
import com.karriem.tp2.immutable_domain_model_assignment.Service.Crud.TreatmentCrud.ICUTreatmentCrudService;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author karriem
 */
public class ICUTreatmentCrudServiceImpl implements ICUTreatmentCrudService{

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public ICUTreatment find(String id) {
        
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public ICUTreatment persist(ICUTreatment entity) {
        
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public ICUTreatment merge(ICUTreatment entity) {
        
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public ICUTreatment remove(ICUTreatment entity) {
        
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<ICUTreatment> findAll() {
        
        return null;
    }

}
