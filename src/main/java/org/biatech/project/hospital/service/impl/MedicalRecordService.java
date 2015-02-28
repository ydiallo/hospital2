/**
 * 
 */
package org.biatech.project.hospital.service.impl;

import java.util.List;

import org.biatech.project.hospital.model.MedicalRecord;
import org.biatech.project.hospital.service.IMedicalRecordService;
import org.springframework.stereotype.Service;

/**
 * @author yayacky
 * 
 */
@Service("medicalRecordService")
public class MedicalRecordService implements IMedicalRecordService {

    /*
     * (non-Javadoc)
     * 
     * @see
     * biatech.project.hospital.service.IMedicalRecordService#deleteMedicalRecord
     * (java.lang.String)
     */
    @Override
    public void deleteMedicalRecord(final String medicalRecordId) {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * biatech.project.hospital.service.IMedicalRecordService#getAllMedicalRecord
     * ()
     */
    @Override
    public List<MedicalRecord> getAllMedicalRecord() {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * biatech.project.hospital.service.IMedicalRecordService#getMedicalRecord
     * (java.lang.String)
     */
    @Override
    public MedicalRecord getMedicalRecord(final String medicalRecordId) {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * biatech.project.hospital.service.IMedicalRecordService#save(biatech.project
     * .hospital.entity.MedicalRecord)
     */
    @Override
    public MedicalRecord save(final MedicalRecord medicalRecord) {
        // TODO Auto-generated method stub
        return null;
    }

}
