/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.principles_assignment.DIP.Violation;

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
public class Doctor_GP {
    
    private List<Patients> patList = new ArrayList<Patients>(); 
    private List<Doctors> docList = new ArrayList<Doctors>();
    private List<TreatmentList> treatList = new ArrayList<TreatmentList>();
    
    private PatientList pat = new PatientList();
    private DoctorList doc = new DoctorList();
    
    public List<TreatmentList> treatPatient(){
        
        patList = pat.addPatients();
        docList = doc.addDoctors();
        
        for (Patients patient : patList){
            
            if (patient.getTreatmentRisk().equalsIgnoreCase("Low Risk") || patient.getTreatmentRisk().equalsIgnoreCase("No Risk")){
                
                for (Doctors doctor : docList){
                    
                    if (doctor.getSpeciality().equalsIgnoreCase("General Practitioner")){
                        
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
