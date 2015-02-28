/**
 * 
 */
package org.biatech.project.hospital.service;

import java.util.List;

import org.biatech.project.hospital.model.Clinic;

/**
 * @author yayacky
 * 
 */
public interface IClinicService {

    void deleteClinic(String clinicId);

    List<Clinic> getAllClinic();

    Clinic getClinic(String clinicId);

    Clinic save(Clinic clinic);

}
