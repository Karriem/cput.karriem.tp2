/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.principles_assignment.Polymorphism.Config;

import com.karriem.tp2.principles_assignment.Polymorphism.Service.DoctorService;
import com.karriem.tp2.principles_assignment.Polymorphism.Service.Impl.DoctorServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author karriem
 */
@Configuration
public class AppConfig {
    
    @Bean (name = "poly")
    public DoctorService getPoly(){
        
        return new DoctorServiceImpl();
    }
}
