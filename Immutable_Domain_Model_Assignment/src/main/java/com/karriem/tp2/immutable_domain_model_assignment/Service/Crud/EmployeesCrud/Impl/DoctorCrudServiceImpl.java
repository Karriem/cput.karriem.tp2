/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.immutable_domain_model_assignment.Service.Crud.EmployeesCrud.Impl;

import com.karriem.tp2.immutable_domain_model_assignment.Domain.Model.Employees.DoctorsPersonal;
import com.karriem.tp2.immutable_domain_model_assignment.Service.Crud.EmployeesCrud.DoctorCrudService;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author karriem
 */
public class DoctorCrudServiceImpl implements DoctorCrudService{

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public DoctorsPersonal find(String id) {
        
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public DoctorsPersonal persist(DoctorsPersonal entity) {
        
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public DoctorsPersonal merge(DoctorsPersonal entity) {
        
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public DoctorsPersonal remove(DoctorsPersonal entity) {
       
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<DoctorsPersonal> findAll() {
        
        return null;
    }
    
}
