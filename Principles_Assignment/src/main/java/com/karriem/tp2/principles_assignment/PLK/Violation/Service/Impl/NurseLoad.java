/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.principles_assignment.PLK.Violation.Service.Impl;

import com.karriem.tp2.principles_assignment.Model.Doctors;
import com.karriem.tp2.principles_assignment.Model.Nurses;
import com.karriem.tp2.principles_assignment.Model.Patients;
import com.karriem.tp2.principles_assignment.NursesList;
import com.karriem.tp2.principles_assignment.PLK.Violation.Service.WorkLoad;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author karriem
 */
public class NurseLoad implements WorkLoad{
    
    private NursesList nList = new NursesList();
    private DoctorLoad dLoad = new DoctorLoad();
    private List<String> list = new ArrayList();

    @Override
    public List<String> getWork() {
        
        for (Patients p : dLoad.pList.addPatients()){
            
            if (p.getTreatmentRisk().equalsIgnoreCase("no Risk")){
                
                for (Nurses n : nList.addNurses()){
                    
                    if (n.getJobDescription().equalsIgnoreCase("Staff Nurse")){
                        
                        list.add(p.getLastName());
                        list.add(n.getLastName());
                    }
                }
            }
        }
        
        return list;
    }
    
}
