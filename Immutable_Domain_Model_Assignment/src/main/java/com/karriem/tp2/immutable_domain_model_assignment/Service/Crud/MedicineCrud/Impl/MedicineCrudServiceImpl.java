/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.immutable_domain_model_assignment.Service.Crud.MedicineCrud.Impl;

import com.karriem.tp2.immutable_domain_model_assignment.Domain.Model.Medicine.Medicine;
import com.karriem.tp2.immutable_domain_model_assignment.Service.Crud.MedicineCrud.MedicineCrudService;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author karriem
 */
public class MedicineCrudServiceImpl implements MedicineCrudService{

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public Medicine find(String id) {
        
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public Medicine persist(Medicine entity) {
        
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Medicine merge(Medicine entity) {
        
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Medicine remove(Medicine entity) {
        
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<Medicine> findAll() {
        
        return null;
    }

    
}
