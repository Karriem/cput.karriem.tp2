/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.principles_assignment.PLK.Compliance.Service.Impl;

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
public class NurseWorkLoad implements WorkLoad{
    
    private PatientList pList = new PatientList();
    private NursesList nList = new NursesList();
    private List<String> nurPatientsList = new ArrayList();
    
    @Override
    public List<String> getListOfPatients(){
        
        for (Patients p : pList.addPatients()){
            
            if (p.getTreatmentRisk().equalsIgnoreCase("no risk")){
                
                for (Nurses n : nList.addNurses()){
                    
                    if (n.getJobDescription().equalsIgnoreCase("General Nurse")){
                        
                        nurPatientsList.add(p.getLastName());
                        nurPatientsList.add(n.getLastName());
                    }
                }
            }
        }
        
        return nurPatientsList;
    }
}
