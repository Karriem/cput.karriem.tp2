/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp.tddassignment;

import com.karriem.tp.tddassignment.config.AppConfig;
import com.karriem.tp.tddassignment.service.TDDService;
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
 * @author uchiha-clan
 */
public class TDDTestNGTest {
    
    private static ApplicationContext ctx;
    private static TDDService service;
    
    public TDDTestNGTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void add() {
         
        Assert.assertEquals("The two numbers are not equal", 8, service.add(4, 4));
     }
     
     @Test
     public void floatNum(){
         
       Assert.assertEquals("Two floats are not equal", 12.9, service.floatNum(8.4, 4.5));
     }
     
     @Test
     public void integer(){
         
         Assert.assertEquals("Return value not boolean", service.integer(1,1), true);
     }
     
     @Test
     public void Object(){
         
         Assert.assertEquals(service.object(), service);
     }
     
     @Test
     public void ObjectSame(){
         
         Assert.assertNotSame(service.object(), ctx);
     }
     
     @Test
     public void truth(){
         
         Assert.assertTrue("The condition is not true", service.truth());
     }
     
     @Test
     public void falsity(){
         
         Assert.assertFalse("The condition is not false", service.falsity());
     }
     
     @Test
     public void notNullValue(){
         
         Assert.assertNotNull(service.object());
     }
     
     @Test
     public void nullValue(){
         
         Assert.assertNull(service.objectNull());
     }

     @Test
     public void failTest(){
         
         Assert.fail("This is a deliberate fail");
     }
     
    @BeforeClass
    public static void setUpClass() throws Exception {
        
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        service = (TDDService)ctx.getBean("add");
        service = (TDDService)ctx.getBean("float");
        service = (TDDService)ctx.getBean("integer");
        service = (TDDService)ctx.getBean("obj");
        service = (TDDService)ctx.getBean("notSame");
        service = (TDDService)ctx.getBean("truth");
        service = (TDDService)ctx.getBean("falsity");
        service = (TDDService)ctx.getBean("null");
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
