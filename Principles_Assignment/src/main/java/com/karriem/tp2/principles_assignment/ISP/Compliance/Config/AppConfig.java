/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.principles_assignment.ISP.Compliance.Config;

import com.karriem.tp2.principles_assignment.ISP.Compliance.Service.Impl.DoctorMembers;
import com.karriem.tp2.principles_assignment.ISP.Compliance.Service.StaffAge;
import com.karriem.tp2.principles_assignment.ISP.Compliance.Service.StaffWork;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author karriem
 */
@Configuration
public class AppConfig {
    
    @Bean (name = "age")
    public StaffAge getAge(){
        
        return new DoctorMembers();
    }
    
    @Bean (name = "work")
    public StaffWork getWork(){
        
        return new DoctorMembers();
    }
}
