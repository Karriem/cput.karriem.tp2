/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.immutable_domain_model_assignment.Service.Crud.EmployeesCrud.Impl;

import com.karriem.tp2.immutable_domain_model_assignment.Domain.Model.Employees.GeneralStaffPersonal;
import com.karriem.tp2.immutable_domain_model_assignment.Service.Crud.EmployeesCrud.GeneralStaffCrudService;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author karriem
 */
public class GeneralStaffCrudServiceImpl implements GeneralStaffCrudService{

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public GeneralStaffPersonal find(String id) {
           
        return null;
    }
    
    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public GeneralStaffPersonal persist(GeneralStaffPersonal entity) {
           
        return null;
    }
    
    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public GeneralStaffPersonal merge(GeneralStaffPersonal entity) {
           
        return null;
    }
    
    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public GeneralStaffPersonal remove(GeneralStaffPersonal entity) {
          
        return null;
    }
    
    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<GeneralStaffPersonal> findAll() {
          
        return null;
    }

}
