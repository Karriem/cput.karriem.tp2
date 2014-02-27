/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.principles_assignment.Polymorphism.Service.Impl;

import com.karriem.tp2.principles_assignment.DoctorList;
import com.karriem.tp2.principles_assignment.Model.Doctors;

/**
 *
 * @author karriem
 */
public class GeneralDoctor extends DoctorServiceImpl{

    @Override
    public String getDoctor() {
        
        String name = null;
        
        DoctorList docList = new DoctorList();
        
        for (Doctors doc : docList.addDoctors()){
   
            if (doc.getSpeciality().equalsIgnoreCase("General Practitioner")){
                
                name = doc.getFirst_Name();
            }
        }
     
        return name;
    }
    
    
}
