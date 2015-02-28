/**
 * 
 */
package org.biatech.project.hospital.service;

import java.util.List;

import org.biatech.project.hospital.model.Pathology;

/**
 * @author yayacky
 * 
 */
public interface IPathologyService {

    void deletePathology(String pathologyId);

    List<Pathology> getAllPathology();

    Pathology getPathology(String pathologyId);

    Pathology save(Pathology pathologyId);

}
