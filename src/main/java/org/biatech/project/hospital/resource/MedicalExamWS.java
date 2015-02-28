/**
 * 
 */
package org.biatech.project.hospital.resource;

import javax.ws.rs.Path;

import org.biatech.project.hospital.service.IMedicalExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author yayacky
 * 
 */

@Component
@Path("/medicalexam")
public class MedicalExamWS {

    @Autowired
    private IMedicalExamService medialExamService;

}
