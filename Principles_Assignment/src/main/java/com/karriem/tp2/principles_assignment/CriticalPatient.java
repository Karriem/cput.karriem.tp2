/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.software_design_principles;

import com.karriem.tp2.software_design_principles.Model.Patients;

/**
 *
 * @author karriem
 */
public class CriticalPatient extends Patients{
        
    public String highRisk(){return "High Risk";};
    public String lowRisk(){return "Low Risk";};
    public String noRisk(){return "No Risk";};
}
