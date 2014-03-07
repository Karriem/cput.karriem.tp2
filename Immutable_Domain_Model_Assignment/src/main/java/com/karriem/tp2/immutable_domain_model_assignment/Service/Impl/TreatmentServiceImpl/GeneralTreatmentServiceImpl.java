/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.immutable_domain_model_assignment.Service.Impl.TreatmentServiceImpl;

import com.karriem.tp2.immutable_domain_model_assignment.Domain.Model.Treatment.GeneralTreatments;
import com.karriem.tp2.immutable_domain_model_assignment.Service.TreatmentService.GeneralTreatmentService;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author karriem
 */
public class GeneralTreatmentServiceImpl implements GeneralTreatmentService{
    
    List<GeneralTreatments> comaList = new ArrayList<GeneralTreatments>();

    @Override
    public List<GeneralTreatments> createGeneral() {
        
        GeneralTreatments comaObj = new GeneralTreatments.Builder()
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
    public List<GeneralTreatments> createNewGeneral() {
        
        GeneralTreatments comaObj = new GeneralTreatments.Builder()
                                    .genTreatment(new GeneralTreatmentServiceImpl().createGeneral().get(0))
                                    .doctorID("D1005")
                                    .build();
        
        comaList.add(comaObj);
        
        return comaList;
    }

}
