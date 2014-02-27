/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.principles_assignment.DIPTest.Compliance;

import com.karriem.tp2.principles_assignment.DIP.Compliance.Service.Config.AppConfig;
import com.karriem.tp2.principles_assignment.DIP.Compliance.Service.HospitalService;
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
public class DIPComplianceNGTest {
    private static HospitalService service;
    private static ApplicationContext ctx;
 
//    private Doctor_GP doc = new Doctor_GP();
    
    public DIPComplianceNGTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void getDocPatList() {
     
         Assert.assertEquals(service.treatPatient().get(0).getDoctor_ID(), "D4");
         Assert.assertEquals(service.treatPatient().get(0).getPatient_ID(), "1000A");
     }

    @BeforeClass
    public static void setUpClass() throws Exception {
       
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        service = (HospitalService)ctx.getBean("doc");
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
