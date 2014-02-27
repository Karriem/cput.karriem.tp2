/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.principles_assignment.SRPTest.Violation;

import com.karriem.tp2.principles_assignment.SRP.Compliance.Config.AppConfig;
import com.karriem.tp2.principles_assignment.SRP.Compliance.Service.StaffAgeService;
import com.karriem.tp2.principles_assignment.SRP.Compliance.Service.StaffNameService;
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
public class SRPViolationNGTest {
    
    private static StaffAgeService aService;
    private static StaffNameService nService;
    private static ApplicationContext ctx;
    
    public SRPViolationNGTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
     public void getStaff() {
     
         Assert.assertEquals(aService.getDoctorAge(), 23);
         Assert.assertEquals(nService.getDoctorName(), "Karriem");
     }

    @BeforeClass
    public static void setUpClass() throws Exception {
        
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        aService = (StaffAgeService)ctx.getBean("age");
        nService = (StaffNameService)ctx.getBean("name");
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
