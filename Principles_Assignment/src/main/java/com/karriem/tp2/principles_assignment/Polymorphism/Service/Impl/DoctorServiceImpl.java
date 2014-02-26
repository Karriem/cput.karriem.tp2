/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.principles_assignment.Polymorphism.Service.Impl;

import com.karriem.tp2.principles_assignment.Polymorphism.Service.DoctorService;

/**
 *
 * @author karriem
 */
public class DoctorServiceImpl implements DoctorService{

    public String getDoctor() {
        
        DoctorServiceImpl doc = new GeneralDoctor();
        
        String name = doc.getDoctor();
        
        return name;
    }

   
}
