/**
 * 
 */
package org.biatech.project.hospital.service.impl;

import java.util.List;

import org.biatech.project.hospital.model.Patient;
import org.biatech.project.hospital.service.IPatientService;
import org.springframework.stereotype.Service;

/**
 * @author yayacky
 * 
 */
@Service("patientService")
public class PatientService implements IPatientService {

    /*
     * (non-Javadoc)
     * 
     * @see
     * biatech.project.hospital.service.IPatientService#deletePatient(java.lang
     * .String)
     */
    @Override
    public void deletePatient(final String patientId) {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     * 
     * @see biatech.project.hospital.service.IPatientService#getAllPatient()
     */
    @Override
    public List<Patient> getAllPatient() {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * biatech.project.hospital.service.IPatientService#getPatient(java.lang
     * .String)
     */
    @Override
    public Patient getPatient(final String patientId) {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * biatech.project.hospital.service.IPatientService#save(biatech.project
     * .hospital.entity.Patient)
     */
    @Override
    public Patient save(final Patient patientId) {
        // TODO Auto-generated method stub
        return null;
    }

}
