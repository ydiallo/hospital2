/**
 * 
 */
package org.biatech.project.hospital.service;

import java.util.List;

import org.biatech.project.hospital.model.MedicalRecord;

/**
 * @author yayacky
 * 
 */
public interface IMedicalRecordService {

    void deleteMedicalRecord(String medicalRecordId);

    List<MedicalRecord> getAllMedicalRecord();

    MedicalRecord getMedicalRecord(String medicalRecordId);

    MedicalRecord save(MedicalRecord medicalRecord);

}
