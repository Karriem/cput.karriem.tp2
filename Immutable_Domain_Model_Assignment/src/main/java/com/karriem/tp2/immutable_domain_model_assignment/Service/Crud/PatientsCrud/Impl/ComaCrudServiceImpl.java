/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.immutable_domain_model_assignment.Service.Crud.PatientsCrud.Impl;

import com.karriem.tp2.immutable_domain_model_assignment.Domain.Model.Patients.ComaPatients;
import com.karriem.tp2.immutable_domain_model_assignment.Service.Crud.PatientsCrud.ComaCrudService;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author karriem
 */
public class ComaCrudServiceImpl implements ComaCrudService{

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public ComaPatients find(String id) {
        
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public ComaPatients persist(ComaPatients entity) {
        
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public ComaPatients merge(ComaPatients entity) {
        
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public ComaPatients remove(ComaPatients entity) {
        
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<ComaPatients> findAll() {
        
        return null;
    }

    
    
}
