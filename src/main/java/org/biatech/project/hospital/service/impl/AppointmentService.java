/**
 * 
 */
package org.biatech.project.hospital.service.impl;

import java.util.List;

import org.biatech.project.hospital.dao.AppointmentDao;
import org.biatech.project.hospital.model.Appointment;
import org.biatech.project.hospital.service.IAppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author yayacky
 * 
 */
@Service("appointmentService")
public class AppointmentService implements IAppointmentService {

    @Autowired
    private AppointmentDao appointmentDao;

    @Override
    public void deleteAppointment(final String appointmentId) {
        // TODO Auto-generated method stub

    }

    @Override
    public List<Appointment> getAllAppointment() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Appointment getDoctor(final String appointmentId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Appointment save(final Appointment appointment) {
        // TODO Auto-generated method stub
        return null;
    }

}
