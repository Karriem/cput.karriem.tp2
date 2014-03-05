/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.immutable_domain_model_assignment.Config.EmployeesConfig;

import com.karriem.tp2.immutable_domain_model_assignment.Service.EmployeesService.DoctorService;
import com.karriem.tp2.immutable_domain_model_assignment.Service.Impl.EmployeesImpl.DoctorServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 *
 * @author karriem
 */
@Configuration
public class DoctorConfig {
    
    @Bean (name = "createDoc")    
    public DoctorService getDoctor(){
        
        return new DoctorServiceImpl();
    }
}
