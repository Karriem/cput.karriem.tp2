/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.cput.tp.question_1;

import java.util.ArrayList;
import java.util.Collection;
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
 * @author uchiha-clan
 */
public class StudentTest {
    
    public StudentTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    
    Student stud = new Student();
    
     @Test
     public void arraylist() {
                  
         List<String> fullNames;         
         fullNames = stud.createFullNames();         
         Assert.assertEquals(stud.arrayList(fullNames).size(),20);
         
         List<String> listStudents;         
         listStudents = stud.arrayList(fullNames);         
         Assert.assertEquals(stud.hashSet(listStudents).size(),10); 
         
         boolean result = stud.searchName("Karriem");
         Assert.assertEquals(result, true, "Checking if search result was found");
     }

    @BeforeClass
    public static void setUpClass() throws Exception {
        Student stud = new Student();
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
