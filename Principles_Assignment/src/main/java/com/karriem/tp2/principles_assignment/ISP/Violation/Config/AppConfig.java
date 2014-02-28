/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.principles_assignment.ISP.Violation.Config;

import com.karriem.tp2.principles_assignment.ISP.Violation.Service.Impl.DoctorMembers;
import com.karriem.tp2.principles_assignment.ISP.Violation.Service.StaffMembersService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author karriem
 */
@Configuration
public class AppConfig {
    
    @Bean (name = "doc")
    public StaffMembersService getStuff(){
        
        return new DoctorMembers();
    }
}
