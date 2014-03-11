/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.immutable_domain_model_assignment.Config.EquipmentConfig;

import com.karriem.tp2.immutable_domain_model_assignment.Service.Crud.EquipmentCrud.GeneralEquipmentCrudService;
import com.karriem.tp2.immutable_domain_model_assignment.Service.Crud.EquipmentCrud.Impl.GeneralEquipmentCrudServiceImpl;
import com.karriem.tp2.immutable_domain_model_assignment.Service.EquipmentService.GeneralEquipmentService;
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
    public GeneralEquipmentService getGenEquip(){
        
        return new GeneralServiceImpl();
    }
    
    @Bean (name = "generalEquipCrud")
    public GeneralEquipmentCrudService getEquipCrud(){
        
        return new GeneralEquipmentCrudServiceImpl();
    }
}
