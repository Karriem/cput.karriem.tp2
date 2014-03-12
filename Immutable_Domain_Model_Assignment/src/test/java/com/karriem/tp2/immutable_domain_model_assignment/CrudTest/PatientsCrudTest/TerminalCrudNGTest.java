/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.immutable_domain_model_assignment.CrudTest.PatientsCrudTest;

import com.karriem.tp2.immutable_domain_model_assignment.Domain.Model.Patients.TerminalPatients;
import com.karriem.tp2.immutable_domain_model_assignment.Service.Crud.PatientsCrud.TerminalCrudService;
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
public class TerminalCrudNGTest {
    
    @Mock
    private TerminalCrudService crudService;
    
    public TerminalCrudNGTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void testCreate() {
     
         TerminalPatients cSP = new TerminalPatients.Builder()
                            .address("asd 454564564")
                            .age(45)  
                            .bedNumber("458")
                            .cellNumber("4545457637")
                            .doctorID("D1001")                            
                            .firstName("jhasfjkhas")
                            .illness("Cancer")
                            .lastName("Jack")
                            .medicine("M1001")
                            .patID("P1201")
                            .timeLeft("2 Days")
                            .treatment("T10001")
                            .build();
                            
         TerminalPatients cSP2 = crudService.persist(cSP);
         when(crudService.persist(cSP)).thenReturn(cSP2);
         Mockito.verify(crudService).persist(cSP);
     }
     
     @Test
     public void testRead(){
         
         TerminalPatients cSP = new TerminalPatients.Builder()
                              .patID("P1201")
                              .build();
         TerminalPatients cSP2 = crudService.find(cSP.getPatID());
         when(crudService.find(cSP.getPatID())).thenReturn(cSP2);
         Mockito.verify(crudService).find(cSP.getPatID());
      
     }
     
     @Test
     public void testUpdate(){
         
     }
     
     @Test
     public void testDelete(){
         
         TerminalPatients cSP = new TerminalPatients.Builder()
                            .patID("P1201")
                            .build();
         TerminalPatients cSP2 = crudService.remove(cSP);
         when(crudService.remove(cSP)).thenReturn(cSP2);
         Mockito.verify(crudService).remove(cSP);
     }

    @BeforeClass
    public void setUpClass() throws Exception {
        
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(TerminalCrudService.class);
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
