/**
 * 
 */
package org.biatech.project.hospital.service;

import java.util.List;

import org.biatech.project.hospital.model.MedicalProcedure;

/**
 * @author yayacky
 * 
 */
public interface IMedicalProcedureService {

    void deleteMedicalProcedure(String medicalProcedureId);

    List<MedicalProcedure> getAllMedicalProcedure();

    MedicalProcedure getMedicalProcedure(String medicalProcedureId);

    MedicalProcedure save(MedicalProcedure medicalProcedure);

}
