/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.principles_assignment;

import com.karriem.tp2.principles_assignment.Model.Doctor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author karriem
 */
public class DoctorList {
    
    private List<Doctor> docList = new ArrayList<Doctor>();
    
    public List<Doctor> addDoctors(){
        
        Doctor doc1 = new Doctor();
        Doctor doc2 = new Doctor();
        Doctor doc3 = new Doctor();
        Doctor doc4 = new Doctor();
        Doctor doc5 = new Doctor();
        
        doc1.setDoctor_ID("D1");
        doc1.setFirst_Name("Karriem");
        doc1.setLast_Name("Petersen");
        doc1.setAge(23);
        doc1.setSpeciality("Heart Surgeon");
        
        doc2.setDoctor_ID("D2");
        doc2.setFirst_Name("Luke");
        doc2.setLast_Name("Davids");
        doc2.setAge(22);
        doc2.setSpeciality("Neuro Surgeon");        
        
        doc3.setDoctor_ID("D3");
        doc3.setFirst_Name("Alexander");
        doc3.setLast_Name("Daniels");
        doc3.setAge(25);
        doc3.setSpeciality("General Surgeon");        
        
        doc4.setDoctor_ID("D4");
        doc4.setFirst_Name("Mikhail");
        doc4.setLast_Name("Sissing");
        doc4.setAge(23);
        doc4.setSpeciality("General Practitioner");
        
        doc5.setDoctor_ID("D5");
        doc5.setFirst_Name("Nathanial");
        doc5.setLast_Name("Bent");
        doc5.setAge(21);
        doc5.setSpeciality("General Practitioner");        
        
        docList.add(doc1);
        docList.add(doc2);
        docList.add(doc3);
        docList.add(doc4);        
        
        return docList;
    }
}
