/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.immutable_domain_model_assignment.Config.EmployeesConfig;

import com.karriem.tp2.immutable_domain_model_assignment.Service.Crud.EmployeesCrud.Impl.MaintenanceCrudServiceImpl;
import com.karriem.tp2.immutable_domain_model_assignment.Service.Crud.EmployeesCrud.MaintenanceCrudService;
import com.karriem.tp2.immutable_domain_model_assignment.Service.EmployeesService.MaintenanceService;
import com.karriem.tp2.immutable_domain_model_assignment.Service.Impl.EmployeesServiceImpl.MaintenanceServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author karriem
 */
@Configuration
public class MaintenanceConfig {
    
    @Bean (name = "main")
    public MaintenanceService getMain(){
        
        return new MaintenanceServiceImpl();
    }
    
    @Bean (name = "mainCrud")
    public MaintenanceCrudService getMainCrud(){
        
        return new MaintenanceCrudServiceImpl();
    }
}
