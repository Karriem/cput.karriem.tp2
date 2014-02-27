/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.principles_assignment.SRP.Violation.Service.Impl;

import com.karriem.tp2.principles_assignment.DoctorList;
import com.karriem.tp2.principles_assignment.Model.Doctors;
import com.karriem.tp2.principles_assignment.SRP.Violation.Service.StaffAgeNameService;

/**
 *
 * @author karriem
 */
public class StaffAgeNameServiceImpl implements StaffAgeNameService{

    private DoctorList dList = new DoctorList();
    
    private int age;
    private String dName = "";
    
    public int getAge() {
        
        for (Doctors d : dList.addDoctors()){
           
            if (d.getSpeciality().equalsIgnoreCase("Heart Surgeon")){
                
                age = d.getAge();
            }
        }
        
        return age;
    }

    
    
    @Override
    public String getName() {
        
        for (Doctors d : dList.addDoctors()){
            
            if (d.getSpeciality().equalsIgnoreCase("Heart Surgeon")){
                
                dName = d.getFirst_Name();
            }
            
        }
        
        return dName;
    }
    
  
}
