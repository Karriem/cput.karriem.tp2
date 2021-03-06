/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.immutable_domain_model_assignment.Service.Impl.EquipmentServiceImpl;

import com.karriem.tp2.immutable_domain_model_assignment.Domain.Model.Equipment.GeneralEquipment;
import com.karriem.tp2.immutable_domain_model_assignment.Service.EquipmentService.GeneralEquipmentService;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author karriem
 */
public class GeneralServiceImpl implements GeneralEquipmentService{

    private List<GeneralEquipment> equipList = new ArrayList<GeneralEquipment>();
    
    @Override
    public List<GeneralEquipment> createEquipment() {
         GeneralEquipment equipObj = new GeneralEquipment.Builder()
                                            .equipID("E1001")
                                            .equipName("Broom")
                                            .condition("New")
                                            .quantity(45)
                                            .build();
        
        equipList.add(equipObj);
        
        return equipList;
    }

    @Override
    public List<GeneralEquipment> createNewEquipment() {
        GeneralEquipment newEquip = new GeneralEquipment.Builder()
                                    .genEquipment(new GeneralServiceImpl().createEquipment().get(0))
                                    .quantity(5)
                                    .build();
        
        equipList.add(newEquip);
        
        return equipList;
    }
    
}
