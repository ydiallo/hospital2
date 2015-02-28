/**
 * 
 */
package org.biatech.project.hospital.service;

import java.util.List;

import org.biatech.project.hospital.model.DrugsPosology;

/**
 * @author yayacky
 * 
 */
public interface IDrugsPosologyService {

    void deleteClinic(String drugsPosologyId);

    List<DrugsPosology> getAllDrugsPosology();

    DrugsPosology getDrugsPosology(String drugsPosologyId);

    DrugsPosology save(DrugsPosology drugsPosology);

}
