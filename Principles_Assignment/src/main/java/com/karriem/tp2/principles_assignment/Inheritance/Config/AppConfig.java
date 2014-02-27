/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.principles_assignment.Inheritance.Config;

import com.karriem.tp2.principles_assignment.Inheritance.Service.Impl.PatientRecordServiceImpl;
import com.karriem.tp2.principles_assignment.Inheritance.Service.PatientRecordService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author karriem
 */

@Configuration
public class AppConfig {
    
    @Bean (name = "pat")
    public PatientRecordService getPatient(){
        
        return new PatientRecordServiceImpl();
    }
}
