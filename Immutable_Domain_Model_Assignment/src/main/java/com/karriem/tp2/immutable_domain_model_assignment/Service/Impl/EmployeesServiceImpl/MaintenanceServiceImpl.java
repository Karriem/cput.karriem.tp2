/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.immutable_domain_model_assignment.Service.Impl.EmployeesServiceImpl;

import com.karriem.tp2.immutable_domain_model_assignment.Domain.Model.Employees.MaintenancePersonal;
import com.karriem.tp2.immutable_domain_model_assignment.Service.EmployeesService.MaintenanceService;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author karriem
 */
public class MaintenanceServiceImpl implements MaintenanceService{

    private List<MaintenancePersonal> mainList = new ArrayList<MaintenancePersonal>();
    
    @Override
    public List<MaintenancePersonal> createMain() {
       
        MaintenancePersonal mainObj = new MaintenancePersonal.Builder()
                                            .mID("M1001")
                                            .firstName("Lucifer")
                                            .lastName("Chrollo")
                                            .age(24)
                                            .jobDescription("Repairman")
                                            .postalAddress("544 hfhsdxb")
                                            .cellNumber("47923259+5")
                                            .build();
                                            
        
        mainList.add(mainObj);
        
        return mainList;
    }

    @Override
    public List<MaintenancePersonal> createNewMain() {
        
         MaintenancePersonal newMain = new MaintenancePersonal.Builder()
                                            .maintenance(new MaintenanceServiceImpl().createMain().get(0))
                                            .postalAddress("34 asdfjj")
                                            .build();
        
        mainList.add(newMain);
        
        return mainList;
    }
    
}
