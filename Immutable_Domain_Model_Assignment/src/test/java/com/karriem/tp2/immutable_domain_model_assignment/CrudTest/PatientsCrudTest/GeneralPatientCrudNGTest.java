/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.immutable_domain_model_assignment.CrudTest.PatientsCrudTest;

import com.karriem.tp2.immutable_domain_model_assignment.Domain.Model.Patients.GeneralPatients;
import com.karriem.tp2.immutable_domain_model_assignment.Service.Crud.PatientsCrud.GeneralPatientCrudService;
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
public class GeneralPatientCrudNGTest {
    
    @Mock
    private GeneralPatientCrudService crudService;
    
    public GeneralPatientCrudNGTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
     public void testCreate() {
     
         GeneralPatients cSP = new GeneralPatients.Builder()
                            .address("asd 454564564")
                            .age(45)                            
                            .cellNumber("4545457637")
                            .doctorID("D1001")                            
                            .firstName("jhasfjkhas")
                            .illness("Cancer")
                            .lastName("Jack")
                            .medicine("M1001")
                            .patID("P1201")
                            .treatment("T10001")
                            .build();
                            
         GeneralPatients cSP2 = crudService.persist(cSP);
         when(crudService.persist(cSP)).thenReturn(cSP2);
         Mockito.verify(crudService).persist(cSP);
     }
     
     @Test
     public void testRead(){
         
         GeneralPatients cSP = new GeneralPatients.Builder()
                              .patID("P1201")
                              .build();
         GeneralPatients cSP2 = crudService.find(cSP.getPatID());
         when(crudService.find(cSP.getPatID())).thenReturn(cSP2);
         Mockito.verify(crudService).find(cSP.getPatID());
      
     }
     
     @Test
     public void testUpdate(){
         
         GeneralPatients old = new GeneralPatients.Builder()
                            .address("asd 454564564")
                            .age(45)                            
                            .cellNumber("4545457637")
                            .doctorID("D1001")                            
                            .firstName("jhasfjkhas")
                            .illness("Cancer")
                            .lastName("Jack")
                            .medicine("M1001")
                            .patID("P1201")
                            .treatment("T10001")
                            .build();
         
         GeneralPatients update = new GeneralPatients.Builder()
                                      .patients(old)
                                      .doctorID("D1002")
                                      .build();
         
         old = crudService.merge(update);
         when(crudService.merge(update)).thenReturn(old);
         Mockito.verify(crudService).merge(update);
     }
     
     @Test
     public void testDelete(){
         
         GeneralPatients cSP = new GeneralPatients.Builder()
                            .patID("P1201")
                            .build();
         GeneralPatients cSP2 = crudService.remove(cSP);
         when(crudService.remove(cSP)).thenReturn(cSP2);
         Mockito.verify(crudService).remove(cSP);
     }

    @BeforeClass
    public void setUpClass() throws Exception {
        
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(GeneralPatientCrudService.class);
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
