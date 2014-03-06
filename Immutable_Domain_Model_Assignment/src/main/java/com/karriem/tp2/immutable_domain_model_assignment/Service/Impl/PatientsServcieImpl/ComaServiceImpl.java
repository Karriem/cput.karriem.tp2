/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.immutable_domain_model_assignment.Service.Impl.PatientsServcieImpl;

import com.karriem.tp2.immutable_domain_model_assignment.Domain.Model.Patients.ComaPatients;
import com.karriem.tp2.immutable_domain_model_assignment.Service.PatientsService.ComaService;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author karriem
 */
public class ComaServiceImpl implements ComaService{
    
    private List<ComaPatients> comaList = new ArrayList<ComaPatients>();
    
    @Override
    public List<ComaPatients> createComa() {
        
        ComaPatients comaObj = new ComaPatients.Builder()
                                    .patID("P1001")
                                    .address("5 dsgasdgasg")
                                    .bedNumber("45")
                                    .cellNumber("545645646")
                                    .doctorID("D1001")
                                    .durationOfComa("45 Days")
                                    .firstName("phloid")
                                    .illness("Heart Rupture")
                                    .lastName("Mayweather")
                                    .medicine("Bla Bla Bla")
                                    .age(97)
                                    .treatment("Rest")
                                    .build();
        
        comaList.add(comaObj);
        
        return comaList;
    }

    @Override
    public List<ComaPatients> createNewComa() {
        
        ComaPatients newComa = new ComaPatients.Builder()
                                    .comaPatients(new ComaServiceImpl().createComa().get(0))
                                    .bedNumber("78")
                                    .build();
        
        comaList.add(newComa);
        
        return comaList;
    }
}
