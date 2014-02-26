package com.karriem.cput.tp.student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author uchiha-clan
 */
public class GenerateStudent {    
   
    List<StudentDetails> studentRec = new ArrayList<StudentDetails>();
    Set<StudentDetails> studentSetRec = new HashSet<StudentDetails>();
    Map<String, StudentDetails> studentBook = new HashMap<String, StudentDetails>();
    
    public List<StudentDetails> generateStudent(){
        
        StudentDetails stud01 = new StudentDetails();      
        stud01.setFirstName("Karriem");
        stud01.setLastName("Petersen");
        stud01.setStudNo("211111279");
        stud01.setPhoneNo("0810479999");
        
        StudentDetails stud02 = new StudentDetails();
        stud02.setFirstName("Luke");
        stud02.setLastName("Davids");
        stud02.setStudNo("210075236");
        stud02.setPhoneNo("0810550669");
        
        StudentDetails stud03 = new StudentDetails();
        stud03.setFirstName("Alex");
        stud03.setLastName("Daniels");
        stud03.setStudNo("211778548");
        stud03.setPhoneNo("484842229");
        
        StudentDetails stud04 = new StudentDetails();
        stud04.setFirstName("Gon");
        stud04.setLastName("Freecss");
        stud04.setStudNo("214588996");
        stud04.setPhoneNo("124456398");
        
        StudentDetails stud05 = new StudentDetails();
        stud05.setFirstName("Killua");
        stud05.setLastName("Zoldyk");
        stud05.setStudNo("214588333");
        stud05.setPhoneNo("2188848445");
        
        StudentDetails stud06 = new StudentDetails();
        stud06.setFirstName("Naruto");
        stud06.setLastName("Uzamaki");
        stud06.setStudNo("211787452");
        stud06.setPhoneNo("0322665548");
        
        StudentDetails stud07 = new StudentDetails();
        stud07.setFirstName("Sasuke");
        stud07.setLastName("Uchiha");
        stud07.setStudNo("211177744");
        stud07.setPhoneNo("0211117458");
        
        StudentDetails stud08 = new StudentDetails();
        stud08.setFirstName("Ichigo");
        stud08.setLastName("Kurasaki");
        stud08.setStudNo("2114484525");
        stud08.setPhoneNo("000147774");
        
        StudentDetails stud09 = new StudentDetails();
        stud09.setFirstName("Natsu");
        stud09.setLastName("Dragneel");
        stud09.setStudNo("211178832");
        stud09.setPhoneNo("0114778505");
        
        StudentDetails stud10 = new StudentDetails();
        stud10.setFirstName("Gray");
        stud10.setLastName("Fullbuster");
        stud10.setStudNo("213568974");
        stud10.setPhoneNo("0225588996");
        
       studentRec.add(stud01);
       studentRec.add(stud02);
       studentRec.add(stud03);
       studentRec.add(stud04);
       studentRec.add(stud05);
       studentRec.add(stud06);
       studentRec.add(stud07);
       studentRec.add(stud08);
       studentRec.add(stud09);
       studentRec.add(stud10);
        
       return studentRec;
    }
    
    public void displayStudentsDuplicates(List<StudentDetails> studentRec){
        
        System.out.println("*************************************************************");
        System.out.println("This is the list with duplicates");
        
        for (StudentDetails stud : studentRec){                
                
                System.out.println("Student Full Name: " + stud.getFirstName() + " " + stud.getLastName()); 
                System.out.println("Student Number" + " " + stud.getStudNo());
                System.out.println("Phone Number: " + " " + stud.getPhoneNo());
                System.out.println("");
            }
        
        System.out.println("*************************************************************");
        }
    
    public List<StudentDetails> generateDuplicates(List<StudentDetails> studentRec){
        
        StudentDetails stud11 = new StudentDetails();      
        stud11.setFirstName("Karriem");
        stud11.setLastName("Petersen");
        stud11.setStudNo("211111279");
        stud11.setPhoneNo("0810479999");
        
        StudentDetails stud12 = new StudentDetails();
        stud12.setFirstName("Luke");
        stud12.setLastName("Davids");
        stud12.setStudNo("210075236");
        stud12.setPhoneNo("0810550669");
        
        StudentDetails stud13 = new StudentDetails();
        stud13.setFirstName("Alex");
        stud13.setLastName("Daniels");
        stud13.setStudNo("211778548");
        stud13.setPhoneNo("484842229");
        
        StudentDetails stud14 = new StudentDetails();
        stud14.setFirstName("Gon");
        stud14.setLastName("Freecss");
        stud14.setStudNo("214588996");
        stud14.setPhoneNo("124456398");
        
        StudentDetails stud15 = new StudentDetails();
        stud15.setFirstName("Killua");
        stud15.setLastName("Zoldyk");
        stud15.setStudNo("214588333");
        stud15.setPhoneNo("2188848445");
        
        StudentDetails stud16 = new StudentDetails();
        stud16.setFirstName("Naruto");
        stud16.setLastName("Uzamaki");
        stud16.setStudNo("211787452");
        stud16.setPhoneNo("0322665548");
        
        StudentDetails stud17 = new StudentDetails();
        stud17.setFirstName("Sasuke");
        stud17.setLastName("Uchiha");
        stud17.setStudNo("211177744");
        stud17.setPhoneNo("0211117458");
        
        StudentDetails stud18 = new StudentDetails();
        stud18.setFirstName("Ichigo");
        stud18.setLastName("Kurasaki");
        stud18.setStudNo("2114484525");
        stud18.setPhoneNo("000147774");
        
        StudentDetails stud19 = new StudentDetails();
        stud19.setFirstName("Natsu");
        stud19.setLastName("Dragneel");
        stud19.setStudNo("211178832");
        stud19.setPhoneNo("0114778505");
        
        StudentDetails stud20 = new StudentDetails();
        stud20.setFirstName("Gray");
        stud20.setLastName("Fullbuster");
        stud20.setStudNo("213568974");
        stud20.setPhoneNo("0225588996");
        
       studentRec.add(stud11);
       studentRec.add(stud12);
       studentRec.add(stud13);
       studentRec.add(stud14);
       studentRec.add(stud15);
       studentRec.add(stud16);
       studentRec.add(stud17);
       studentRec.add(stud18);
       studentRec.add(stud19);
       studentRec.add(stud20);
        
       return studentRec;
    }
    
    public Set<StudentDetails> generateNonDuplicates(List<StudentDetails> studentRec, Set<StudentDetails> studentSetRec){
        
        for (StudentDetails stud : studentRec){
            studentSetRec.add(stud);
        }
        
        return studentSetRec;
    }
    
    public void displayNonDuplicates(Set<StudentDetails> studentSetRec){
        
        System.out.println("This is the list with non duplicates");
        
        for (StudentDetails stud : studentSetRec){                
                
                System.out.println("Student Full Name: " + stud.getFirstName() + " " + stud.getLastName()); 
                System.out.println("Student Number" + " " + stud.getStudNo());
                System.out.println("Phone Number: " + " " + stud.getPhoneNo());
                System.out.println("");
            
        }
        
        System.out.println("*************************************************************");
    }
    
    public Map<String,StudentDetails> createPhoneBook(Map<String, StudentDetails> studentBook, Set<StudentDetails> studentSetRec){
        
        for (StudentDetails stud : studentSetRec){
            studentBook.put(stud.getPhoneNo(), stud);
        }
        
        return studentBook;
    }
    
    public boolean searchStudent(Map<String, StudentDetails> studentBook, String choice){
        
//        Scanner input = new Scanner(System.in);
        
//        System.out.println("###########################################");
//        System.out.println("Please enter the phone number of student: ");
        
//        String choice = input.nextLine();
        
        boolean ans = false;
        
        if (studentBook.containsKey(choice)){
        
            System.out.println("Record found");
            ans = true;
        }
        else{
            
            System.out.println("No Record found");            
        }
            
        
        return ans;
    }  
    
    public void displaySearch(String choice, Map<String, StudentDetails> studentBook){
        
        if (studentBook.containsKey(choice)){ 
            System.out.println("Student First Name: " + studentBook.get(choice).getFirstName());
            System.out.println("Student Last Name: " + studentBook.get(choice).getLastName());
            System.out.println("Student Number: " + studentBook.get(choice).getStudNo());
            System.out.println("Student Phone Number: " + studentBook.get(choice).getPhoneNo());
        }
        else
            System.exit(0);
    }
}