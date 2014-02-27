/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.principles_assignment.DIP.Compliance.Service.Impl;

import com.karriem.tp2.principles_assignment.DIP.Compliance.Service.HospitalService;
import com.karriem.tp2.principles_assignment.DoctorList;
import com.karriem.tp2.principles_assignment.Model.Doctors;
import com.karriem.tp2.principles_assignment.Model.Patients;
import com.karriem.tp2.principles_assignment.Model.TreatmentList;
import com.karriem.tp2.principles_assignment.PatientList;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author karriem
 */
public class Hospital{

    private Doctor_GP doc = new Doctor_GP();
    
    public void getToTreating(){
        
        doc.treatPatient();
       
    }

}
