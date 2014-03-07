/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.immutable_domain_model_assignment.Service.Impl.PaymentMethodServiceImpl;

import com.karriem.tp2.immutable_domain_model_assignment.Domain.Model.PaymentMethod.MonthlyPayments;
import com.karriem.tp2.immutable_domain_model_assignment.Service.PaymentMethodService.MonthlyPaymentService;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author karriem
 */
public class MonthlyPaymentServiceImpl implements MonthlyPaymentService{

    private List<MonthlyPayments> monthlyList = new ArrayList<MonthlyPayments>();
    
    @Override
    public List<MonthlyPayments> createMonthly() {
        
        MonthlyPayments monthlyObj = new MonthlyPayments.Builder()
                                            .patientID("P1001")
                                            .paymentID("PAy10001")
                                            .months(12)
                                            .monthlyInstallments(400)
                                            .treatmentCost(4800)
                                            .build();
                                            
        monthlyList.add(monthlyObj);
        
        return monthlyList;
    }

    @Override
    public List<MonthlyPayments> createNewMonthly() {
        
        MonthlyPayments newMonthlyObj = new MonthlyPayments.Builder()
                                            .monthlyPayments(new MonthlyPaymentServiceImpl().createMonthly().get(0))
                                            .patientID("P1002")
                                            .build();                                       
        
        monthlyList.add(newMonthlyObj);
        
        return monthlyList;
    }
    
}
