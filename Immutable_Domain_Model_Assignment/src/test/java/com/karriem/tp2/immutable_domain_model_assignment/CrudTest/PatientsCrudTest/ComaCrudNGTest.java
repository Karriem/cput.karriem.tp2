/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.immutable_domain_model_assignment.CrudTest.PatientsCrudTest;

import com.karriem.tp2.immutable_domain_model_assignment.Domain.Model.Patients.ComaPatients;
import com.karriem.tp2.immutable_domain_model_assignment.Service.Crud.PatientsCrud.ComaCrudService;
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
public class ComaCrudNGTest {
    
    @Mock
    private ComaCrudService crudService;
    
    public ComaCrudNGTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
     public void testCreate() {
     
         ComaPatients cSP = new ComaPatients.Builder()
                            .address("asd 454564564")
                            .age(45)
                            .bedNumber("4")
                            .cellNumber("4545457637")
                            .doctorID("D1001")
                            .durationOfComa("45 Days")
                            .firstName("jhasfjkhas")
                            .illness("Cancer")
                            .lastName("Jack")
                            .medicine("M1001")
                            .patID("P1201")
                            .treatment("T10001")
                            .build();
                            
         ComaPatients cSP2 = crudService.persist(cSP);
         when(crudService.persist(cSP)).thenReturn(cSP2);
         Mockito.verify(crudService).persist(cSP);
     }
     
     @Test
     public void testRead(){
         
         ComaPatients cSP = new ComaPatients.Builder()
                              .patID("P1201")
                              .build();
         ComaPatients cSP2 = crudService.find(cSP.getPatID());
         when(crudService.find(cSP.getPatID())).thenReturn(cSP2);
         Mockito.verify(crudService).find(cSP.getPatID());
      
     }
     
     @Test
     public void testUpdate(){
         
     }
     
     @Test
     public void testDelete(){
         
         ComaPatients cSP = new ComaPatients.Builder()
                            .patID("P1201")
                            .build();
         ComaPatients cSP2 = crudService.remove(cSP);
         when(crudService.remove(cSP)).thenReturn(cSP2);
         Mockito.verify(crudService).remove(cSP);
     }

    @BeforeClass
    public void setUpClass() throws Exception {
        
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(ComaCrudService.class);
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
