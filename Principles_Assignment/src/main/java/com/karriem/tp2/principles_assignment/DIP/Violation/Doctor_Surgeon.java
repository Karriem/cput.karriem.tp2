/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.software_design_principles.DIP.Violation;

import com.karriem.tp2.software_design_principles.Model.Doctor;
import com.karriem.tp2.software_design_principles.DoctorList;
import com.karriem.tp2.software_design_principles.PatientList;
import com.karriem.tp2.software_design_principles.Model.Patients;
import com.karriem.tp2.software_design_principles.Model.TreatmentList;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author karriem
 */
public class Doctor_Surgeon {
    
    private List<TreatmentList> treatList = new ArrayList<TreatmentList>();
    
    private PatientList pat = new PatientList();
    private DoctorList doc = new DoctorList();
    private TreatmentList treat = new TreatmentList();
    
    public List<TreatmentList> treatPatient(){
        
        pat.addPatients();
        doc.addDoctors();
        
        for (Patients patient : pat.addPatients()){
            
            if (patient.getTreatmentRisk().equalsIgnoreCase("High Risk")){
                
                for (Doctor doctor : doc.addDoctors()){
                    
                    if (doctor.getSpeciality().equalsIgnoreCase("General Surgeon")){
                        
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
