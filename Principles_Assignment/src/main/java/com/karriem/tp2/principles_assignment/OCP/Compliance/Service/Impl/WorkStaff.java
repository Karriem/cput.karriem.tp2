/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.principles_assignment.OCP.Compliance.Service.Impl;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author karriem
 */
public class WorkStaff {
    
    private List<String> listS = new ArrayList<String>();
    
    public List<String> getStaff(){
        
        listS.add(new Doctor().work());
        listS.add(new Nurse().work());
        
        return listS;
    }
}
