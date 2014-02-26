/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.software_design_principles.Polymorphism;

import com.karriem.tp2.software_design_principles.Encapsulation.Config.AppConfig;
import com.karriem.tp2.software_design_principles.Model.Patients;
import com.karriem.tp2.software_design_principles.CriticalPatient;
import com.karriem.tp2.software_design_principles.Polymorphism.Service.PatientService;
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
public class PolymorphismNGTest {
    
    private static ApplicationContext ctx;
    private static PatientService service;
    
    public PolymorphismNGTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void polyTest() {         
         
        Patients pat = new CriticalPatient();
        
        pat.setFirstName("Clark");        
     
        Assert.assertEquals("Clark", pat.getFirstName());
     }

    @BeforeClass
    public static void setUpClass() throws Exception {
        
//        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
//        service = (PatientService)ctx.getBean("poly");
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
