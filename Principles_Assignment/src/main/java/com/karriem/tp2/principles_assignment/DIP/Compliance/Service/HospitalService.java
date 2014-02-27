/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.principles_assignment.DIP.Compliance.Service;


import com.karriem.tp2.principles_assignment.Model.TreatmentList;
import java.util.List;

/**
 *
 * @author karriem
 */
public interface HospitalService {
    
    public List<TreatmentList> treatPatient();
    
}
