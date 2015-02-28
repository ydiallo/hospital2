/**
 * 
 */
package org.biatech.project.hospital.service.impl;

import java.util.List;

import org.biatech.project.hospital.dao.DoctorDao;
import org.biatech.project.hospital.model.Doctor;
import org.biatech.project.hospital.service.IDoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author yayacky
 * 
 */
@Service("doctorService")
public class DoctorService implements IDoctorService {

    @Autowired
    private DoctorDao doctorDao;

    @Override
    public void deletePersonne(final String personneId) {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.biatech.project.hospital.service.IDoctorService#findByLogin(java.
     * lang.String, java.lang.String)
     */
    @Override
    public boolean findByLogin(final String userName, final String password) {
        // TODO Auto-generated method stub
        return false;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.biatech.project.hospital.service.IDoctorService#findByUserName(java
     * .lang.String)
     */
    @Override
    public boolean findByUserName(final String userName) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public List<Doctor> getAllDoctor() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Doctor getDoctor(final String doctorId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Doctor save(final Doctor doctor) {
        // TODO Auto-generated method stub
        return null;
    }

}
