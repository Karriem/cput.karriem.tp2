/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.cput.tp.question_1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author uchiha-clan
 */
public class Student {
    
    String[] names = {"Karriem", "Luke", "Sasuke", "Naruto", "Gon", "Killua", "Alex", "Ichigo", "Natsu", "Gray"}; 
        String[] lastNames = {"Petersen", "Davids", "Uchiha", "Uzumaki", "Freecss", "Zoldyk", "Daniels", "Kurosaki", "Dragneel", "Fullbuster"};
        String[] phoneNo = {"0810478963", "1111111112", "1111111113", "1111111114", "1111111115", "1111111116", "1111111117", "1111111118", "1111111119", "1111111121"};
                
        List<String> listStudents = new ArrayList<String>();          
        List<String> fullNames = new ArrayList<String>();
        
    public List<String> createFullNames(){          
        int counter = 0;
             
        while (counter < 10){
            
            fullNames.add(names[counter] + " " + lastNames[counter]);
            
            counter ++;
        }
        
        return fullNames;
    }

    public List<String> arrayList(List<String> fullNames){
       
        for (String name : fullNames){
            listStudents.add(name); 
            listStudents.add(name);            
        } 
        
        System.out.println("Duplicates: " + listStudents);
        
        return listStudents;
    }   
    
    public Set<String> hashSet(List<String> listStudents){
        
        Set<String> hashSetStudents = new HashSet<String>(listStudents);
        
        System.out.println("Non duplicates: " +hashSetStudents);
        
        return hashSetStudents;
    }
    
    public void treeSet(List<String> listStudents){
        
        Set<String> treeSetStudents = new TreeSet(listStudents);
        
        System.out.println("Sorted non duplicates: " + treeSetStudents);
    }
   
    public boolean searchName(String result){
        
//        Scanner input = new Scanner(System.in);
        boolean nameResult = false;
        
//        System.out.println("Please enter name: ");
//        String result = input.next();
        
        for (String name : names){
            if (name.equalsIgnoreCase(result)){
                System.out.println("Name has been found");
                nameResult = true;
//                System.exit(0);
            }           
        }
        
        if (nameResult == false)
            System.out.println("No record found");
        
        return nameResult;
    }
}
