/**
 * 
 */
package org.biatech.project.hospital.service;

import java.util.List;

import org.biatech.project.hospital.model.Patient;

/**
 * @author yayacky
 * 
 */
public interface IPatientService {

    void deletePatient(String patientId);

    List<Patient> getAllPatient();

    Patient getPatient(String patientId);

    Patient save(Patient patientId);

}
