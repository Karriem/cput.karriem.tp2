/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.immutable_domain_model_assignment.Config.EmployeesConfig;

import com.karriem.tp2.immutable_domain_model_assignment.Service.Crud.EmployeesCrud.Impl.NursesCrudServiceImpl;
import com.karriem.tp2.immutable_domain_model_assignment.Service.Crud.EmployeesCrud.NursesCrudService;
import com.karriem.tp2.immutable_domain_model_assignment.Service.EmployeesService.NursesService;
import com.karriem.tp2.immutable_domain_model_assignment.Service.Impl.EmployeesServiceImpl.NursesServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author karriem
 */
@Configuration
public class NursesConfig {
    
    @Bean (name = "nur")
    public NursesService getNurse(){
        
        return new NursesServiceImpl();
    }
    
    @Bean (name = "nurseCrud")
    public NursesCrudService getNurseCrud(){
        
        return new NursesCrudServiceImpl();
    }
}
