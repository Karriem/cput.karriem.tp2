/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.software_design_principles.Encapsulation.Config;

import com.karriem.tp2.software_design_principles.Encapsulation.Service.EncapsulationService;
import com.karriem.tp2.software_design_principles.Encapsulation.Service.Impl.EncapsulationServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author karriem
 */
@Configuration
public class AppConfig {
    
    @Bean (name = "encap")
    public EncapsulationService getEncap(){
       
        return new EncapsulationServiceImpl();
    }
}
