/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.principles_assignment.ISP.Compliance.Service.Impl;

import com.karriem.tp2.principles_assignment.DoctorList;
import com.karriem.tp2.principles_assignment.ISP.Compliance.Service.StaffAge;
import com.karriem.tp2.principles_assignment.ISP.Compliance.Service.StaffWork;
import com.karriem.tp2.principles_assignment.Model.Doctors;
import com.karriem.tp2.principles_assignment.Model.Patients;
import com.karriem.tp2.principles_assignment.PatientList;

/**
 *
 * @author karriem
 */
public class DoctorMembers implements StaffAge, StaffWork{

    private PatientList pList = new PatientList();
    private DoctorList dList = new DoctorList();
    
    private String name = "";
    private int num = 0;
    
    @Override
    public String work() {
        
        for (Patients p : pList.addPatients()){
            
            if (p.getPatientID().equalsIgnoreCase("1000E")){
             
                name = p.getLastName();
            }
        }
        
        return name;
    }

    @Override
    public int age() {
        
        for (Doctors d : dList.addDoctors()){
            
            if (d.getDoctor_ID().equalsIgnoreCase("D3")){
                
                num = d.getAge();
            }
        }
        
        return num;
    }
    
}
