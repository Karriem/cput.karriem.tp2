/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.immutable_domain_model_assignment.Config.PatientsConfig;

import com.karriem.tp2.immutable_domain_model_assignment.Service.Crud.PatientsCrud.ICUCrudService;
import com.karriem.tp2.immutable_domain_model_assignment.Service.Crud.PatientsCrud.Impl.ICUCrudServiceImpl;
import com.karriem.tp2.immutable_domain_model_assignment.Service.Impl.PatientsServcieImpl.ICUServcieImpl;
import com.karriem.tp2.immutable_domain_model_assignment.Service.PatientsService.ICUService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author karriem
 */
@Configuration
public class ICUConfig {
    
    @Bean (name = "ICU")
    public ICUService getICU(){
        
        return new ICUServcieImpl();
    }
    
    @Bean (name = "ICUCrud")
    public ICUCrudService getICUCrud(){
        
        return new ICUCrudServiceImpl();
    }
}
