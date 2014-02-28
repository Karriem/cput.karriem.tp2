/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.principles_assignment.PLKTest.Violation;

import com.karriem.tp2.principles_assignment.PLK.Violation.Config.AppConfig;
import com.karriem.tp2.principles_assignment.PLK.Violation.Service.WorkLoad;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.Assert;
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
public class PLKViolationNGTest {
    
    private static ApplicationContext ctx;
    private static WorkLoad service;
    
    public PLKViolationNGTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void getLoad() {
     
         Assert.assertEquals(service.getWork().get(0), "Wayne");
         Assert.assertEquals(service.getWork().get(1), "Fullbuster");
     }

    @BeforeClass
    public static void setUpClass() throws Exception {
        
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        service = (WorkLoad)ctx.getBean("nur");
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
