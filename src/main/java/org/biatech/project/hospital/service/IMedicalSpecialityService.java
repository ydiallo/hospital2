/**
 * 
 */
package org.biatech.project.hospital.service;

import java.util.List;

import org.biatech.project.hospital.model.MedicalSpeciality;

/**
 * @author yayacky
 * 
 */
public interface IMedicalSpecialityService {

    void deleteMedicalSpeciality(String medicalSpecialityId);

    List<MedicalSpeciality> getAllMedicalSpeciality();

    MedicalSpeciality getMedicalSpeciality(String medicalSpecialityId);

    MedicalSpeciality save(MedicalSpeciality medicalSpeciality);

}
