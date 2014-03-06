/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.immutable_domain_model_assignment.EmployeesTest;

import com.karriem.tp2.immutable_domain_model_assignment.Config.EmployeesConfig.DoctorConfig;
import com.karriem.tp2.immutable_domain_model_assignment.Service.EmployeesService.DoctorService;
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
public class DoctorNGTest {
    
    private static ApplicationContext ctx;
    private static DoctorService service;
    
    public DoctorNGTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void create() {
     
        Assert.assertEquals(service.createDoctor().get(0).getDocID(), "D1001");
        Assert.assertEquals(service.createDoctor().get(0).getFirstName(), "Karriem");
        Assert.assertEquals(service.createDoctor().get(0).getLastName(), "Petersen");
        Assert.assertEquals(service.createDoctor().get(0).getAge(), 25);
        Assert.assertEquals(service.createDoctor().get(0).getJobDescription(), "Heart Surgeon");
        Assert.assertEquals(service.createDoctor().get(0).getPostalAddress(), "9 Emerald Crescent" );
        Assert.assertEquals(service.createDoctor().get(0).getCellNumber(), "0810479286");
     }
     
     @Test
     public void update(){
         
        Assert.assertEquals(service.createNewDoctor().get(0).getDocID(), "D1001");
        Assert.assertEquals(service.createNewDoctor().get(0).getFirstName(), "Luke");
        Assert.assertEquals(service.createNewDoctor().get(0).getLastName(), "Petersen");
        Assert.assertEquals(service.createNewDoctor().get(0).getAge(), 25);
        Assert.assertEquals(service.createNewDoctor().get(0).getJobDescription(), "Heart Surgeon");
        Assert.assertEquals(service.createNewDoctor().get(0).getPostalAddress(), "9 Emerald Crescent" );
        Assert.assertEquals(service.createNewDoctor().get(0).getCellNumber(), "0810479286");
     }

    @BeforeClass
    public static void setUpClass() throws Exception {
        
        ctx = new AnnotationConfigApplicationContext(DoctorConfig.class);
        service = (DoctorService)ctx.getBean("createDoc");
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
