/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.immutable_domain_model_assignment.CrudTest.PatientsCrudTest;

import com.karriem.tp2.immutable_domain_model_assignment.Domain.Model.Patients.ICUPatients;
import com.karriem.tp2.immutable_domain_model_assignment.Service.Crud.PatientsCrud.ICUCrudService;
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
public class ICUCrudNGTest {
    
    @Mock
    private ICUCrudService crudService;
    
    public ICUCrudNGTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
     public void testCreate() {
     
         ICUPatients cSP = new ICUPatients.Builder()
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
                            .treatment("T10001")
                            .build();
                            
         ICUPatients cSP2 = crudService.persist(cSP);
         when(crudService.persist(cSP)).thenReturn(cSP2);
         Mockito.verify(crudService).persist(cSP);
     }
     
     @Test
     public void testRead(){
         
         ICUPatients cSP = new ICUPatients.Builder()
                              .patID("P1201")
                              .build();
         ICUPatients cSP2 = crudService.find(cSP.getPatID());
         when(crudService.find(cSP.getPatID())).thenReturn(cSP2);
         Mockito.verify(crudService).find(cSP.getPatID());
      
     }
     
     @Test
     public void testUpdate(){
         
     }
     
     @Test
     public void testDelete(){
         
         ICUPatients cSP = new ICUPatients.Builder()
                            .patID("P1201")
                            .build();
         ICUPatients cSP2 = crudService.remove(cSP);
         when(crudService.remove(cSP)).thenReturn(cSP2);
         Mockito.verify(crudService).remove(cSP);
     }

    @BeforeClass
    public void setUpClass() throws Exception {
        
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(ICUCrudService.class);
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
