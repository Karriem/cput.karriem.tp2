/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.software_design_principles.DIP.Compliance;

import com.karriem.tp2.software_design_principles.Model.TreatmentList;
import java.util.List;

/**
 *
 * @author karriem
 */
public interface HospitalService {
    
    public List<TreatmentList> treatPatient();
}
