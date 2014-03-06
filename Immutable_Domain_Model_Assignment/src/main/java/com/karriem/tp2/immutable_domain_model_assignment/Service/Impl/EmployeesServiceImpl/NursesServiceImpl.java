/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.immutable_domain_model_assignment.Service.Impl.EmployeesServiceImpl;

import com.karriem.tp2.immutable_domain_model_assignment.Domain.Model.Employees.NursesPersonal;
import com.karriem.tp2.immutable_domain_model_assignment.Service.EmployeesService.NursesService;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author karriem
 */
public class NursesServiceImpl implements NursesService{

    private List<NursesPersonal> nurList = new ArrayList<NursesPersonal>();
    
    @Override
    public List<NursesPersonal> createNurse() {
        
        NursesPersonal nurObj = new NursesPersonal.Builder()
                                            .nurID("N1001")
                                            .firstName("Shamoodah")
                                            .lastName("Petersen")
                                            .age(26)
                                            .jobDescription("Sister")
                                            .postalAddress("9 Emerald")
                                            .cellNumber("455488235")
                                            .build();
                                            
        
        nurList.add(nurObj);
        
        return nurList;
    }

    @Override
    public List<NursesPersonal> createNewNurse() {
        
        NursesPersonal newNur = new NursesPersonal.Builder()
                                    .nurse(new NursesServiceImpl().createNurse().get(0))
                                    .cellNumber("456456")
                                    .build();
        
        nurList.add(newNur);
        
        return nurList;
    }
    
}
