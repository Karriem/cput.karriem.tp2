/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.principles_assignment.DIP.Compliance.Service.Config;

import com.karriem.tp2.principles_assignment.DIP.Compliance.Service.HospitalService;
import com.karriem.tp2.principles_assignment.DIP.Compliance.Service.Impl.Doctor_GP;
import com.karriem.tp2.principles_assignment.DIP.Compliance.Service.Impl.Hospital;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author karriem
 */
@Configuration
public class AppConfig {
    
    @Bean (name = "doc")
    public HospitalService getDoctor(){
        
        return new Doctor_GP();
    }
}
