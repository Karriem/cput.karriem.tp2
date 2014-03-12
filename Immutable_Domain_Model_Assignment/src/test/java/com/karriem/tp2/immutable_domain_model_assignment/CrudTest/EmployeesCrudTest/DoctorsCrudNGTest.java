/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.immutable_domain_model_assignment.CrudTest.EmployeesCrudTest;

import com.karriem.tp2.immutable_domain_model_assignment.Domain.Model.Employees.DoctorsPersonal;
import com.karriem.tp2.immutable_domain_model_assignment.Service.Crud.EmployeesCrud.DoctorCrudService;
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
public class DoctorsCrudNGTest {
    
    @Mock
    private DoctorCrudService crudService;
    
    public DoctorsCrudNGTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void testCreate() {
     
         DoctorsPersonal dP = new DoctorsPersonal.Builder()
                                         .age(25)
                                         .cellNumber("21455785")
                                         .docId("D1001")
                                         .firstName("Mikhail")
                                         .jobDescription("GP")
                                         .lastName("Sissing")
                                         .postalAddress("sh512hsd4h56")
                                         .build();
         DoctorsPersonal dP2 = crudService.persist(dP);
         when(crudService.persist(dP)).thenReturn(dP2);
         Mockito.verify(crudService).persist(dP);
     }
     
     @Test
     public void testRead(){
         
         DoctorsPersonal dP = new DoctorsPersonal.Builder()
                                         .docId("D1001")
                                         .build();
         DoctorsPersonal dP2 = crudService.find(dP.getDocID());
         when(crudService.find(dP.getDocID())).thenReturn(dP2);
         Mockito.verify(crudService).find(dP.getDocID());
      
     }
     
     @Test
     public void testUpdate(){
   
     }
     
     @Test
     public void testDelete(){
         
         DoctorsPersonal dP = new DoctorsPersonal.Builder()
                                         .docId("C1001")
                                         .build();
         DoctorsPersonal dP2 = crudService.remove(dP);
         when(crudService.remove(dP)).thenReturn(dP2);
         Mockito.verify(crudService).remove(dP);
     }

    @BeforeClass
    public void setUpClass() throws Exception {
        
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(DoctorCrudService.class);
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
