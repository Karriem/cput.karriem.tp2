/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.immutable_domain_model_assignment.CrudTest.EmployeesCrudTest;

import com.karriem.tp2.immutable_domain_model_assignment.Domain.Model.Employees.GeneralStaffPersonal;
import com.karriem.tp2.immutable_domain_model_assignment.Service.Crud.EmployeesCrud.GeneralStaffCrudService;
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
public class GeneralStaffCrudNGTest {
    
    @Mock
    private GeneralStaffCrudService crudService;
    
    public GeneralStaffCrudNGTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
     public void testCreate() {
     
         GeneralStaffPersonal cSP = new GeneralStaffPersonal.Builder()
                                         .age(25)
                                         .cellNumber("21455785")
                                         .genID("G1001")
                                         .firstName("Mikhail")
                                         .jobDescription("Secretary")
                                         .lastName("Sissing")
                                         .postalAddress("sh512hsd4h56")
                                         .build();
         GeneralStaffPersonal cSP2 = crudService.persist(cSP);
         when(crudService.persist(cSP)).thenReturn(cSP2);
         Mockito.verify(crudService).persist(cSP);
     }
     
     @Test
     public void testRead(){
         
         GeneralStaffPersonal cSP = new GeneralStaffPersonal.Builder()
                                         .genID("G1001")
                                         .build();
         GeneralStaffPersonal cSP2 = crudService.find(cSP.getGenID());
         when(crudService.find(cSP.getGenID())).thenReturn(cSP2);
         Mockito.verify(crudService).find(cSP.getGenID());
      
     }
     
     @Test
     public void testUpdate(){
         
     }
     
     @Test
     public void testDelete(){
         
         GeneralStaffPersonal gSP = new GeneralStaffPersonal.Builder()
                                         .genID("G1001")
                                         .build();
         GeneralStaffPersonal gSP2 = crudService.remove(gSP);
         when(crudService.remove(gSP)).thenReturn(gSP2);
         Mockito.verify(crudService).remove(gSP);
     }

    @BeforeClass
    public void setUpClass() throws Exception {
        
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(GeneralStaffCrudService.class);
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
