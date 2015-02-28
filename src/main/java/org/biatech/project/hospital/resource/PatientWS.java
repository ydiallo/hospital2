/**
 * 
 */
package org.biatech.project.hospital.resource;

import javax.ws.rs.Path;

import org.biatech.project.hospital.service.IPatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author yayacky
 * 
 */

@Component
@Path("/patient")
public class PatientWS {

    @Autowired
    private IPatientService patientService;

}
