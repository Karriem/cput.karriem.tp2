/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.principles_assignment.SRP.Compliance.Service.Impl;

import com.karriem.tp2.principles_assignment.DoctorList;
import com.karriem.tp2.principles_assignment.Model.Doctors;
import com.karriem.tp2.principles_assignment.SRP.Compliance.Service.StaffAgeService;

/**
 *
 * @author karriem
 */
public class StaffAgeServiceImpl implements StaffAgeService{

    private DoctorList dList = new DoctorList();
    private int age;
    
    public int getDoctorAge() {
        
        for (Doctors d : dList.addDoctors()){
           
            if (d.getSpeciality().equalsIgnoreCase("Heart Surgeon")){
                
                age = d.getAge();
            }
        }
        
        return age;
    }
    
}
