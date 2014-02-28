/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.principles_assignment.ISP.Violation.Service.Impl;

/**
 *
 * @author karriem
 */
public class StaffMemberServiceImpl {
    
    private DoctorMembers doctor = new DoctorMembers();
    private NurseMembers nurse = new NurseMembers();
    
    public void getWork(){
        
        doctor.work();
        doctor.age();
        nurse.work();
        nurse.age();
    }
    
}
