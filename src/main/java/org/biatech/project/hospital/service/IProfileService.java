/**
 * 
 */
package org.biatech.project.hospital.service;

import java.util.List;

import org.biatech.project.hospital.model.Profiles;

/**
 * @author yayacky
 * 
 */
public interface IProfileService {

    void deleteProfile(String profileId);

    List<Profiles> getAllProfile();

    Profiles getProfile(String profileId);

    Profiles save(Profiles profileId);

}
