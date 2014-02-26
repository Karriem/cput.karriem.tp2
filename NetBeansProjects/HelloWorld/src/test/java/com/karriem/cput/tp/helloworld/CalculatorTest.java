/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.cput.tp.helloworld;

import junit.framework.Assert;
import org.testng.annotations.Test;

/**
 *
 * @author uchiha-clan
 */
public class CalculatorTest {
    
    public CalculatorTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void add() {
         
        Assert.assertEquals(4, new Calculator().add(2, 2));
     }
     
      @Test
     public void multiply() {
         
        Assert.assertEquals(8, new Calculator().multiply(4, 2));
     }
     
     @Test
     public void divide() {
         
        Assert.assertEquals(6, new Calculator().divide(18, 3));
     }
     
     @Test
     public void subtract(){
         
         Assert.assertEquals(10,new Calculator().subtract(20, 10));
     }
     
     @Test
     public void demo(){
         
         Assert.assertEquals("Karriem", new Calculator().name("Karriem"));
     }

    @org.testng.annotations.BeforeClass
    public static void setUpClass() throws Exception {
        
      Calculator calc = new Calculator();
    }

    @org.testng.annotations.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @org.testng.annotations.BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @org.testng.annotations.AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
