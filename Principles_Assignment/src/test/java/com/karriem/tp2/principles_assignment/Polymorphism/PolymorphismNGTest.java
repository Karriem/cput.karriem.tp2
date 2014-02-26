/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.principles_assignment.Polymorphism;

import com.karriem.tp2.principles_assignment.Polymorphism.Service.Impl.DoctorServiceImpl;
import org.springframework.context.ApplicationContext;
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
    private static DoctorServiceImpl service = new DoctorServiceImpl();
    
    public PolymorphismNGTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void polyTest() {   
     
        Assert.assertEquals("Mikhail", service.getDoctor());
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
