/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.immutable_domain_model_assignment.Config.PatientsConfig;

import com.karriem.tp2.immutable_domain_model_assignment.Service.Crud.PatientsCrud.Impl.TerminalCrudServiceImpl;
import com.karriem.tp2.immutable_domain_model_assignment.Service.Crud.PatientsCrud.TerminalCrudService;
import com.karriem.tp2.immutable_domain_model_assignment.Service.Impl.PatientsServcieImpl.TerminalServiceImpl;
import com.karriem.tp2.immutable_domain_model_assignment.Service.PatientsService.TerminalService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author karriem
 */
@Configuration
public class TerminalConfig {
    
    @Bean (name = "Terminal")
    public TerminalService getTerminal(){
        
        return new TerminalServiceImpl();
    }
    
    @Bean (name = "terminalCrud")
    public TerminalCrudService getTerminalCrud(){
        
        return new TerminalCrudServiceImpl();
    }
}
