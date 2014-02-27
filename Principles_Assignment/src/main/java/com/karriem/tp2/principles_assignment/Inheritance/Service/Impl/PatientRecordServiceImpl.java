/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.principles_assignment.Inheritance.Service.Impl;

import com.karriem.tp2.principles_assignment.Inheritance.Service.PatientRecordService;

/**
 *
 * @author karriem
 */
public class PatientRecordServiceImpl implements PatientRecordService{    

    @Override
    public String patientRec() {
        
        String pName = "Bruce";
       
        return pName;
    }    
}
