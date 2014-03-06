/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.immutable_domain_model_assignment.Service.Impl.EmployeesServiceImpl;

import com.karriem.tp2.immutable_domain_model_assignment.Domain.Model.Employees.CleaningStaffPersonal;
import com.karriem.tp2.immutable_domain_model_assignment.Service.EmployeesService.CleaningStaffService;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author karriem
 */
public class CleaningStaffServiceImpl implements CleaningStaffService{
    
    private List<CleaningStaffPersonal> cleanList = new ArrayList<CleaningStaffPersonal>();
    
    @Override
    public List<CleaningStaffPersonal> createCleaner() {
        
        CleaningStaffPersonal cleanObj = new CleaningStaffPersonal.Builder()
                                            .cleanID("C1001")
                                            .firstName("Alexander")
                                            .lastName("Daniels")
                                            .age(24)
                                            .jobDescription("Cleaner")
                                            .cellNumber("12515161")
                                            .postalAddress("8 kjfkasgnong")
                                            .build();
        
        cleanList.add(cleanObj);
        
        return cleanList;
    }

    @Override
    public List<CleaningStaffPersonal> createNewCleaner() {
        
        CleaningStaffPersonal newClean = new CleaningStaffPersonal.Builder()
                                            .claeaningStaff(new CleaningStaffServiceImpl().createCleaner().get(0))
                                            .age(23)
                                            .build();                                       
        
        cleanList.add(newClean);
        
        return cleanList;
    }
}
