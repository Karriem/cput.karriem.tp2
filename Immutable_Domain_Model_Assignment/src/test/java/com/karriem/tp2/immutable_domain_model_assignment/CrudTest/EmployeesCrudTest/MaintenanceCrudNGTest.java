/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.immutable_domain_model_assignment.CrudTest.EmployeesCrudTest;

import com.karriem.tp2.immutable_domain_model_assignment.Domain.Model.Employees.MaintenancePersonal;
import com.karriem.tp2.immutable_domain_model_assignment.Service.Crud.EmployeesCrud.MaintenanceCrudService;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author karriem
 */
public class MaintenanceCrudNGTest {
    
    @Mock
    private MaintenanceCrudService crudService;
    
    public MaintenanceCrudNGTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void testCreate() {
     
         MaintenancePersonal cSP = new MaintenancePersonal.Builder()
                                         .age(25)
                                         .cellNumber("21455785")
                                         .mID("M1001")
                                         .firstName("Mikhail")
                                         .jobDescription("Repairman")
                                         .lastName("Sissing")
                                         .postalAddress("sh512hsd4h56")
                                         .build();
         MaintenancePersonal cSP2 = crudService.persist(cSP);
         when(crudService.persist(cSP)).thenReturn(cSP2);
         Mockito.verify(crudService).persist(cSP);
     }
     
     @Test
     public void testRead(){
         
         MaintenancePersonal cSP = new MaintenancePersonal.Builder()
                                         .mID("M1001")
                                         .build();
         MaintenancePersonal cSP2 = crudService.find(cSP.getMID());
         when(crudService.find(cSP.getMID())).thenReturn(cSP2);
         Mockito.verify(crudService).find(cSP.getMID());
      
     }
     
     @Test
     public void testUpdate(){
     
         MaintenancePersonal old = new MaintenancePersonal.Builder()
                                         .age(25)
                                         .cellNumber("21455785")
                                         .mID("M1001")
                                         .firstName("Mikhail")
                                         .jobDescription("Repairman")
                                         .lastName("Sissing")
                                         .postalAddress("sh512hsd4h56")
                                         .build();
         
         MaintenancePersonal update = new MaintenancePersonal.Builder()
                                          .maintenance(old)
                                          .lastName("Uchiha")
                                          .build();
         
         old = crudService.merge(update);
         when(crudService.merge(update)).thenReturn(old);
         Mockito.verify(crudService).merge(update);
                                       
     }
     
     @Test
     public void testDelete(){
         
         MaintenancePersonal gSP = new MaintenancePersonal.Builder()
                                         .mID("M1001")
                                         .build();
         MaintenancePersonal gSP2 = crudService.remove(gSP);
         when(crudService.remove(gSP)).thenReturn(gSP2);
         Mockito.verify(crudService).remove(gSP);
     }

    @BeforeClass
    public void setUpClass() throws Exception {
        
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(MaintenanceCrudService.class);
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
