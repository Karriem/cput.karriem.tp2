/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.software_design_principles.Polymorphism.Service.Impl;

import com.karriem.tp2.software_design_principles.CriticalPatient;
import com.karriem.tp2.software_design_principles.Model.Patients;
import com.karriem.tp2.software_design_principles.Polymorphism.Service.PatientService;

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
