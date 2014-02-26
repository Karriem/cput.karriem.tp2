/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.cput.tp.question_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 *
 * @author uchiha-clan
 */
public class StudentMain {
    
    public static void main(String[] args){
        
        Student stud = new Student();
        List<String> fullNames;
        List<String> listStudents;
        
        fullNames = stud.createFullNames();
        listStudents = stud.arrayList(fullNames);
        stud.hashSet(listStudents);
        stud.treeSet(listStudents); 
//        stud.searchName();
    }
}
