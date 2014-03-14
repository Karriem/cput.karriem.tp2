/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.immutable_domain_model_assignment.DomainTest.EmployeesTest;

import com.karriem.tp2.immutable_domain_model_assignment.Config.EmployeesConfig.MaintenanceConfig;
import com.karriem.tp2.immutable_domain_model_assignment.Service.EmployeesService.MaintenanceService;
import org.junit.Assert;
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
public class MaintenanceStaffNGTest {
    
    private static ApplicationContext ctx;
    private static MaintenanceService service;
    
    public MaintenanceStaffNGTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void createMaintenance() {
     
         Assert.assertEquals(service.createMain().get(0).getPostalAddress(), "544 hfhsdxb");
     }

     @Test
     public void updateMaintenance(){
         
         Assert.assertEquals(service.createNewMain().get(0).getPostalAddress(), "34 asdfjj");
     }
     
    @BeforeClass
    public static void setUpClass() throws Exception {
        
        ctx = new AnnotationConfigApplicationContext(MaintenanceConfig.class);
        service = (MaintenanceService)ctx.getBean("main");
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
