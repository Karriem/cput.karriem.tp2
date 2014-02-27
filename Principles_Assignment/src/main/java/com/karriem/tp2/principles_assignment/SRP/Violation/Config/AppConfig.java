/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.principles_assignment.SRP.Violation.Config;

import com.karriem.tp2.principles_assignment.SRP.Compliance.Service.Impl.StaffAgeServiceImpl;
import com.karriem.tp2.principles_assignment.SRP.Compliance.Service.Impl.StaffNameServiceImpl;
import com.karriem.tp2.principles_assignment.SRP.Compliance.Service.StaffAgeService;
import com.karriem.tp2.principles_assignment.SRP.Compliance.Service.StaffNameService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author karriem
 */
@Configuration
public class AppConfig {
    
    @Bean (name = "age")
    public StaffAgeService getAge(){
        
        return new StaffAgeServiceImpl();
    }
    
    @Bean (name = "name")
    public StaffNameService getName(){
        
        return new StaffNameServiceImpl();
    }
}
