/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.principles_assignment;

import com.karriem.tp2.principles_assignment.Model.Nurses;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author karriem
 */
public class NursesList {
    
    private List<Nurses> nurList = new ArrayList<Nurses>();
    
    public List<Nurses> addNurses(){
        
        Nurses nur1 = new Nurses();
        Nurses nur2 = new Nurses();
        Nurses nur3 = new Nurses();
        Nurses nur4 = new Nurses();
        Nurses nur5 = new Nurses();
        
        nur1.setStaffID("N1001");
        nur1.setFirstName("Lucy");
        nur1.setLastName("Heartfillia");
        nur1.setAge(21);
        nur1.setJobDescription("General Nurse");
        
        nur2.setStaffID("N1002");
        nur2.setFirstName("Ezra");
        nur2.setLastName("Scarlet");
        nur2.setAge(22);
        nur2.setJobDescription("Icu Nurse");
        
        nur3.setStaffID("N1003");
        nur3.setFirstName("Natsu");
        nur3.setLastName("Dragneel");
        nur3.setAge(20);
        nur3.setJobDescription("General Nurse");
        
        nur4.setStaffID("N1004");
        nur4.setFirstName("Gray");
        nur4.setLastName("Fullbuster");
        nur4.setAge(20);
        nur4.setJobDescription("Staff Nurse");
        
        nur5.setStaffID("N1005");
        nur5.setFirstName("Happy");
        nur5.setLastName("Dragneel");
        nur5.setAge(25);
        nur5.setJobDescription("Operational Nurse");
        
        nurList.add(nur1);
        nurList.add(nur2);
        nurList.add(nur3);
        nurList.add(nur4); 
        nurList.add(nur5);
        
        return nurList;
    }
}
