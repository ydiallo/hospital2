package org.biatech.project.hospital.dao;

import java.util.List;

import org.biatech.project.hospital.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * 
 * 
 * <P>
 * 
 * </p>
 * 
 * @version $Revision$ , $Date$
 * @author $Author$
 */

@Repository
@Component
public interface DoctorDao extends JpaRepository<Doctor, String> {

    /**
     * Find doctors by first name.
     */
    public List<Doctor> findByFirstName(String firstName);

}
