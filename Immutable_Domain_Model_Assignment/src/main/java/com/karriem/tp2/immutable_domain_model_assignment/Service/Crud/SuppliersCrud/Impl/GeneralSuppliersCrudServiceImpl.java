/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.immutable_domain_model_assignment.Service.Crud.SuppliersCrud.Impl;

import com.karriem.tp2.immutable_domain_model_assignment.Domain.Model.Suppliers.GeneralSupplies;
import com.karriem.tp2.immutable_domain_model_assignment.Service.Crud.SuppliersCrud.GeneralSuppliersCrudService;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author karriem
 */
public class GeneralSuppliersCrudServiceImpl implements GeneralSuppliersCrudService{

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public GeneralSupplies find(String id) {
        
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public GeneralSupplies persist(GeneralSupplies entity) {
        
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public GeneralSupplies merge(GeneralSupplies entity) {
        
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public GeneralSupplies remove(GeneralSupplies entity) {
        
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<GeneralSupplies> findAll() {
        
        return null;
    }

    
}
