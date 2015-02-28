/**
 * 
 */
package org.biatech.project.hospital.dao;

import org.biatech.project.hospital.model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @author yayacky
 * 
 */

@Repository
@Component
public interface AppointmentDao extends JpaRepository<Appointment, String> {

}
