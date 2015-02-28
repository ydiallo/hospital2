/**
 * 
 */
package org.biatech.project.hospital.dao;

import org.biatech.project.hospital.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author yayacky
 * 
 */
public interface PatientDao extends JpaRepository<Patient, String> {

}
