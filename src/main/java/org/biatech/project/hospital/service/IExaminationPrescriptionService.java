/**
 * 
 */
package org.biatech.project.hospital.service;

import java.util.List;

import org.biatech.project.hospital.model.ExaminationPrescription;

/**
 * @author yayacky
 * 
 */
public interface IExaminationPrescriptionService {

    void deleteExaminationPrescription(String examinationPrescriptionId);

    List<ExaminationPrescription> getAllExaminationPrescription();

    ExaminationPrescription getExaminationPrescription(String examinationPrescriptionId);

    ExaminationPrescription save(ExaminationPrescription examinationPrescription);

}
