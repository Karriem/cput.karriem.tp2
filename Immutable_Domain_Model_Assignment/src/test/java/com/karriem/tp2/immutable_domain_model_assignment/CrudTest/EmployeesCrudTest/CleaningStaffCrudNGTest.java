/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.immutable_domain_model_assignment.CrudTest.EmployeesCrudTest;

import com.karriem.tp2.immutable_domain_model_assignment.Config.EmployeesConfig.CleaningStaffConfig;
import com.karriem.tp2.immutable_domain_model_assignment.CrudService;
import com.karriem.tp2.immutable_domain_model_assignment.Domain.Model.Employees.CleaningStaffPersonal;
import com.karriem.tp2.immutable_domain_model_assignment.Service.Crud.EmployeesCrud.CleaningStaffCrudService;
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
public class CleaningStaffCrudNGTest {
    
    @Mock
    private CleaningStaffCrudService crudService;
    
    public CleaningStaffCrudNGTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void testCreate() {
     
         CleaningStaffPersonal cSP = new CleaningStaffPersonal.Builder()
                                         .age(25)
                                         .cellNumber("21455785")
                                         .cleanID("C1001")
                                         .firstName("Mikhail")
                                         .jobDescription("Cleaner")
                                         .lastName("Sissing")
                                         .postalAddress("sh512hsd4h56")
                                         .build();
         CleaningStaffPersonal cSP2 = crudService.persist(cSP);
         when(crudService.persist(cSP)).thenReturn(cSP2);
         Mockito.verify(crudService).persist(cSP);
     }
     
     @Test
     public void testRead(){
         
         CleaningStaffPersonal cSP = new CleaningStaffPersonal.Builder()
                                         .cleanID("C1001")
                                         .build();
         CleaningStaffPersonal cSP2 = crudService.find(cSP.getCleanID());
         when(crudService.find(cSP.getCleanID())).thenReturn(cSP2);
         Mockito.verify(crudService).find(cSP.getCleanID());
      
     }
     
     @Test
     public void testUpdate(){
         
          CleaningStaffPersonal cSPOld = new CleaningStaffPersonal.Builder()
                                         .age(25)
                                         .cellNumber("21455785")
                                         .cleanID("C1001")
                                         .firstName("Mikhail")
                                         .jobDescription("Cleaner")
                                         .lastName("Sissing")
                                         .postalAddress("sh512hsd4h56")
                                         .build();
          
          System.out.println(cSPOld.getAge());
         
           System.out.println(cSPOld.getFirstName());
         CleaningStaffPersonal cSP = new CleaningStaffPersonal.Builder()
                                         .cleanID("C1001")
                                         .age(26)
                                         .build();
         cSPOld = crudService.merge(cSP);
         when(crudService.merge(cSP)).thenReturn(cSPOld);
         Mockito.verify(crudService).merge(cSP);   
         
         System.out.println(cSP.getAge());
        
         System.out.println(cSP.getFirstName());
     }
     
     @Test
     public void testDelete(){
         
         CleaningStaffPersonal cSP = new CleaningStaffPersonal.Builder()
                                         .cleanID("C1001")
                                         .build();
         CleaningStaffPersonal cSP2 = crudService.remove(cSP);
         when(crudService.remove(cSP)).thenReturn(cSP2);
         Mockito.verify(crudService).remove(cSP);
     }

    @BeforeClass
    public void setUpClass() throws Exception {
        
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(CleaningStaffCrudService.class);
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
