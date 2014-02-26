/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.software_design_principles.DIP.Violation;

import com.karriem.tp2.software_design_principles.DoctorList;
import com.karriem.tp2.software_design_principles.PatientList;
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
public class DIPNGTest {
    
    public DIPNGTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void getDocPatList() {
     
         Assert.assertEquals("D4", new Hospital().getToTreating().get(0).getDoctor_ID());
     }

    @BeforeClass
    public static void setUpClass() throws Exception {
        DoctorList doc = new DoctorList();
        PatientList pat = new PatientList();
        
        doc.addDoctors();        
        pat.addPatients();
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
