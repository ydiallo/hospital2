/**
 * 
 */
package org.biatech.project.hospital.dao;

import org.biatech.project.hospital.model.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author yayacky
 * 
 */
public interface UserProfileDao extends JpaRepository<UserProfile, String> {

}
