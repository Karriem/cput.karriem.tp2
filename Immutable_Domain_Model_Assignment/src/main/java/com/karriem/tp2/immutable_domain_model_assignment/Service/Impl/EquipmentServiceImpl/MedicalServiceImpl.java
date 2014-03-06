/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.immutable_domain_model_assignment.Service.Impl.EquipmentServiceImpl;

import com.karriem.tp2.immutable_domain_model_assignment.Domain.Model.Equipment.MedicalEquipment;
import com.karriem.tp2.immutable_domain_model_assignment.Service.EquipmentService.MedicalService;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author karriem
 */
public class MedicalServiceImpl implements MedicalService{

    private List<MedicalEquipment> medList = new ArrayList<MedicalEquipment>();
    
    @Override
    public List<MedicalEquipment> createMedicalEquipment() {
       
        MedicalEquipment medObj = new MedicalEquipment.Builder()
                                            .equipID("M1001")
                                            .equipName("Bone Saw")
                                            .condition("Used")
                                            .quantity(10)
                                            .build();
        
        medList.add(medObj);
        
        return medList;
    }

    @Override
    public List<MedicalEquipment> createNewMedicalEquipment() {
        
        MedicalEquipment newMed = new MedicalEquipment.Builder()
                                    .genEquipment(new MedicalServiceImpl().createMedicalEquipment().get(0))
                                    .condition("New")
                                    .build();
        
        medList.add(newMed);
        
        return medList;
    }
    
}
