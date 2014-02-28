/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.principles_assignment.PLK.Violation.Service.Impl;

import com.karriem.tp2.principles_assignment.DoctorList;
import com.karriem.tp2.principles_assignment.Model.Doctors;
import com.karriem.tp2.principles_assignment.Model.Patients;
import com.karriem.tp2.principles_assignment.PLK.Violation.Service.WorkLoad;
import com.karriem.tp2.principles_assignment.PatientList;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author karriem
 */
public class DoctorLoad implements WorkLoad{

    private DoctorList dList = new DoctorList();
    public PatientList pList = new PatientList();
    private List<String> list = new ArrayList();
    
    @Override
    public List<String> getWork() {
        
        for (Patients p : pList.addPatients()){
            
            if (p.getTreatmentRisk().equalsIgnoreCase("High Risk")){
                
                for (Doctors d : dList.addDoctors()){
                    
                    if (d.getSpeciality().equalsIgnoreCase("Heart Surgeon")){
                        
                        list.add(p.getLastName());
                        list.add(d.getLast_Name());
                    }
                }
            }
        }
        
        return list;
    }
    
}
