/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.immutable_domain_model_assignment.Service.Crud.PatientsCrud.Impl;

import com.karriem.tp2.immutable_domain_model_assignment.Domain.Model.Patients.ICUPatients;
import com.karriem.tp2.immutable_domain_model_assignment.Service.Crud.PatientsCrud.ICUCrudService;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author karriem
 */
public class ICUCrudServiceImpl implements ICUCrudService{

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public ICUPatients find(String id) {
        
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public ICUPatients persist(ICUPatients entity) {
        
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public ICUPatients merge(ICUPatients entity) {
        
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public ICUPatients remove(ICUPatients entity) {
        
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<ICUPatients> findAll() {
        
        return null;
    }

}
