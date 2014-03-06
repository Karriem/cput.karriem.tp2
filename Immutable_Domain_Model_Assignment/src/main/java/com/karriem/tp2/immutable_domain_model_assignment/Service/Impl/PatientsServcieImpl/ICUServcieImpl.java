/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.immutable_domain_model_assignment.Service.Impl.PatientsServcieImpl;

import com.karriem.tp2.immutable_domain_model_assignment.Domain.Model.Patients.ICUPatients;
import com.karriem.tp2.immutable_domain_model_assignment.Service.PatientsService.ICUService;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author karriem
 */
public class ICUServcieImpl implements ICUService{

    private List<ICUPatients> ICUList = new ArrayList<ICUPatients>();
    
    @Override
    public List<ICUPatients> createICU() {
        
        ICUPatients ICUObj = new ICUPatients.Builder()
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
                                    .bedNumber("7")
                                    .build();
        
        ICUList.add(ICUObj);
        
        return ICUList;
    }

    @Override
    public List<ICUPatients> createNewICU() {
        
        ICUPatients newICU= new ICUPatients.Builder()
                                    .icuPatients(new ICUServcieImpl().createICU().get(0))
                                    .firstName("Garrus")
                                    .build();
        
        ICUList.add(newICU);
        
        return ICUList;
    }
    
}
