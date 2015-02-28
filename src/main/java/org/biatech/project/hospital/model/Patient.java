package org.biatech.project.hospital.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Past;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

/**
 * 
 * 
 * 
 * <P>
 * 
 * </p>
 * 
 * @version $Revision$ , $Date$
 * @author $Author$
 */

@Component
@XmlRootElement
@Entity
@Table(name = "PATIENT")
public class Patient implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long idPatient;
	
	@NotEmpty
	private String numRegistrationNational;
	
	@NotEmpty
    @Past
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date dateOfBirth;

    @NotEmpty
    private String firstName;

    @NotEmpty
    private char gender;

    @NotEmpty
    private String lastName;
    
    @NotEmpty
    @OneToOne(cascade={CascadeType.ALL})
	@JoinColumn(name = "idAdresse", referencedColumnName = "idAdresse")
    private Adresse adresse;
    
    @OneToOne(cascade={CascadeType.ALL})
	@JoinColumn(name = "numInami", referencedColumnName = "numInami")
    private Doctor doctor;
    
    @NotEmpty
    @OneToOne(cascade={CascadeType.ALL})
	@JoinColumn(name = "idContactInformation", referencedColumnName = "idContactInformation")
    private ContactInformation contactInformation;
    
    @NotEmpty
    @OneToOne(cascade={CascadeType.ALL})
	@JoinColumn(name = "idMedicalRecord", referencedColumnName = "idMedicalRecord")
    private MedicalRecord medicalRecord;
    
    @OneToMany(mappedBy="patient")
    private List<Appointment> appointments;

    public Patient() {
        super();
    }

   /**
     * @return the dateOfBirth
     */
    public Date getDateOfBirth() {
        return dateOfBirth;
    }

     /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @return the gender
     */
    public char getGender() {
        return gender;
    }

    /**
   /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param dateOfBirth
     *            the dateOfBirth to set
     */
    public void setDateOfBirth(final Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * @param firstName
     *            the firstName to set
     */
    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    /**
     * @param gender
     *            the gender to set
     */
    public void setGender(final char gender) {
        this.gender = gender;
    }

    /**
     * @param lastName
     *            the lastName to set
     */
    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

	/**
	 * @return the numRegistrationNational
	 */
	public String getNumRegistrationNational() {
		return numRegistrationNational;
	}

	/**
	 * @param numRegistrationNational the numRegistrationNational to set
	 */
	public void setNumRegistrationNational(String numRegistrationNational) {
		this.numRegistrationNational = numRegistrationNational;
	}

	/**
	 * @return the adresse
	 */
	public Adresse getAdresse() {
		return adresse;
	}

	/**
	 * @param adresse the adresse to set
	 */
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	/**
	 * @return the doctor
	 */
	public Doctor getDoctor() {
		return doctor;
	}

	/**
	 * @param doctor the doctor to set
	 */
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	/**
	 * @return the contactInformation
	 */
	public ContactInformation getContactInformation() {
		return contactInformation;
	}

	/**
	 * @param contactInformation the contactInformation to set
	 */
	public void setContactInformation(ContactInformation contactInformation) {
		this.contactInformation = contactInformation;
	}

	/**
	 * @return the medicalRecord
	 */
	public MedicalRecord getMedicalRecord() {
		return medicalRecord;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((numRegistrationNational == null) ? 0
						: numRegistrationNational.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Patient other = (Patient) obj;
		if (numRegistrationNational == null) {
			if (other.numRegistrationNational != null)
				return false;
		} else if (!numRegistrationNational
				.equals(other.numRegistrationNational))
			return false;
		return true;
	}

	/**
	 * @param medicalRecord the medicalRecord to set
	 */
	public void setMedicalRecord(MedicalRecord medicalRecord) {
		this.medicalRecord = medicalRecord;
	}

	/**
	 * @return the appointments
	 */
	public List<Appointment> getAppointments() {
		return appointments;
	}

	/**
	 * @param appointments the appointments to set
	 */
	public void setAppointments(List<Appointment> appointments) {
		this.appointments = appointments;
	}

	/**
	 * @return the idPatient
	 */
	public Long getIdPatient() {
		return idPatient;
	}
}
