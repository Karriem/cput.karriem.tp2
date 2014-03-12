/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.immutable_domain_model_assignment.CrudTest.TreatmentCrudTest;

import com.karriem.tp2.immutable_domain_model_assignment.Domain.Model.Treatment.ICUTreatment;
import com.karriem.tp2.immutable_domain_model_assignment.Service.Crud.TreatmentCrud.ICUTreatmentCrudService;
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
public class ICUTreatmentCrudNGTest {
    
    @Mock
    private ICUTreatmentCrudService crudService;
    
    public ICUTreatmentCrudNGTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
     public void testCreate() {
     
        ICUTreatment cSP = new ICUTreatment.Builder()
                                    .cost(100000)
                                    .doctorID("D1001")
                                    .medicineID("M1001")
                                    .nurseID("N1001")
                                    .treatmentDescription("Recovering from heart surgeory")
                                    .treatmetnID("T1001")
                                    .build();
                            
         ICUTreatment cSP2 = crudService.persist(cSP);
         when(crudService.persist(cSP)).thenReturn(cSP2);
         Mockito.verify(crudService).persist(cSP);
     }
     
     @Test
     public void testRead(){
         
         ICUTreatment cSP = new ICUTreatment.Builder()
                              .treatmetnID("T1001")
                              .build();
         ICUTreatment cSP2 = crudService.find(cSP.getTreatmetnID());
         when(crudService.find(cSP.getTreatmetnID())).thenReturn(cSP2);
         Mockito.verify(crudService).find(cSP.getTreatmetnID());
      
     }
     
     @Test
     public void testUpdate(){
         
     }
     
     @Test
     public void testDelete(){
         
         ICUTreatment cSP = new ICUTreatment.Builder()
                            .treatmetnID("T1001")
                            .build();
         ICUTreatment cSP2 = crudService.remove(cSP);
         when(crudService.remove(cSP)).thenReturn(cSP2);
         Mockito.verify(crudService).remove(cSP);
     }

    @BeforeClass
    public void setUpClass() throws Exception {
        
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(ICUTreatmentCrudService.class);
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
