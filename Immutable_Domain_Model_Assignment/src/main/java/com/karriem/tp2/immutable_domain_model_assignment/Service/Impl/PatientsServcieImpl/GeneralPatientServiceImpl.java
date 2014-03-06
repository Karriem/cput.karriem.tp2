/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.immutable_domain_model_assignment.Service.Impl.PatientsServcieImpl;

import com.karriem.tp2.immutable_domain_model_assignment.Domain.Model.Patients.GeneralPatients;
import com.karriem.tp2.immutable_domain_model_assignment.Service.PatientsService.GeneralPatientService;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author karriem
 */
public class GeneralPatientServiceImpl implements GeneralPatientService{
 
    private List<GeneralPatients> comaList = new ArrayList<GeneralPatients>();
    
    @Override
    public List<GeneralPatients> createGeneral() {
        
        GeneralPatients comaObj = new GeneralPatients.Builder()
                                    .patID("P1002")
                                    .address("45 hfurnfps,d")
                                    .cellNumber("47772")
                                    .doctorID("D1001")
                                    .treatment("Lots Of Fluids")
                                    .firstName("Jack")
                                    .illness("Flu")
                                    .lastName("Torture")
                                    .medicine("MedLemond")
                                    .age(24)
                                    .build();
        
        comaList.add(comaObj);
        
        return comaList;
    }

    @Override
    public List<GeneralPatients> createNewGeneral() {
        
        GeneralPatients newComa = new GeneralPatients.Builder()
                                    .patients(new GeneralPatientServiceImpl().createGeneral().get(0))
                                    .doctorID("D1005")
                                    .build();
        
        comaList.add(newComa);
        
        return comaList;
    }
}
