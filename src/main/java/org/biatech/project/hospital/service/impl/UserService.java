/**
 * 
 */
package org.biatech.project.hospital.service.impl;

import java.util.List;

import org.biatech.project.hospital.model.Users;
import org.biatech.project.hospital.service.IUserService;
import org.springframework.stereotype.Service;

/**
 * @author yayacky
 * 
 */
@Service("userService")
public class UserService implements IUserService {

    /*
     * (non-Javadoc)
     * 
     * @see
     * biatech.project.hospital.service.IUserService#deleteUser(java.lang.String
     * )
     */
    @Override
    public void deleteUser(final String userId) {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     * 
     * @see biatech.project.hospital.service.IUserService#getAllUser()
     */
    @Override
    public List<Users> getAllUser() {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * biatech.project.hospital.service.IUserService#getUser(java.lang.String)
     */
    @Override
    public Users getUser(final String userId) {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * biatech.project.hospital.service.IUserService#save(biatech.project.hospital
     * .entity.User)
     */
    @Override
    public Users save(final Users userId) {
        // TODO Auto-generated method stub
        return null;
    }

}
