/**
 * 
 */
package org.biatech.project.hospital.resource;

import javax.ws.rs.Path;

import org.biatech.project.hospital.service.IClinicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author yayacky
 * 
 */

@Component
@Path("/clinic")
public class ClinicWS {

    @Autowired
    private IClinicService cliniqueService;

}
