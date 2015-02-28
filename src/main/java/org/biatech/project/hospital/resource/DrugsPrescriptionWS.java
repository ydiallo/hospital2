/**
 * 
 */
package org.biatech.project.hospital.resource;

import javax.ws.rs.Path;

import org.biatech.project.hospital.service.IDrugsPrescriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author yayacky
 * 
 */

@Component
@Path("/drugsprescription")
public class DrugsPrescriptionWS {

    @Autowired
    private IDrugsPrescriptionService drugsPrescriptionService;

}
