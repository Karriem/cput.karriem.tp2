/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.immutable_domain_model_assignment.DomainTest.EmployeesTest;

import com.karriem.tp2.immutable_domain_model_assignment.Config.EmployeesConfig.NursesConfig;
import com.karriem.tp2.immutable_domain_model_assignment.Service.EmployeesService.NursesService;
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
public class NursesNGTest {
    
    private static ApplicationContext ctx;
    private static NursesService service;
    
    public NursesNGTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void createNurse() {
     
         Assert.assertEquals(service.createNurse().get(0).getCellNumber(), "455488235");
     }

     @Test
     public void updateNurse(){
         
         Assert.assertEquals(service.createNewNurse().get(0).getCellNumber(), "456456");
     }
     
    @BeforeClass
    public static void setUpClass() throws Exception {
        
        ctx = new AnnotationConfigApplicationContext(NursesConfig.class);
        service = (NursesService)ctx.getBean("nur");
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
