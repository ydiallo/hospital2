/**
 * 
 */
package org.biatech.project.hospital.service;

import java.util.List;

import org.biatech.project.hospital.model.MedicalExam;

/**
 * @author yayacky
 * 
 */
public interface IMedicalExamService {

    void deleteMedicalExam(String medicalExamId);

    List<MedicalExam> getAllMedicalExam();

    MedicalExam getMedicalExam(String medicalExamId);

    MedicalExam save(MedicalExam medicalExam);

}
