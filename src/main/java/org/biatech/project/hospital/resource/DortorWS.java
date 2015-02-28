/**
 * 
 */
package org.biatech.project.hospital.resource;

import javax.ws.rs.Path;

import org.biatech.project.hospital.service.IDoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author yayacky
 * 
 */

@Component
@Path("/dortor")
public class DortorWS {

    @Autowired
    private IDoctorService doctorService;

}
