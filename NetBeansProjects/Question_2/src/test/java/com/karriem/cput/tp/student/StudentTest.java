/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.cput.tp.student;

import java.util.List;
import java.util.Map;
import java.util.Set;
import org.testng.Assert;
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

    GenerateStudent stud = new GenerateStudent();
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void createStudent() { 
        
        List<StudentDetails> studentRec = stud.generateStudent();
        Assert.assertEquals(studentRec.size(), 10);
        
        List<StudentDetails> studentRecD = stud.generateDuplicates(studentRec);
        Assert.assertEquals(studentRecD.size(), 20);
//        stud.displayStudentsDuplicates(studentRecD);
        
        Set<StudentDetails> studentSetRec = stud.generateNonDuplicates(studentRecD, stud.studentSetRec);
        Assert.assertEquals(studentSetRec.size(), 10);
//        stud.displayNonDuplicates(studentSetRec);
        
        Map<String,StudentDetails> studentBook = stud.createPhoneBook(stud.studentBook, studentSetRec);
        Assert.assertEquals(studentBook.size(), 10);
        
        boolean ans = stud.searchStudent(studentBook, "0810479999");
        Assert.assertEquals(ans, true);
        
        if (ans){
            stud.displaySearch("0810479999", studentBook);
        }
     }

    @BeforeClass
    public static void setUpClass() throws Exception {
        GenerateStudent stud = new GenerateStudent();
        
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
