/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.immutable_domain_model_assignment.Service.Impl.EmployeesServiceImpl;

import com.karriem.tp2.immutable_domain_model_assignment.Domain.Model.Employees.GeneralStaffPersonal;
import com.karriem.tp2.immutable_domain_model_assignment.Service.EmployeesService.GeneralStaffService;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author karriem
 */
public class GeneralStaffServiceImpl implements GeneralStaffService{

    private List<GeneralStaffPersonal> genList = new ArrayList<GeneralStaffPersonal>();
    
    @Override
    public List<GeneralStaffPersonal> createGeneralStaff(){
        
        GeneralStaffPersonal genObj = new GeneralStaffPersonal.Builder()
                                            .genID("G1001")
                                            .firstName("Ippo")
                                            .lastName("Makunichi")
                                            .age(20)
                                            .jobDescription("Secretary")
                                            .postalAddress("45 aaaag")
                                            .cellNumber("1545656454")
                                            .build();                                            
        
        genList.add(genObj);
        
        return genList;
    }

    @Override
    public List<GeneralStaffPersonal> createNewGeneralStaff() {
        
        GeneralStaffPersonal newGen = new GeneralStaffPersonal.Builder()
                                            .generalStaff(new GeneralStaffServiceImpl().createGeneralStaff().get(0))
                                            .genID("G1002")
                                            .build();
        
        genList.add(newGen);
        
        return genList;
    }
    
}
