/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.principles_assignment.PLK.Compliance.Service.Impl;

import com.karriem.tp2.principles_assignment.DoctorList;
import com.karriem.tp2.principles_assignment.Model.Doctors;
import com.karriem.tp2.principles_assignment.Model.Nurses;
import com.karriem.tp2.principles_assignment.Model.Patients;
import com.karriem.tp2.principles_assignment.NursesList;
import com.karriem.tp2.principles_assignment.PLK.Compliance.Service.WorkLoad;
import com.karriem.tp2.principles_assignment.PatientList;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author karriem
 */
public class DoctorWorkLoad implements WorkLoad{
    
    private PatientList pList = new PatientList();
    private DoctorList dList = new DoctorList();
    private List<String> docPatientsList = new ArrayList();
    
    @Override
    public List<String> getListOfPatients(){
        
        for (Patients p : pList.addPatients()){
            
            if (p.getTreatmentRisk().equalsIgnoreCase("High Risk")){
                
                for (Doctors d : dList.addDoctors()){
                    
                    if (d.getSpeciality().equalsIgnoreCase("General Practitioner")){
                        
                        docPatientsList.add(p.getLastName());
                        docPatientsList.add(d.getLast_Name());
                    }
                }
            }
        }
        
        return docPatientsList;
    }
}
