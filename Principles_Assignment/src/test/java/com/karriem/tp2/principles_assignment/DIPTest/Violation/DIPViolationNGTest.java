/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.principles_assignment.DIPTest.Violation;

import com.karriem.tp2.principles_assignment.DIP.Violation.Hospital;
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
public class DIPViolationNGTest {
    
    private Hospital hos = new Hospital();
    
    public DIPViolationNGTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void getDocPatList() {
     
         Assert.assertEquals(hos.getToTreating().get(0).getDoctor_ID(), "D4");
         Assert.assertEquals(hos.getToTreating().get(0).getPatient_ID(), "1000A");
     }

    @BeforeClass
    public static void setUpClass() throws Exception {
       
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
