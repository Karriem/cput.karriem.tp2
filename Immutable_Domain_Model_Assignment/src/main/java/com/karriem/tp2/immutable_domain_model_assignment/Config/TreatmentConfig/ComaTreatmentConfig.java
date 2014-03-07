/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.immutable_domain_model_assignment.Config.TreatmentConfig;


import com.karriem.tp2.immutable_domain_model_assignment.Service.Impl.TreatmentServiceImpl.ComaServiceImpl;
import com.karriem.tp2.immutable_domain_model_assignment.Service.TreatmentService.ComaService;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author karriem
 */
@Configuration
public class ComaTreatmentConfig {
    
    @Bean (name ="comaT")
    public ComaService getComa(){
        
        return new ComaServiceImpl();
    }
}
