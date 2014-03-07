/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.immutable_domain_model_assignment.Config.SuppliersConfig;

import com.karriem.tp2.immutable_domain_model_assignment.Service.Impl.SuppliersServiceImpl.GeneralSuppliersServiceImpl;
import com.karriem.tp2.immutable_domain_model_assignment.Service.SuppliersService.GeneralSuppliersService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author karriem
 */
@Configuration
public class GeneralSuppliersConfig {
    
    @Bean (name = "gen")
    public GeneralSuppliersService getGenSup(){
        
        return new GeneralSuppliersServiceImpl();
    }
}
