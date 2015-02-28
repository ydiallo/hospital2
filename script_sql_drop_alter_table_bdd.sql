ALTER TABLE MEDICAL_PROCEDURE DROP FOREIGN KEY FK_MEDICALPROCEDURE_MEDICALSPECIALITY;

ALTER TABLE CLINIC DROP FOREIGN KEY FK_CLINIC_ADRESSE;

ALTER TABLE USER_PROFILE DROP FOREIGN KEY FK_USERSPROFILE_USERS;
ALTER TABLE USER_PROFILE DROP FOREIGN KEY FK_USERSPROFILE_PROFILE;

ALTER TABLE SECRETARY DROP FOREIGN KEY FK_SECRETARY_USERS;
ALTER TABLE SECRETARY DROP FOREIGN KEY FK_SECRETARY_ADRESSE;
ALTER TABLE SECRETARY DROP FOREIGN KEY FK_SECRETARY_CONTACTINFORMATION;

ALTER TABLE DOCTOR DROP FOREIGN KEY FK_DOCTOR_USERS;
ALTER TABLE DOCTOR DROP FOREIGN KEY FK_DOCTOR_SECRETARY;
ALTER TABLE DOCTOR DROP FOREIGN KEY FK_DOCTOR_MEDICALSPECIALITY;
ALTER TABLE DOCTOR DROP FOREIGN KEY FK_DOCTOR_ADRESSE;
ALTER TABLE DOCTOR DROP FOREIGN KEY FK_DOCTOR_CONTACTINFORMATION;
ALTER TABLE DOCTOR DROP FOREIGN KEY FK_DOCTOR_CLINIC;

ALTER TABLE APPOINTMENT DROP FOREIGN KEY FK_APPOINTMENT_DOCTOR;
ALTER TABLE APPOINTMENT DROP FOREIGN KEY FK_APPOINTMENT_PATIENT;

ALTER TABLE PATIENT DROP FOREIGN KEY FK_PATIENT_DOCTOR;
ALTER TABLE PATIENT DROP FOREIGN KEY FK_PATIENT_ADRESSE;
ALTER TABLE PATIENT DROP FOREIGN KEY FK_PATIENT_CONTACTINFORMATION;
ALTER TABLE PATIENT DROP FOREIGN KEY FK_PATIENT_MEDICALRECORD;

ALTER TABLE MEDICAL_RECORD DROP FOREIGN KEY FK_MEDICALRECORD_PATIENT;

ALTER TABLE MEDICAL_EXAM DROP FOREIGN KEY FK_MEDICALEXAM_DOCTOR;
ALTER TABLE MEDICAL_EXAM DROP FOREIGN KEY FK_MEDICALEXAM_MEDICALRECORD;

ALTER TABLE PATHOLOGY DROP FOREIGN KEY FK_PATHOLOGY_MEDICALRECORD;

ALTER TABLE EXAMINATION_PRESCRIPTION DROP FOREIGN KEY FK_EXAMINATIONPRESCRIPTION_PATHOLOGY;

ALTER TABLE DRUGS_PRESCRIPTION DROP FOREIGN KEY FK_DRUGSPRESCRIPTION_PATHOLOGY;

ALTER TABLE DRUGS DROP FOREIGN KEY FK_DRUGS_DRUGS;

ALTER TABLE DRUGS_POSOLOGY DROP FOREIGN KEY FK_DRUGSPOSOLOGY_DRUGSPRESCRIPTION;
ALTER TABLE DRUGS_POSOLOGY DROP FOREIGN KEY FK_DRUGSPOSOLOGY_DRUGS;
