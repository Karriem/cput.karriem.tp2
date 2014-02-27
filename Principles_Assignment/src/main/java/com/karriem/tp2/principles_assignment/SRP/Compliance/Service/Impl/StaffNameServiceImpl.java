/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.principles_assignment.SRP.Compliance.Service.Impl;

import com.karriem.tp2.principles_assignment.DoctorList;
import com.karriem.tp2.principles_assignment.Model.Doctors;
import com.karriem.tp2.principles_assignment.SRP.Compliance.Service.StaffNameService;

/**
 *
 * @author karriem
 */
public class StaffNameServiceImpl implements StaffNameService{

    private DoctorList dList = new DoctorList();
    private String dName = "";
    
    @Override
    public String getDoctorName() {
        
        for (Doctors d : dList.addDoctors()){
            
            if (d.getSpeciality().equalsIgnoreCase("Heart Surgeon")){
                
                dName = d.getFirst_Name();
            }
            
        }
        
        return dName;
    }
    
}
