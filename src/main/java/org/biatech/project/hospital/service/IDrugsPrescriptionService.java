/**
 * 
 */
package org.biatech.project.hospital.service;

import java.util.List;

import org.biatech.project.hospital.model.DrugsPrescription;

/**
 * @author yayacky
 * 
 */
public interface IDrugsPrescriptionService {

    void deleteDrugsPrescription(String drugsPrescriptionId);

    List<DrugsPrescription> getAllDrugsPrescription();

    DrugsPrescription getDrugsPrescription(String drugsPrescriptionId);

    DrugsPrescription save(DrugsPrescription drugsPrescription);

}
