/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.immutable_domain_model_assignment.Config.EmployeesConfig;

import com.karriem.tp2.immutable_domain_model_assignment.Service.Crud.EmployeesCrud.CleaningStaffCrudService;
import com.karriem.tp2.immutable_domain_model_assignment.Service.Crud.EmployeesCrud.Impl.CleaningStaffCrudServiceImpl;
import com.karriem.tp2.immutable_domain_model_assignment.Service.EmployeesService.CleaningStaffService;
import com.karriem.tp2.immutable_domain_model_assignment.Service.Impl.EmployeesServiceImpl.CleaningStaffServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author karriem
 */
@Configuration
public class CleaningStaffConfig {
    
    @Bean (name = "cleaner")
    public CleaningStaffService getCleaner(){
        
       return new CleaningStaffServiceImpl();
    }
    
    @Bean (name = "CleanCrud")
    public CleaningStaffCrudService getCleanCrud(){
        
        return new CleaningStaffCrudServiceImpl();
    }
}
