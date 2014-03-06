/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.immutable_domain_model_assignment.Service.Impl.EmployeesServiceImpl;

import com.karriem.tp2.immutable_domain_model_assignment.Domain.Model.Employees.DoctorsPersonal;
import com.karriem.tp2.immutable_domain_model_assignment.Service.EmployeesService.DoctorService;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author karriem
 */
public class DoctorServiceImpl implements DoctorService{

    private List<DoctorsPersonal> docList = new ArrayList<DoctorsPersonal>();
    
    @Override
    public List<DoctorsPersonal> createDoctor() {
        
        DoctorsPersonal docObj = new DoctorsPersonal.Builder().docId("D1001")
                                        .firstName("Karriem")
                                        .lastName("Petersen")
                                        .age(25)
                                        .jobDescription("Heart Surgeon")
                                        .postalAddress("9 Emerald Crescent")
                                        .cellNumber("0810479286")
                                        .build();
        
        docList.add(docObj);
        
        return docList;
    }

    @Override
    public List<DoctorsPersonal> createNewDoctor() {
        
        DoctorsPersonal newDoc = new DoctorsPersonal.Builder()
                                        .doctor(new DoctorServiceImpl().createDoctor().get(0))
                                        .firstName("Luke")
                                        .build();
        
        docList.add(newDoc);
        
        return docList;
    }
    
}
