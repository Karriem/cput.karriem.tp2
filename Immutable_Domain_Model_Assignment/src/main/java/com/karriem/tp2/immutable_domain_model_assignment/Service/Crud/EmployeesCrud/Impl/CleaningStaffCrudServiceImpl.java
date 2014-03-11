/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.immutable_domain_model_assignment.Service.Crud.EmployeesCrud.Impl;

import com.karriem.tp2.immutable_domain_model_assignment.Domain.Model.Employees.CleaningStaffPersonal;
import com.karriem.tp2.immutable_domain_model_assignment.Service.Crud.EmployeesCrud.CleaningStaffCrudService;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author karriem
 */
public class CleaningStaffCrudServiceImpl implements CleaningStaffCrudService{

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public CleaningStaffPersonal find(String id) {
         
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public CleaningStaffPersonal persist(CleaningStaffPersonal entity) {
        
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public CleaningStaffPersonal merge(CleaningStaffPersonal entity) {
        
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public CleaningStaffPersonal remove(CleaningStaffPersonal entity) {
         
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<CleaningStaffPersonal> findAll() {
         
        return null;
    }    
}
