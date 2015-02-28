/**
 * 
 */
package org.biatech.project.hospital.service;

import java.util.List;

import org.biatech.project.hospital.model.Secretary;

/**
 * @author yayacky
 * 
 */
public interface ISecretaryService {

    void deleteSecretary(String secretaryId);

    boolean findByLogin(String userName, String password);

    boolean findByUserName(String userName);

    List<Secretary> getAllSecretary();

    Secretary getSecretary(String secretaryId);

    Secretary save(Secretary secretaryId);

}
