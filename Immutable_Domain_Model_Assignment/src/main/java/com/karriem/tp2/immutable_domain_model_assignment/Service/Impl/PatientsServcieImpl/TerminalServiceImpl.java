/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.immutable_domain_model_assignment.Service.Impl.PatientsServcieImpl;

import com.karriem.tp2.immutable_domain_model_assignment.Domain.Model.Patients.TerminalPatients;
import com.karriem.tp2.immutable_domain_model_assignment.Service.PatientsService.TerminalService;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author karriem
 */
public class TerminalServiceImpl implements TerminalService{

    private List<TerminalPatients> terminalList = new ArrayList<TerminalPatients>();
    
    @Override
    public List<TerminalPatients> createICU() {
        
        TerminalPatients terObj = new TerminalPatients.Builder()
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
                                    .timeLeft("5 Days")
                                    .build();
        
        terminalList.add(terObj);
        
        return terminalList;
    }

    @Override
    public List<TerminalPatients> createNewICU() {
        
        TerminalPatients newTer= new TerminalPatients.Builder()
                                    .terminalPatients(new TerminalServiceImpl().createICU().get(0))
                                    .timeLeft("10 Days")
                                    .build();
        
        terminalList.add(newTer);
        
        return terminalList;
    }
    
}
