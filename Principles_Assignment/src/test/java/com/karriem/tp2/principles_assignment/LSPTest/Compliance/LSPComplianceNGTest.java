/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.principles_assignment.LSPTest.Compliance;

import com.karriem.tp2.principles_assignment.LSP.Compliance.Service.Impl.Doctor;
import com.karriem.tp2.principles_assignment.LSP.Compliance.Service.Impl.Nurse;
import com.karriem.tp2.principles_assignment.LSP.Compliance.Service.Staff;
import java.util.ArrayList;
import java.util.List;
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
public class LSPComplianceNGTest {
        
    private List<Staff> staffList = new ArrayList<Staff>();
    
    public LSPComplianceNGTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void getStaffPatient() {
         
         staffList.add(new Doctor());
         staffList.add(new Nurse());
         
         for (Staff s : staffList){
             
             Assert.assertEquals(s.treatPatient(), "Bruce");
         }
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
