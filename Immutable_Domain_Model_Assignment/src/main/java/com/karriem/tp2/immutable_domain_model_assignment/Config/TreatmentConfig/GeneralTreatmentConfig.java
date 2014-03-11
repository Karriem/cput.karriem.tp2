/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.immutable_domain_model_assignment.Config.TreatmentConfig;

import com.karriem.tp2.immutable_domain_model_assignment.Service.Crud.TreatmentCrud.GeneralTreatmentCrudService;
import com.karriem.tp2.immutable_domain_model_assignment.Service.Crud.TreatmentCrud.Impl.GeneralTreatmentCrudServiceImpl;
import com.karriem.tp2.immutable_domain_model_assignment.Service.Impl.TreatmentServiceImpl.GeneralTreatmentServiceImpl;
import com.karriem.tp2.immutable_domain_model_assignment.Service.TreatmentService.GeneralTreatmentService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author karriem
 */
@Configuration
public class GeneralTreatmentConfig {
    
    @Bean (name = "genTreat")
    public GeneralTreatmentService getGeneral(){
        
        return new GeneralTreatmentServiceImpl();
    }
    
    @Bean (name = "generalTreatmentCrud")
    public GeneralTreatmentCrudService getGeneralTreatCrud(){
        
        return new GeneralTreatmentCrudServiceImpl();
    }
}
