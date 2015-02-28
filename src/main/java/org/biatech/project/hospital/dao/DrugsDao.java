/**
 * 
 */
package org.biatech.project.hospital.dao;

import org.biatech.project.hospital.model.Drugs;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author yayacky
 * 
 */
public interface DrugsDao extends JpaRepository<Drugs, String> {

}
