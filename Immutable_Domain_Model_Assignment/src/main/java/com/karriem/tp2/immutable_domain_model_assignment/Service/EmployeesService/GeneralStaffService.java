/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.immutable_domain_model_assignment.Service.EmployeesService;

import com.karriem.tp2.immutable_domain_model_assignment.Domain.Model.Employees.GeneralStaffPersonal;
import java.util.List;

/**
 *
 * @author karriem
 */
public interface GeneralStaffService {
    
    public List<GeneralStaffPersonal> createGeneralStaff(); 
    public List<GeneralStaffPersonal> createNewGeneralStaff();
}
