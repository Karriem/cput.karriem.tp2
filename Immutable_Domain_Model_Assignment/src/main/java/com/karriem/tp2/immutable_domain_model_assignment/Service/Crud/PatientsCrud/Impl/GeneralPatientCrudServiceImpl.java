/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.immutable_domain_model_assignment.Service.Crud.PatientsCrud.Impl;

import com.karriem.tp2.immutable_domain_model_assignment.Domain.Model.Patients.GeneralPatients;
import com.karriem.tp2.immutable_domain_model_assignment.Service.Crud.PatientsCrud.GeneralPatientCrudService;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author karriem
 */
public class GeneralPatientCrudServiceImpl implements GeneralPatientCrudService{

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public GeneralPatients find(String id) {
        
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public GeneralPatients persist(GeneralPatients entity) {
        
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public GeneralPatients merge(GeneralPatients entity) {
        
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public GeneralPatients remove(GeneralPatients entity) {
        
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<GeneralPatients> findAll() {
        
        return null;
    }

}
