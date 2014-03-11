/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp2.immutable_domain_model_assignment.Service.Impl.TreatmentServiceImpl;

import com.karriem.tp2.immutable_domain_model_assignment.Domain.Model.Patients.ComaPatients;
import com.karriem.tp2.immutable_domain_model_assignment.Domain.Model.Treatment.ComaTreatment;
import com.karriem.tp2.immutable_domain_model_assignment.Service.TreatmentService.ComaTreatmentService;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author karriem
 */
public class ComaServiceImpl implements ComaTreatmentService{

    List<ComaTreatment> comaList = new ArrayList<ComaTreatment>();

    @Override
    public List<ComaTreatment> createComa() {
        
        ComaTreatment comaObj = new ComaTreatment.Builder()
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
    public List<ComaTreatment> createNewComa() {
        
        ComaTreatment comaObj = new ComaTreatment.Builder()
                                    .comaTreatment(new ComaServiceImpl().createComa().get(0))
                                    .doctorID("D1005")
                                    .build();
        
        comaList.add(comaObj);
        
        return comaList;
    }

    
}
