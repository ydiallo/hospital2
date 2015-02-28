/**
 * 
 */
package org.biatech.project.hospital.resource;

import javax.ws.rs.Path;

import org.biatech.project.hospital.service.IMedicalSpecialityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author yayacky
 * 
 */

@Component
@Path("/medicalspeciality")
public class MedicalSpecialityWS {

    @Autowired
    private IMedicalSpecialityService medicalSpecialityService;

}
