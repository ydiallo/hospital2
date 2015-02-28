/**
 * 
 */
package org.biatech.project.hospital.dao;

import org.biatech.project.hospital.model.Pathology;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author yayacky
 * 
 */
public interface PathologyDao extends JpaRepository<Pathology, String> {

}
