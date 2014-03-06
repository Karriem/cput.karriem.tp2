/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.immutable_domain_model_assignment.Config.EquipmentConfig;

import com.karriem.tp2.immutable_domain_model_assignment.Service.EquipmentService.GeneralService;
import com.karriem.tp2.immutable_domain_model_assignment.Service.Impl.EquipmentServiceImpl.GeneralServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author karriem
 */
@Configuration
public class GeneralConfig {
    
    @Bean (name = "genEquip")
    public GeneralService getGenEquip(){
        
        return new GeneralServiceImpl();
    }
}
