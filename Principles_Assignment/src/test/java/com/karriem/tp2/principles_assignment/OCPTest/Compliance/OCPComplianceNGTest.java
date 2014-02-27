/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.principles_assignment.OCPTest.Compliance;

import com.karriem.tp2.principles_assignment.Model.Doctors;
import com.karriem.tp2.principles_assignment.OCP.Compliance.Service.Impl.Doctor;
import com.karriem.tp2.principles_assignment.OCP.Compliance.Service.Impl.Nurse;
import com.karriem.tp2.principles_assignment.OCP.Compliance.Service.Impl.WorkStaff;
import junit.framework.Assert;
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
public class OCPComplianceNGTest {
    
    private WorkStaff w = new WorkStaff();
    
    public OCPComplianceNGTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void staffMember() {
         
         Assert.assertEquals(w.getStaff().get(0), "Luke");
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
