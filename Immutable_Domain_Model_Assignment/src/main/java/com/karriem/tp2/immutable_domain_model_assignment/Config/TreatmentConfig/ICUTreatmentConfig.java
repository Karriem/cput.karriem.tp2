/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.immutable_domain_model_assignment.Config.TreatmentConfig;

import com.karriem.tp2.immutable_domain_model_assignment.Service.Crud.TreatmentCrud.ICUTreatmentCrudService;
import com.karriem.tp2.immutable_domain_model_assignment.Service.Crud.TreatmentCrud.Impl.ICUTreatmentCrudServiceImpl;
import com.karriem.tp2.immutable_domain_model_assignment.Service.Impl.TreatmentServiceImpl.ICUTreatmentServiceImpl;
import com.karriem.tp2.immutable_domain_model_assignment.Service.TreatmentService.ICUTreatmentService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author karriem
 */
@Configuration
public class ICUTreatmentConfig {
    
    @Bean (name = "ICUTreat")
    public ICUTreatmentService getICU(){
        
        return new ICUTreatmentServiceImpl();
    }
    
    @Bean (name ="ICUCrud")
    public ICUTreatmentCrudService getICUCrud(){
        
        return new ICUTreatmentCrudServiceImpl();
    }
}
