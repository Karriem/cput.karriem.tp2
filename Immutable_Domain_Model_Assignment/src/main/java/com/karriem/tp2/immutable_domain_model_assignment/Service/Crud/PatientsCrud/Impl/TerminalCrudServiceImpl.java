/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.immutable_domain_model_assignment.Service.Crud.PatientsCrud.Impl;

import com.karriem.tp2.immutable_domain_model_assignment.Domain.Model.Patients.TerminalPatients;
import com.karriem.tp2.immutable_domain_model_assignment.Service.Crud.PatientsCrud.TerminalCrudService;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author karriem
 */
public class TerminalCrudServiceImpl implements TerminalCrudService{

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public TerminalPatients find(String id) {
        
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public TerminalPatients persist(TerminalPatients entity) {
        
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public TerminalPatients merge(TerminalPatients entity) {
        
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public TerminalPatients remove(TerminalPatients entity) {
        
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<TerminalPatients> findAll() {
        
        return null;
    }
}
