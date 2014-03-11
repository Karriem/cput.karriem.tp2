/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.immutable_domain_model_assignment.Config.MedicalAidConfig;

import com.karriem.tp2.immutable_domain_model_assignment.Service.Crud.MedicalAidCrud.Impl.MedicalAidCrudServiceImpl;
import com.karriem.tp2.immutable_domain_model_assignment.Service.Crud.MedicalAidCrud.MedicalAidCrudService;
import com.karriem.tp2.immutable_domain_model_assignment.Service.Impl.MedicalAidServiceImpl.MedicalAidServiceImpl;
import com.karriem.tp2.immutable_domain_model_assignment.Service.MedicalAidService.MedicalAidService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author karriem
 */
@Configuration
public class MedicalAidConfig {
    
    @Bean (name = "aid")
    public MedicalAidService getMedicalAid(){
        
        return new MedicalAidServiceImpl();
    }
    
    @Bean (name = "medicalAidCrud")
    public MedicalAidCrudService getMedicalAidCrud(){
        
        return new MedicalAidCrudServiceImpl();
    }
}
