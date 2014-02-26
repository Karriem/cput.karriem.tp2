/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.principles_assignment.EncapsulationTest;

import com.karriem.tp2.principles_assignment.Encapsulation.Config.AppConfig;
import com.karriem.tp2.principles_assignment.Encapsulation.Service.EncapsulationService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author karriem
 */
public class EncapsulationNGTest {
    
    private static ApplicationContext ctx;
    private static EncapsulationService service;
    
    public EncapsulationNGTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void EncapsulationTest() {
         
         Assert.assertEquals(service.patient(), "Bruce Wayne");
     }

    @BeforeClass
    public static void setUpClass() throws Exception {
        
        ctx = new AnnotationConfigApplicationContext(AppConfig.class); 
        
        service = (EncapsulationService)ctx.getBean("encap");
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
