/**
 * 
 */
package org.biatech.project.hospital.dao;

import org.biatech.project.hospital.model.MedicalProcedure;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author yayacky
 * 
 */
public interface MedicalProcedureDao extends JpaRepository<MedicalProcedure, String> {

}
