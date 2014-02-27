/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.principles_assignment.LSPTest.Violation;

import com.karriem.tp2.principles_assignment.LSP.Violation.Service.Impl.Doctor;
import com.karriem.tp2.principles_assignment.LSP.Violation.Service.Impl.Nurse;
import com.karriem.tp2.principles_assignment.LSP.Violation.Service.Staff;
import com.karriem.tp2.principles_assignment.Model.Patients;
import java.util.ArrayList;
import java.util.List;
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
public class LSPViolationNGTest {
    
    List<Staff> pList = new ArrayList<Staff>();
    
    public LSPViolationNGTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void surgeoryPatient() {
         
         pList.add(new Doctor());
         pList.add(new Nurse());
         
         for (Staff s : pList){
             
             Assert.assertEquals(s.surgeory(), "Clark");
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
