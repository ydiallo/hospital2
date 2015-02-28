CREATE TABLE ADRESSE (
  idAdresse bigint(20) NOT NULL AUTO_INCREMENT,
  adresseName varchar(255) NOT NULL,
  city varchar(255) NOT NULL,
  country varchar(255) NOT NULL,
  PRIMARY KEY (idAdresse)
) ENGINE=InnoDB AUTO_INCREMENT=43 DEFAULT CHARSET=latin1;

CREATE TABLE CONTACT_INFORMATION (
  idContactInformation bigint(20) NOT NULL AUTO_INCREMENT,
  homePhone varchar(255),
  workPhone varchar(255),
  mobilePhone varchar(255) NOT NULL,
  emailAddress varchar(255),
  PRIMARY KEY (idContactInformation)
) ENGINE=InnoDB AUTO_INCREMENT=43 DEFAULT CHARSET=latin1;

CREATE TABLE MEDICAL_SPECIALITY (
  idMedicalSpeciality bigint(20) NOT NULL AUTO_INCREMENT,
  nameSpeciality varchar(255) NOT NULL,
  description varchar(255),
  PRIMARY KEY (idMedicalSpeciality)
) ENGINE=InnoDB AUTO_INCREMENT=43 DEFAULT CHARSET=latin1;

CREATE TABLE PROFILES (
  idProfile bigint(20) NOT NULL AUTO_INCREMENT,
  profileName varchar(255) NOT NULL,
  description varchar(255),
  PRIMARY KEY (idProfile)
) ENGINE=InnoDB AUTO_INCREMENT=43 DEFAULT CHARSET=latin1;

CREATE TABLE MEDICAL_PROCEDURE (
  idMedicalProcedure bigint(20) NOT NULL AUTO_INCREMENT,
  nameProcedure varchar(255) NOT NULL,
  averageDuration varchar(4) NOT NULL,
  nameSpeciality varchar(255) NOT NULL,
  PRIMARY KEY (idMedicalProcedure)
) ENGINE=InnoDB AUTO_INCREMENT=43 DEFAULT CHARSET=latin1;

CREATE TABLE CLINIC (
  idClinic bigint(20) NOT NULL AUTO_INCREMENT,
  clinicName varchar(255) NOT NULL,
  registration varchar(255) NOT NULL,
  employees integer,
  idAdresse bigint(20),
  PRIMARY KEY (idClinic)
) ENGINE=InnoDB AUTO_INCREMENT=43 DEFAULT CHARSET=latin1;

CREATE TABLE USERS (
  idUser bigint(20) NOT NULL AUTO_INCREMENT,
  login varchar(20) NOT NULL,
  password varchar(8) NOT NULL,
  creationDate datetime NOT NULL,
  PRIMARY KEY (idUser)
) ENGINE=InnoDB AUTO_INCREMENT=43 DEFAULT CHARSET=latin1;

CREATE TABLE USER_PROFILE (
  idUserProfile bigint(20) NOT NULL AUTO_INCREMENT,
  enabled tinyint(1) NOT NULL,
  login varchar(20) NOT NULL,
  profileName varchar(255) NOT NULL,
  PRIMARY KEY (idUserProfile)
) ENGINE=InnoDB AUTO_INCREMENT=43 DEFAULT CHARSET=latin1;

CREATE TABLE SECRETARY (
  idUser bigint(20) NOT NULL,
  login varchar(20) NOT NULL,
  password varchar(8) NOT NULL,
  creationDate datetime NOT NULL,
  firstName varchar(255) NOT NULL,
  lastName varchar(255) NOT NULL,
  gender char(1) NOT NULL,
  idAdresse bigint(20) NOT NULL,
  idContactInformation bigint(20) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=43 DEFAULT CHARSET=latin1;

CREATE TABLE DOCTOR (
  idUser bigint(20) NOT NULL,
  login varchar(20) NOT NULL,
  password varchar(8) NOT NULL,
  creationDate datetime NOT NULL,
  numInami varchar(255) NOT NULL,
  firstName varchar(255) NOT NULL,
  lastName varchar(255) NOT NULL,
  gender char(1) NOT NULL,
  idAdresse bigint(20) NOT NULL,
  idContactInformation bigint(20) NOT NULL,
  idSecretary bigint(20),
  idMedicalSpeciality bigint(20) NOT NULL,
  idClinic bigint(20) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=43 DEFAULT CHARSET=latin1;

CREATE TABLE APPOINTMENT (
  idAppointment bigint(20) NOT NULL AUTO_INCREMENT,
  dateAppointment datetime NOT NULL,
  startTime datetime NOT NULL,
  endTime datetime NOT NULL,
  title varchar(255) NOT NULL,
  description varchar(255),
  numInami varchar(255) NOT NULL,
  idPatient bigint(20),
  PRIMARY KEY (idAppointment)
) ENGINE=InnoDB AUTO_INCREMENT=43 DEFAULT CHARSET=latin1;

CREATE TABLE PATIENT (
  idPatient bigint(20) NOT NULL AUTO_INCREMENT,
  numRegistrationNational varchar(255) NOT NULL,
  firstName varchar(255) NOT NULL,
  lastName varchar(255) NOT NULL,
  gender char(1) NOT NULL,
  dateOfBirth datetime NOT NULL,
  idAdresse bigint(20) NOT NULL,
  idContactInformation bigint(20) NOT NULL,
  numInami varchar(255),
  idMedicalRecord bigint(20) NOT NULL,
  PRIMARY KEY (idPatient)
) ENGINE=InnoDB AUTO_INCREMENT=43 DEFAULT CHARSET=latin1;

CREATE TABLE MEDICAL_RECORD (
  idMedicalRecord bigint(20) NOT NULL AUTO_INCREMENT,
  creationDate datetime NOT NULL,
  observation varchar(1000),
  idPatient bigint(20) NOT NULL,
  PRIMARY KEY (idMedicalRecord)
) ENGINE=InnoDB AUTO_INCREMENT=43 DEFAULT CHARSET=latin1;

CREATE TABLE MEDICAL_EXAM (
  idMedicalExam bigint(20) NOT NULL AUTO_INCREMENT,
  dateExamination datetime NOT NULL,
  observation varchar(1000) NOT NULL,
  objectExam varchar(255) NOT NULL,
  numInami varchar(255) NOT NULL,
  idMedicalRecord bigint(20) NOT NULL,
  PRIMARY KEY (idMedicalExam)
) ENGINE=InnoDB AUTO_INCREMENT=43 DEFAULT CHARSET=latin1;

CREATE TABLE PATHOLOGY (
  idPathology bigint(20) NOT NULL AUTO_INCREMENT,
  startDate datetime NOT NULL,
  endDate datetime,
  pathologyName varchar(255) NOT NULL,
  idMedicalRecord bigint(20) NOT NULL,
  PRIMARY KEY (idPathology)
) ENGINE=InnoDB AUTO_INCREMENT=43 DEFAULT CHARSET=latin1;

CREATE TABLE EXAMINATION_PRESCRIPTION (
  idExaminationPrescription bigint(20) NOT NULL AUTO_INCREMENT,
  datePrescription datetime NOT NULL,
  examinationName varchar(255) NOT NULL,
  idPathology bigint(20) NOT NULL,
  PRIMARY KEY (idExaminationPrescription)
) ENGINE=InnoDB AUTO_INCREMENT=43 DEFAULT CHARSET=latin1;

CREATE TABLE DRUGS_PRESCRIPTION (
  idDrugsPrescription bigint(20) NOT NULL AUTO_INCREMENT,
  datePrescription datetime NOT NULL,
  idPathology bigint(20) NOT NULL,
  PRIMARY KEY (idDrugsPrescription)
) ENGINE=InnoDB AUTO_INCREMENT=43 DEFAULT CHARSET=latin1;

CREATE TABLE DRUGS (
  idDrugs bigint(20) NOT NULL AUTO_INCREMENT,
  drugsName varchar(255) NOT NULL,
  substance varchar(255),
  idDrugsRef bigint(20),
  PRIMARY KEY (idDrugs)
) ENGINE=InnoDB AUTO_INCREMENT=43 DEFAULT CHARSET=latin1;

CREATE TABLE DRUGS_POSOLOGY (
  idDrugsPosology bigint(20) NOT NULL AUTO_INCREMENT,
  drugsName varchar(255) NOT NULL,
  duration integer NOT NULL,
  posology varchar(255) NOT NULL,
  idDrugsPrescription bigint(20) NOT NULL,
  PRIMARY KEY (idDrugsPosology)
) ENGINE=InnoDB AUTO_INCREMENT=43 DEFAULT CHARSET=latin1;
