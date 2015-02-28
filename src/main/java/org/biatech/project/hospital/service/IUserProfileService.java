/**
 * 
 */
package org.biatech.project.hospital.service;

import java.util.List;

import org.biatech.project.hospital.model.UserProfile;

/**
 * @author yayacky
 * 
 */
public interface IUserProfileService {

    void deleteUserProfile(String userProfileId);

    List<UserProfile> getAllUserProfile();

    UserProfile getUserProfile(String userProfileId);

    UserProfile save(UserProfile userProfileId);

}
