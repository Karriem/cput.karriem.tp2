/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp.tddassignment.config;

import com.karriem.tp.tddassignment.service.Impl.TDDServiceImpl;
import com.karriem.tp.tddassignment.service.TDDService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author uchiha-clan
 */

@Configuration
public class AppConfig {
    
    @Bean (name = "add")
    public TDDService getInt(){
        
        return new TDDServiceImpl();
    }
    
    @Bean (name = "float")
    public TDDService getFloat(){
        
        return new TDDServiceImpl();
    }
    
    @Bean (name = "integer")
    public TDDService getInteger(){
        
        return new TDDServiceImpl();
    }
    
    @Bean (name = "obj")
    public TDDService getObject(){
        
        return new TDDServiceImpl();
    }
    
    @Bean (name = "notSame")
    public TDDService getNotSame(){
        
        return new TDDServiceImpl();
    }
    
    @Bean (name = "truth")
    public TDDService getTruth(){
        
        return new TDDServiceImpl();
    }
    
    @Bean (name = "falsity")
    public TDDService getFalsity(){
        
        return new TDDServiceImpl();
    }
    
    @Bean (name = "null")
    public TDDService getNUll(){
        
        return new TDDServiceImpl();
    }
}
