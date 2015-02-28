/**
 * 
 */
package org.biatech.project.hospital.service.impl;

import java.util.List;

import org.biatech.project.hospital.dao.ClinicDao;
import org.biatech.project.hospital.model.Clinic;
import org.biatech.project.hospital.service.IClinicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author yayacky
 * 
 */
@Service("cliniqueService")
public class ClinicService implements IClinicService {

    @Autowired
    private ClinicDao clinicDao;

    /*
     * (non-Javadoc)
     * 
     * @see
     * biatech.project.hospital.service.IClinicService#deleteClinic(java.lang
     * .String)
     */
    @Override
    public void deleteClinic(final String clinicId) {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     * 
     * @see biatech.project.hospital.service.IClinicService#getAllClinic()
     */
    @Override
    public List<Clinic> getAllClinic() {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * biatech.project.hospital.service.IClinicService#getClinic(java.lang.String
     * )
     */
    @Override
    public Clinic getClinic(final String clinicId) {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * biatech.project.hospital.service.IClinicService#save(biatech.project.
     * hospital.entity.Clinic)
     */
    @Override
    public Clinic save(final Clinic clinic) {
        // TODO Auto-generated method stub
        return null;
    }

}
