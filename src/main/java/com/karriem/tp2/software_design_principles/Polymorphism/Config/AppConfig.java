/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.software_design_principles.Polymorphism.Config;

import com.karriem.tp2.software_design_principles.Polymorphism.Service.Impl.PatientServiceImpl;
import com.karriem.tp2.software_design_principles.Polymorphism.Service.PatientService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author karriem
 */
@Configuration
public class AppConfig {
    
    @Bean (name = "poly")
    public PatientService getPoly(){
        
        return new PatientServiceImpl();
    }
}
