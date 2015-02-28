package org.biatech.project.hospital.service;

import java.util.List;

import org.biatech.project.hospital.model.Doctor;

/**
 * @author yayacky
 * 
 */
public interface IDoctorService {

    void deletePersonne(String personneId);

    boolean findByLogin(String userName, String password);

    boolean findByUserName(String userName);

    List<Doctor> getAllDoctor();

    Doctor getDoctor(String doctorId);

    Doctor save(Doctor doctor);
}
