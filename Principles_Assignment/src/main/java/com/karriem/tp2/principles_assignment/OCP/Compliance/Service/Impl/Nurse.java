/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.principles_assignment.OCP.Compliance.Service.Impl;

import com.karriem.tp2.principles_assignment.Model.Nurses;
import com.karriem.tp2.principles_assignment.NursesList;
import com.karriem.tp2.principles_assignment.OCP.Compliance.Service.Staff;

/**
 *
 * @author karriem
 */
public class Nurse extends Staff{

    private String nName;
    
    @Override
    public String work() {
        
        NursesList nList = new NursesList();
        
        for (Nurses n : nList.addNurses()){
            
            if (n.getJobDescription().equalsIgnoreCase("Operational Nurse")){
             
                nName = n.getFirstName();
            }
        }
        
        return nName;
    }
    
    
}
