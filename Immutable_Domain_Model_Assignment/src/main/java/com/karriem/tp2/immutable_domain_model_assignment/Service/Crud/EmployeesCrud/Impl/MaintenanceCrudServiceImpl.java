/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.immutable_domain_model_assignment.Service.Crud.EmployeesCrud.Impl;

import com.karriem.tp2.immutable_domain_model_assignment.Domain.Model.Employees.MaintenancePersonal;
import com.karriem.tp2.immutable_domain_model_assignment.Service.Crud.EmployeesCrud.MaintenanceCrudService;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author karriem
 */
public class MaintenanceCrudServiceImpl implements MaintenanceCrudService{

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public MaintenancePersonal find(String id) {
            
        return null;
    }
    
    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public MaintenancePersonal persist(MaintenancePersonal entity) {
            
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public MaintenancePersonal merge(MaintenancePersonal entity) {
            
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public MaintenancePersonal remove(MaintenancePersonal entity) {
            
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<MaintenancePersonal> findAll() {
            
        return null;
    }
    
}
