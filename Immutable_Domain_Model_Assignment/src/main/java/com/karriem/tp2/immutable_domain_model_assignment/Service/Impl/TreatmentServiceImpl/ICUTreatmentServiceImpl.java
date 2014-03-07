/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.immutable_domain_model_assignment.Service.Impl.TreatmentServiceImpl;

import com.karriem.tp2.immutable_domain_model_assignment.Domain.Model.Treatment.ICUTreatment;
import com.karriem.tp2.immutable_domain_model_assignment.Service.TreatmentService.ICUTreatmentService;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author karriem
 */
public class ICUTreatmentServiceImpl implements ICUTreatmentService{

    List<ICUTreatment> comaList = new ArrayList<ICUTreatment>();

    @Override
    public List<ICUTreatment> createICU() {
        
        ICUTreatment comaObj = new ICUTreatment.Builder()
                                    .doctorID("D1001")
                                    .medicineID("M1001")
                                    .nurseID("N1001")
                                    .treatmentDescription("Remove Eye ball")
                                    .treatmetnID("T1001")
                                    .cost(5000)
                                    .build();
        
        comaList.add(comaObj);
        
        return comaList;
    }

    @Override
    public List<ICUTreatment> createNewICU() {
        
        ICUTreatment comaObj = new ICUTreatment.Builder()
                                    .icuTreatment(new ICUTreatmentServiceImpl().createICU().get(0))
                                    .doctorID("D1005")
                                    .build();
        
        comaList.add(comaObj);
        
        return comaList;
    }
    
}
