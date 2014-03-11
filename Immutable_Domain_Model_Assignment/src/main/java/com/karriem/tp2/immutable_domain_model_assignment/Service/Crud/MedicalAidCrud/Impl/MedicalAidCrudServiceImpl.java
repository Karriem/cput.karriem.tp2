/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.immutable_domain_model_assignment.Service.Crud.MedicalAidCrud.Impl;

import com.karriem.tp2.immutable_domain_model_assignment.Domain.Model.MedicalAid.MedicalAid;
import com.karriem.tp2.immutable_domain_model_assignment.Service.Crud.MedicalAidCrud.MedicalAidCrudService;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author karriem
 */
public class MedicalAidCrudServiceImpl implements MedicalAidCrudService{

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public MedicalAid find(String id) {
        
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public MedicalAid persist(MedicalAid entity) {
        
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public MedicalAid merge(MedicalAid entity) {
        
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public MedicalAid remove(MedicalAid entity) {
        
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<MedicalAid> findAll() {
        
        return null;
    }

}
