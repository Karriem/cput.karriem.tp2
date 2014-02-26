/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.principles_assignment.Polymorphism.Service.Impl;

import com.karriem.tp2.principles_assignment.CriticalPatient;
import com.karriem.tp2.principles_assignment.Model.Patients;
import com.karriem.tp2.principles_assignment.Polymorphism.Service.PatientService;




/**
 *
 * @author karriem
 */
public class PatientServiceImpl implements PatientService{

    @Override
    public String patientDetails() {
        
        Patients pat = new CriticalPatient();
        
        pat.setFirstName("Clark");
        
        return pat.getFirstName();
    }

}
