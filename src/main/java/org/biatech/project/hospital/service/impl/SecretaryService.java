/**
 * 
 */
package org.biatech.project.hospital.service.impl;

import java.util.List;

import org.biatech.project.hospital.model.Secretary;
import org.biatech.project.hospital.service.ISecretaryService;
import org.springframework.stereotype.Service;

/**
 * @author yayacky
 * 
 */
@Service("secretaryService")
public class SecretaryService implements ISecretaryService {

    /*
     * (non-Javadoc)
     * 
     * @see
     * biatech.project.hospital.service.ISecretaryService#deleteSecretary(java
     * .lang.String)
     */
    @Override
    public void deleteSecretary(final String secretaryId) {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.biatech.project.hospital.service.ISecretaryService#findByLogin(java
     * .lang.String, java.lang.String)
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
     * org.biatech.project.hospital.service.ISecretaryService#findByUserName
     * (java.lang.String)
     */
    @Override
    public boolean findByUserName(final String userName) {
        // TODO Auto-generated method stub
        return false;
    }

    /*
     * (non-Javadoc)
     * 
     * @see biatech.project.hospital.service.ISecretaryService#getAllSecretary()
     */
    @Override
    public List<Secretary> getAllSecretary() {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * biatech.project.hospital.service.ISecretaryService#getSecretary(java.
     * lang.String)
     */
    @Override
    public Secretary getSecretary(final String secretaryId) {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * biatech.project.hospital.service.ISecretaryService#save(biatech.project
     * .hospital.entity.Secretary)
     */
    @Override
    public Secretary save(final Secretary secretaryId) {
        // TODO Auto-generated method stub
        return null;
    }

}
