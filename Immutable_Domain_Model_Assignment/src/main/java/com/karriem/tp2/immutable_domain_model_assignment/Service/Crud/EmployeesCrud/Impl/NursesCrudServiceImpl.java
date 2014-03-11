/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.immutable_domain_model_assignment.Service.Crud.EmployeesCrud.Impl;

import com.karriem.tp2.immutable_domain_model_assignment.Domain.Model.Employees.NursesPersonal;
import com.karriem.tp2.immutable_domain_model_assignment.Service.Crud.EmployeesCrud.NursesCrudService;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author karriem
 */
public class NursesCrudServiceImpl implements NursesCrudService{

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public NursesPersonal find(String id) {
              
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public NursesPersonal persist(NursesPersonal entity) {
              
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public NursesPersonal merge(NursesPersonal entity) {
              
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public NursesPersonal remove(NursesPersonal entity) {
              
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<NursesPersonal> findAll() {
              
        return null;
    }


}
