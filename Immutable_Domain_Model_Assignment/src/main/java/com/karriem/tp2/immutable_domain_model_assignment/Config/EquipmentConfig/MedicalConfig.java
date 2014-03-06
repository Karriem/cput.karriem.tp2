/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.immutable_domain_model_assignment.Config.EquipmentConfig;

import com.karriem.tp2.immutable_domain_model_assignment.Service.EquipmentService.MedicalService;
import com.karriem.tp2.immutable_domain_model_assignment.Service.Impl.EquipmentServiceImpl.MedicalServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author karriem
 */
@Configuration
public class MedicalConfig {
    
    @Bean (name = "med")
    public MedicalService getMedical(){
        
        return new MedicalServiceImpl();
    }
}
