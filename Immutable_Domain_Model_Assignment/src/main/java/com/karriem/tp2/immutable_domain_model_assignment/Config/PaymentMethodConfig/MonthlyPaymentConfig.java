/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.immutable_domain_model_assignment.Config.PaymentMethodConfig;

import com.karriem.tp2.immutable_domain_model_assignment.Service.Crud.PaymentMethodCrud.Impl.MonthlyPaymentCrudServiceImpl;
import com.karriem.tp2.immutable_domain_model_assignment.Service.Crud.PaymentMethodCrud.MonthlyPaymentCrudService;
import com.karriem.tp2.immutable_domain_model_assignment.Service.Impl.PaymentMethodServiceImpl.MonthlyPaymentServiceImpl;
import com.karriem.tp2.immutable_domain_model_assignment.Service.PaymentMethodService.MonthlyPaymentService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author karriem
 */
@Configuration
public class MonthlyPaymentConfig {
    
    @Bean (name = "monthly")
    public MonthlyPaymentService getMonthly(){
        
        return new MonthlyPaymentServiceImpl();
    }
    
    @Bean (name = "monthlyCrud")
    public MonthlyPaymentCrudService getMonthlyCrud(){
        
        return new MonthlyPaymentCrudServiceImpl();
    }
}
