/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.principles_assignment.Encapsulation.Service.Impl;



import com.karriem.tp2.principles_assignment.Encapsulation.Service.EncapsulationService;
import com.karriem.tp2.principles_assignment.Model.Patients;


/**
 *
 * @author karriem
 */
public class EncapsulationServiceImpl implements EncapsulationService{

    @Override
    public String patient() {
        
        Patients pat = new Patients();
        
        pat.setFirstName("Bruce");
        pat.setLastName("Wayne");
        
        String fullName = pat.getFirstName() + " " + pat.getLastName();
        
        return fullName;
    }
    
}
