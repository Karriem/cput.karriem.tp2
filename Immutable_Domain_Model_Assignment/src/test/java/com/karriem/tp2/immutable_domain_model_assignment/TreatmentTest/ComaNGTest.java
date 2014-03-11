/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.immutable_domain_model_assignment.TreatmentTest;


import com.karriem.tp2.immutable_domain_model_assignment.Config.TreatmentConfig.ComaTreatmentConfig;
import com.karriem.tp2.immutable_domain_model_assignment.Service.TreatmentService.ComaTreatmentService;

import org.junit.Assert;
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
public class ComaNGTest {
    
    private static ApplicationContext ctx;
    private static ComaTreatmentService service;
    
    public ComaNGTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void createComa() {
         
         Assert.assertEquals(service.createComa().get(0).getDoctorID(), "D1001");
     }
     
     @Test
     public void updateComa() {
     
         Assert.assertEquals(service.createNewComa().get(0).getDoctorID(), "D1005");
     }

    @BeforeClass
    public static void setUpClass() throws Exception {
        
        ctx = new AnnotationConfigApplicationContext(ComaTreatmentConfig.class);
        service = (ComaTreatmentService)ctx.getBean("comaT");
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
