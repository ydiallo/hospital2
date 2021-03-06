package org.biatech.project.hospital.resource;

import javax.ws.rs.Path;

import org.biatech.project.hospital.service.IExaminationPrescriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author yayacky
 * 
 */

@Component
@Path("/examinationprescription")
public class ExaminationPrescriptionWS {

    @Autowired
    private IExaminationPrescriptionService examinationPrescriptionService;

}
