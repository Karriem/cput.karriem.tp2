/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.principles_assignment.ISPTest.Compliance;

import com.karriem.tp2.principles_assignment.ISP.Compliance.Config.AppConfig;
import com.karriem.tp2.principles_assignment.ISP.Compliance.Service.StaffAge;
import com.karriem.tp2.principles_assignment.ISP.Compliance.Service.StaffWork;
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
public class ISPComplianceNGTest {
    
    private static ApplicationContext ctx;
    private static StaffWork wService;
    private static StaffAge aService;
    
    public ISPComplianceNGTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void getStuff() {
     
         Assert.assertEquals(wService.work(), "Parker");
         Assert.assertEquals(aService.age(), 25);
     }

    @BeforeClass
    public static void setUpClass() throws Exception {
        
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        wService = (StaffWork)ctx.getBean("work");
        aService = (StaffAge)ctx.getBean("age");
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
