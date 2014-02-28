/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.principles_assignment.PLK.Compliance.Config;

import com.karriem.tp2.principles_assignment.PLK.Compliance.Service.Impl.DoctorWorkLoad;
import com.karriem.tp2.principles_assignment.PLK.Compliance.Service.Impl.NurseWorkLoad;
import com.karriem.tp2.principles_assignment.PLK.Compliance.Service.WorkLoad;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author karriem
 */
@Configuration
public class AppConfig {
    
      @Bean (name = "doc")
      public WorkLoad getDocLoad(){
          
          return new DoctorWorkLoad();
      } 
      
      @Bean (name = "nur")
      public WorkLoad getNurLoad(){
          
          return new NurseWorkLoad();
      }
}
