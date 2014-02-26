/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.software_design_principles;

import com.karriem.tp2.software_design_principles.Model.Patients;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author karriem
 */
public class PatientList {
    
    private List<Patients> patList = new ArrayList<Patients>();
    
    public List<Patients> addPatients(){
        
        Patients patient1 = new Patients();
        Patients patient2 = new Patients();
        Patients patient3 = new Patients();
        Patients patient4 = new Patients();
        Patients patient5 = new Patients();
        
        patient1.setPatientID("1000A");
        patient1.setFirstName("Bruce");
        patient1.setLastName("Wayne");
        patient1.setGender("Male");
        patient1.setAge(35);
        patient1.setTreatmentRisk(new CriticalPatient().noRisk());
        
        patient2.setPatientID("1000B");
        patient2.setFirstName("Clark");
        patient2.setLastName("Kent");
        patient2.setGender("male");
        patient2.setAge(32);
        patient2.setTreatmentRisk(new CriticalPatient().highRisk());
        
        patient3.setPatientID("1000C");
        patient3.setFirstName("Bruce");
        patient3.setLastName("Banner");
        patient3.setGender("Male");
        patient3.setAge(32);
        patient3.setTreatmentRisk(new CriticalPatient().lowRisk());
        
        patient4.setPatientID("1000D");
        patient4.setFirstName("Tony");
        patient4.setLastName("Stark");
        patient4.setGender("Male");
        patient4.setAge(31);
        patient4.setTreatmentRisk(new CriticalPatient().noRisk());
        
        patient5.setPatientID("1000E");
        patient5.setFirstName("Peter");
        patient5.setLastName("Parker");
        patient5.setGender("Male");
        patient5.setAge(28);
        patient5.setTreatmentRisk(new CriticalPatient().noRisk());
        
        patList.add(patient1);
        patList.add(patient2);
        patList.add(patient3);
        patList.add(patient4);
        patList.add(patient5);
        
        return patList;
    }
}