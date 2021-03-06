/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.immutable_domain_model_assignment.DomainTest.MedicineTest;

import com.karriem.tp2.immutable_domain_model_assignment.Config.MedicineConfig.MedicineConfig;
import com.karriem.tp2.immutable_domain_model_assignment.Service.MedicineService.MedicineService;
import junit.framework.Assert;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
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
public class MedicineNGTest {
    
    private static ApplicationContext ctx;
    private static MedicineService service;
    
    public MedicineNGTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void createMedicine() {
     
         Assert.assertEquals(service.createMedicine().get(0).getQuantity(), 5);
     }
     
     @Test
     public void updateMedicine() {
     
         Assert.assertEquals(service.createNewMedicine().get(0).getQuantity(), 8);
     }

    @BeforeClass
    public static void setUpClass() throws Exception {
        
        ctx = new AnnotationConfigApplicationContext(MedicineConfig.class);
        service = (MedicineService)ctx.getBean("medicine");
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
