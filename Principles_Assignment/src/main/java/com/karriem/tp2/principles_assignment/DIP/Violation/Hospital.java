/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.principles_assignment.DIP.Violation;

import com.karriem.tp2.principles_assignment.Model.TreatmentList;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author karriem
 */
public class Hospital {
    
    private Doctor_GP docGP = new Doctor_GP();
    
    private List<TreatmentList> treatList = new ArrayList<TreatmentList>();
    
    public List<TreatmentList> getToTreating(){
        
        treatList = docGP.treatPatient();
        
        return treatList;
    }
}
