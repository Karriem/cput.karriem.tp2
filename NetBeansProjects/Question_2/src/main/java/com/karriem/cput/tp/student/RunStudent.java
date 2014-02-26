/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.cput.tp.student;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author uchiha-clan
 */
public class RunStudent {
    
    public static void main (String[] args){
        
        GenerateStudent stud = new GenerateStudent();
       
        List<StudentDetails> studentRec = stud.generateStudent();
        studentRec = stud.generateDuplicates(studentRec);
        Set<StudentDetails> studentSetRec =  stud.generateNonDuplicates(studentRec, stud.studentSetRec);
        stud.displayStudentsDuplicates(studentRec);
        stud.displayNonDuplicates(studentSetRec);
        Map<String, StudentDetails> studentBook = stud.createPhoneBook(stud.studentBook, studentSetRec);
//        String choice = stud.searchStudent(studentBook);
//        
//        if (choice != null){
//            stud.displaySerach(choice, studentBook);
//        }
    }
}
