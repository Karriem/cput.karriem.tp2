/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.immutable_domain_model_assignment.PatientsTest;

import com.karriem.tp2.immutable_domain_model_assignment.Config.PatientsConfig.ComaConfig;
import com.karriem.tp2.immutable_domain_model_assignment.Service.PatientsService.ComaService;
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
public class ComaNGTest {
    
    private static ApplicationContext ctx;
    private static ComaService service;
    
    public ComaNGTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void createComaPatients() {
     
         Assert.assertEquals(service.createComa().get(0).getBedNumber(), "45");
     }
     
     @Test
     public void updateComaPatients(){
         
         Assert.assertEquals(service.createNewComa().get(0).getBedNumber(), "78");
     }

    @BeforeClass
    public static void setUpClass() throws Exception {
        
        ctx = new AnnotationConfigApplicationContext(ComaConfig.class);
        service = (ComaService)ctx.getBean("coma");
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
