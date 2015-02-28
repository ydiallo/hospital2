package org.biatech.project.hospital.service;

import java.util.List;

import org.biatech.project.hospital.model.Appointment;

/**
 * @author yayacky
 * 
 */
public interface IAppointmentService {

    void deleteAppointment(String appointmentId);

    List<Appointment> getAllAppointment();

    Appointment getDoctor(String appointmentId);

    Appointment save(Appointment appointment);

}
