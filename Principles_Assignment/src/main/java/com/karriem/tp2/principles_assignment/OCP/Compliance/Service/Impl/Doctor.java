/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.principles_assignment.OCP.Compliance.Service.Impl;

import com.karriem.tp2.principles_assignment.DoctorList;
import com.karriem.tp2.principles_assignment.Model.Doctors;
import com.karriem.tp2.principles_assignment.OCP.Compliance.Service.Staff;

/**
 *
 * @author karriem
 */
public class Doctor extends Staff{

    private String dName;
    
    @Override
    public String work() {
        
        DoctorList list = new DoctorList();
        
        for (Doctors d : list.addDoctors()){
            
            if (d.getSpeciality().equalsIgnoreCase("Neuro Surgeon")){
                
                dName = d.getFirst_Name();
            }
        }
        
        return dName;
    } 
}
