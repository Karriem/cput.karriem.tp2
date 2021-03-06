/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.immutable_domain_model_assignment.CrudTest.TreatmentCrudTest;

import com.karriem.tp2.immutable_domain_model_assignment.Domain.Model.Treatment.GeneralTreatments;
import com.karriem.tp2.immutable_domain_model_assignment.Service.Crud.TreatmentCrud.GeneralTreatmentCrudService;
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
public class GeneralTreatmentCrudNGTest {
    
    @Mock
    private GeneralTreatmentCrudService crudService;
    
    public GeneralTreatmentCrudNGTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
     public void testCreate() {
     
        GeneralTreatments cSP = new GeneralTreatments.Builder()
                                    .cost(2000)
                                    .doctorID("D1001")
                                    .medicineID("M1001")
                                    .nurseID("N1001")
                                    .treatmentDescription("Check up")
                                    .treatmetnID("T1001")
                                    .build();
                            
         GeneralTreatments cSP2 = crudService.persist(cSP);
         when(crudService.persist(cSP)).thenReturn(cSP2);
         Mockito.verify(crudService).persist(cSP);
     }
     
     @Test
     public void testRead(){
         
         GeneralTreatments cSP = new GeneralTreatments.Builder()
                              .treatmetnID("T1001")
                              .build();
         GeneralTreatments cSP2 = crudService.find(cSP.getTreatmetnID());
         when(crudService.find(cSP.getTreatmetnID())).thenReturn(cSP2);
         Mockito.verify(crudService).find(cSP.getTreatmetnID());
      
     }
     
     @Test
     public void testUpdate(){
         
         GeneralTreatments old = new GeneralTreatments.Builder()
                                    .cost(2000)
                                    .doctorID("D1001")
                                    .medicineID("M1001")
                                    .nurseID("N1001")
                                    .treatmentDescription("Check up")
                                    .treatmetnID("T1001")
                                    .build();
         
         GeneralTreatments update = new GeneralTreatments.Builder()
                                        .genTreatment(old)
                                        .nurseID("N1005")
                                        .build();
         
         old = crudService.merge(update);
         when(crudService.merge(update)).thenReturn(old);
         Mockito.verify(crudService).merge(update);
     }
     
     @Test
     public void testDelete(){
         
         GeneralTreatments cSP = new GeneralTreatments.Builder()
                            .treatmetnID("T1001")
                            .build();
         GeneralTreatments cSP2 = crudService.remove(cSP);
         when(crudService.remove(cSP)).thenReturn(cSP2);
         Mockito.verify(crudService).remove(cSP);
     }

    @BeforeClass
    public void setUpClass() throws Exception {
        
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(GeneralTreatmentCrudService.class);
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
