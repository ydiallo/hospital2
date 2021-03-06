/**
 * 
 */
package org.biatech.project.hospital.dao;

import org.biatech.project.hospital.model.MedicalRecord;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author yayacky
 * 
 */
public interface MedicalRecordDao extends JpaRepository<MedicalRecord, String> {

}
