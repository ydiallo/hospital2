/**
 * 
 */
package org.biatech.project.hospital.dao;

import org.biatech.project.hospital.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author yayacky
 * 
 */
public interface UserDao extends JpaRepository<Users, String> {

}
