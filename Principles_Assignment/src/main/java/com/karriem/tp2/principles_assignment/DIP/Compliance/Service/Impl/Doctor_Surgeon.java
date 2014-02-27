/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.principles_assignment.DIP.Compliance.Service.Impl;

import com.karriem.tp2.principles_assignment.DIP.Compliance.Service.HospitalService;
import com.karriem.tp2.principles_assignment.DoctorList;
import com.karriem.tp2.principles_assignment.Model.Doctor;
import com.karriem.tp2.principles_assignment.Model.Patients;
import com.karriem.tp2.principles_assignment.Model.TreatmentList;
import com.karriem.tp2.principles_assignment.PatientList;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author karriem
 */
public class Doctor_Surgeon implements HospitalService{
    
    private List<TreatmentList> treatList = new ArrayList<TreatmentList>();
    
    private PatientList pat = new PatientList();
    private DoctorList doc = new DoctorList();
    
    @Override
    public List<TreatmentList> treatPatient(){
        
        for (Patients patient : pat.addPatients()){
            
            if (patient.getTreatmentRisk().equalsIgnoreCase("High Risk")){
                
                for (Doctor doctor : doc.addDoctors()){
                    
                    if (doctor.getSpeciality().equalsIgnoreCase("General Surgeon")){
                        
                        TreatmentList treat = new TreatmentList();
                        treat.setDoctor_ID(doctor.getDoctor_ID());
                        treat.setPatient_ID(patient.getPatientID());
                        
                        treatList.add(treat);
                    }
                }                
            }
        }
        
        return treatList;
    }
}
