/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.immutable_domain_model_assignment.Config.EmployeesConfig;

import com.karriem.tp2.immutable_domain_model_assignment.Service.Crud.EmployeesCrud.GeneralStaffCrudService;
import com.karriem.tp2.immutable_domain_model_assignment.Service.Crud.EmployeesCrud.Impl.GeneralStaffCrudServiceImpl;
import com.karriem.tp2.immutable_domain_model_assignment.Service.EmployeesService.GeneralStaffService;
import com.karriem.tp2.immutable_domain_model_assignment.Service.Impl.EmployeesServiceImpl.GeneralStaffServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author karriem
 */
@Configuration
public class GeneralStaffConfig {
    
    @Bean (name = "gen")
    public GeneralStaffService getGeneralStaff(){
        
        return new GeneralStaffServiceImpl();
    }
    
    @Bean (name = "generalCrud")
    public GeneralStaffCrudService getGeneralStaffCrud(){
        
        return new GeneralStaffCrudServiceImpl();
    }
}
