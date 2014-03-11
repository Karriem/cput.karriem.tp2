/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.immutable_domain_model_assignment.Config.PatientsConfig;

import com.karriem.tp2.immutable_domain_model_assignment.Service.Crud.PatientsCrud.GeneralPatientCrudService;
import com.karriem.tp2.immutable_domain_model_assignment.Service.Crud.PatientsCrud.Impl.GeneralPatientCrudServiceImpl;
import com.karriem.tp2.immutable_domain_model_assignment.Service.Impl.PatientsServcieImpl.GeneralPatientServiceImpl;
import com.karriem.tp2.immutable_domain_model_assignment.Service.PatientsService.GeneralPatientService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author karriem
 */
@Configuration
public class GeneralPatientConfig {
    
    @Bean (name = "genPat")
    public GeneralPatientService getGen(){
        
        return new GeneralPatientServiceImpl();
    }
    
    @Bean (name = "generalPatCrud")
    public GeneralPatientCrudService getGeneralCrud(){
        
        return new GeneralPatientCrudServiceImpl();
    }
}
