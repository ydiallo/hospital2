/**
 * 
 */
package org.biatech.project.hospital.dao;

import org.biatech.project.hospital.model.Profiles;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author yayacky
 * 
 */
public interface ProfileDao extends JpaRepository<Profiles, String> {

}
