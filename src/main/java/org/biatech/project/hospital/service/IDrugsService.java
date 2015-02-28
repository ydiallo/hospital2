/**
 * 
 */
package org.biatech.project.hospital.service;

import java.util.List;

import org.biatech.project.hospital.model.Drugs;

/**
 * @author yayacky
 * 
 */
public interface IDrugsService {

    void deleteDrugs(String drugsId);

    List<Drugs> getAllDrugs();

    Drugs getDrugs(String drugsId);

    Drugs save(Drugs drugs);

}
