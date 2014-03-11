/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.immutable_domain_model_assignment.Config.MedicineConfig;

import com.karriem.tp2.immutable_domain_model_assignment.Service.Crud.MedicineCrud.Impl.MedicineCrudServiceImpl;
import com.karriem.tp2.immutable_domain_model_assignment.Service.Crud.MedicineCrud.MedicineCrudService;
import com.karriem.tp2.immutable_domain_model_assignment.Service.Impl.MedicineServiceImpl.MedicineServiceImpl;
import com.karriem.tp2.immutable_domain_model_assignment.Service.MedicineService.MedicineService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author karriem
 */
@Configuration
public class MedicineConfig {
    
    @Bean (name = "medicine")
    public MedicineService getmed(){
        
        return new MedicineServiceImpl();
    }
    
    @Bean (name = "MedicineCrud")
    public MedicineCrudService getMedicineCrud(){
        
        return new MedicineCrudServiceImpl();
    }
}
