/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.immutable_domain_model_assignment.DomainTest.MedicalAidTest;

import com.karriem.tp2.immutable_domain_model_assignment.Config.MedicalAidConfig.MedicalAidConfig;
import com.karriem.tp2.immutable_domain_model_assignment.Service.MedicalAidService.MedicalAidService;
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
public class MedicalAidNGTest {
    
    private static ApplicationContext ctx;
    private static MedicalAidService service;
    
    public MedicalAidNGTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void createMedicalAid() {
         
         Assert.assertEquals(service.createMedicalAid().get(0).getLastName(), "Shepard");
     }
     
     @Test
     public void updateMedicalAid(){
         
         Assert.assertEquals(service.createNewMedicalAid().get(0).getLastName(), "Sheperd");
     }

    @BeforeClass
    public static void setUpClass() throws Exception {
        
        ctx = new AnnotationConfigApplicationContext(MedicalAidConfig.class);
        service = (MedicalAidService)ctx.getBean("aid");
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
