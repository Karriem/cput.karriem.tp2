/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.immutable_domain_model_assignment.CrudTest.MedicalAidCrudTest;

import com.karriem.tp2.immutable_domain_model_assignment.Domain.Model.MedicalAid.MedicalAid;
import com.karriem.tp2.immutable_domain_model_assignment.Service.Crud.MedicalAidCrud.MedicalAidCrudService;
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
public class MedicalAidCrudNGTest {
    
    @Mock
    private MedicalAidCrudService crudService;
    
    public MedicalAidCrudNGTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
   @Test
     public void testCreate() {
     
         MedicalAid cSP = new MedicalAid.Builder()
                              .amtCover(5000)
                              .lastName("Petersen")
                              .medicalAidName("LifeCover")
                              .medicalAidNo("15456164894")
                              .patientID("P1001")
                              .typeCover("Full")
                              .build();
         MedicalAid cSP2 = crudService.persist(cSP);
         when(crudService.persist(cSP)).thenReturn(cSP2);
         Mockito.verify(crudService).persist(cSP);
     }
     
     @Test
     public void testRead(){
         
         MedicalAid cSP = new MedicalAid.Builder()
                              .medicalAidNo("15456164894")
                              .build();
         MedicalAid cSP2 = crudService.find(cSP.getMedicalAidNo());
         when(crudService.find(cSP.getMedicalAidNo())).thenReturn(cSP2);
         Mockito.verify(crudService).find(cSP.getMedicalAidNo());
      
     }
     
     @Test
     public void testUpdate(){
         
     }
     
     @Test
     public void testDelete(){
         
         MedicalAid cSP = new MedicalAid.Builder()
                                         .medicalAidNo("15456164894")
                                         .build();
         MedicalAid cSP2 = crudService.remove(cSP);
         when(crudService.remove(cSP)).thenReturn(cSP2);
         Mockito.verify(crudService).remove(cSP);
     }

    @BeforeClass
    public void setUpClass() throws Exception {
        
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(MedicalAidCrudService.class);
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
