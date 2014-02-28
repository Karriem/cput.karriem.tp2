/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.principles_assignment.PLKTest.Compliance;

import com.karriem.tp2.principles_assignment.PLK.Compliance.Config.AppConfig;
import com.karriem.tp2.principles_assignment.PLK.Compliance.Service.WorkLoad;
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
public class PLKComplianceNGTest {
    
    private static ApplicationContext ctx;
    private static WorkLoad service;
    
    public PLKComplianceNGTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void getWrok() {
         
         Assert.assertEquals(service.getListOfPatients().get(0), "Kent");
         Assert.assertEquals(service.getListOfPatients().get(1), "Sissing");
     }

    @BeforeClass
    public static void setUpClass() throws Exception {
        
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        service = (WorkLoad)ctx.getBean("doc");
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
