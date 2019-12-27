/**
 * 
 */
package org.biatech.project.hospital.dao;

import org.biatech.project.hospital.model.DrugsPrescription;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author yayacky
 * 
 */
public interface DrugsPrescriptionDao extends JpaRepository<DrugsPrescription, String> {

}