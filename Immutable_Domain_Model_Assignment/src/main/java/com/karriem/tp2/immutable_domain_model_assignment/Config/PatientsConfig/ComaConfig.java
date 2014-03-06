/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.immutable_domain_model_assignment.Config.PatientsConfig;

import com.karriem.tp2.immutable_domain_model_assignment.Service.Impl.PatientsServcieImpl.ComaServiceImpl;
import com.karriem.tp2.immutable_domain_model_assignment.Service.PatientsService.ComaService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author karriem
 */
@Configuration
public class ComaConfig {
    
    @Bean (name = "coma")
    public ComaService getComa(){
        
        return new ComaServiceImpl();
    }
}
