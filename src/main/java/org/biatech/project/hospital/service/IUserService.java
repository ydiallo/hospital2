/**
 * 
 */
package org.biatech.project.hospital.service;

import java.util.List;

import org.biatech.project.hospital.model.Users;

/**
 * @author yayacky
 * 
 */
public interface IUserService {

    void deleteUser(String userId);

    List<Users> getAllUser();

    Users getUser(String userId);

    Users save(Users userId);

}
