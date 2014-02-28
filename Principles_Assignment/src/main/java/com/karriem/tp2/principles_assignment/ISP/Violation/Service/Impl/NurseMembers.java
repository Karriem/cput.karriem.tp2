/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.principles_assignment.ISP.Violation.Service.Impl;

import com.karriem.tp2.principles_assignment.DoctorList;
import com.karriem.tp2.principles_assignment.ISP.Violation.Service.StaffMembersService;
import com.karriem.tp2.principles_assignment.Model.Doctors;
import com.karriem.tp2.principles_assignment.Model.Nurses;
import com.karriem.tp2.principles_assignment.Model.Patients;
import com.karriem.tp2.principles_assignment.NursesList;
import com.karriem.tp2.principles_assignment.PatientList;

/**
 *
 * @author karriem
 */
public class NurseMembers implements StaffMembersService{

    private PatientList pList = new PatientList();
    private NursesList dList = new NursesList();
    
    private String name = "";
    private int num = 0;
    
    @Override
    public String work() {
        
        for (Patients p : pList.addPatients()){
            
            if (p.getPatientID().equalsIgnoreCase("1000C")){
             
                name = p.getLastName();
            }
        }
        
        return name;
    }

    @Override
    public int age() {
        
        for (Nurses n : dList.addNurses()){
            
            if (n.getStaffID().equalsIgnoreCase("N1001")){
                
                num = n.getAge();
            }
        }
        
        return num;
    }
    
}
