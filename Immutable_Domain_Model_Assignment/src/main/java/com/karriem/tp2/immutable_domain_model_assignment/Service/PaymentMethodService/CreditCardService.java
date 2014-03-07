/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.immutable_domain_model_assignment.Service.PaymentMethodService;

import com.karriem.tp2.immutable_domain_model_assignment.Domain.Model.PaymentMethod.CreditCard;
import java.util.List;

/**
 *
 * @author karriem
 */
public interface CreditCardService {
    
    public List<CreditCard> createCredit(); 
    public List<CreditCard> createNewCredit();
}
