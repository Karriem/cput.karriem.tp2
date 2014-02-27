/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.principles_assignment.LSP.Compliance.Service.Impl;

import com.karriem.tp2.principles_assignment.LSP.Compliance.Service.Staff;
import com.karriem.tp2.principles_assignment.Model.Patients;
import com.karriem.tp2.principles_assignment.PatientList;
import java.util.List;

/**
 *
 * @author karriem
 */
public class Doctor extends Staff{
    
    @Override
    public String treatPatient(){
        
        List<Patients> pList = new PatientList().addPatients();
        String name = "";
        
        for (Patients p : pList){
            
            if (p.getFirstName().equalsIgnoreCase("Bruce")){
                
                name = p.getFirstName();
            }
        }
        
        return name;
    }
}
