/**
 * 
 */
package org.biatech.project.hospital.service.impl;

import java.util.List;

import org.biatech.project.hospital.model.Drugs;
import org.biatech.project.hospital.service.IDrugsService;
import org.springframework.stereotype.Service;

/**
 * @author yayacky
 * 
 */
@Service("drugsService")
public class DrugsService implements IDrugsService {

    /*
     * (non-Javadoc)
     * 
     * @see
     * biatech.project.hospital.service.IDrugsService#deleteDrugs(java.lang.
     * String)
     */
    @Override
    public void deleteDrugs(final String drugsId) {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     * 
     * @see biatech.project.hospital.service.IDrugsService#getAllDrugs()
     */
    @Override
    public List<Drugs> getAllDrugs() {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * biatech.project.hospital.service.IDrugsService#getDrugs(java.lang.String)
     */
    @Override
    public Drugs getDrugs(final String drugsId) {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * biatech.project.hospital.service.IDrugsService#save(biatech.project.hospital
     * .entity.Drugs)
     */
    @Override
    public Drugs save(final Drugs drugs) {
        // TODO Auto-generated method stub
        return null;
    }

}
