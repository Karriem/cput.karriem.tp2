/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.immutable_domain_model_assignment.DomainTest.EquipmentTest;

import com.karriem.tp2.immutable_domain_model_assignment.Config.EquipmentConfig.GeneralConfig;
import com.karriem.tp2.immutable_domain_model_assignment.Service.EquipmentService.GeneralEquipmentService;
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
public class GeneralEquipmentNGTest {
    
    private static ApplicationContext ctx;
    private static GeneralEquipmentService service;
    
    public GeneralEquipmentNGTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void createGeneralEquipment() {
     
         Assert.assertEquals(service.createEquipment().get(0).getQuantity(), 45);
     }

     @Test
     public void updateGeneralEquipment() {
     
         Assert.assertEquals(service.createNewEquipment().get(0).getQuantity(), 5);
     }
     
    @BeforeClass
    public static void setUpClass() throws Exception {
        
        ctx = new AnnotationConfigApplicationContext(GeneralConfig.class);
        service = (GeneralEquipmentService)ctx.getBean("genEquip");
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
