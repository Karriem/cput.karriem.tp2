/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.principles_assignment.PLK.Violation.Config;

import com.karriem.tp2.principles_assignment.PLK.Violation.Service.Impl.NurseLoad;
import com.karriem.tp2.principles_assignment.PLK.Violation.Service.WorkLoad;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author karriem
 */
@Configuration
public class AppConfig {
    
    @Bean (name = "nur")
    public WorkLoad getLoad(){
        
        return new NurseLoad();
    }
}
