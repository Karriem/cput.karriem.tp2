/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.immutable_domain_model_assignment.Config.PaymentMethodConfig;

import com.karriem.tp2.immutable_domain_model_assignment.Service.Impl.PaymentMethodServiceImpl.CreditCardServiceImpl;
import com.karriem.tp2.immutable_domain_model_assignment.Service.PaymentMethodService.CreditCardService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author karriem
 */
@Configuration
public class CreditCardConfig {
    
    @Bean (name = "credit")
    public CreditCardService getCredit(){
        
        return new CreditCardServiceImpl();
    }
}
