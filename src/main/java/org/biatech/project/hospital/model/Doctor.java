package org.biatech.project.hospital.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.validator.constraints.NotEmpty;
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
@Table(name = "DOCTOR")
@SecondaryTable(name="DOCTOR", pkJoinColumns = @PrimaryKeyJoinColumn(name="idUser"))
public class Doctor extends Users implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@NotEmpty
	private String firstName;

	@NotEmpty
	private String numInami;

	@NotEmpty
	private char gender;

	@NotEmpty
	private String lastName;
	
	@OneToMany(mappedBy="doctor")
	private List<MedicalExam> medicalExams;

	@ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE,
			CascadeType.REFRESH })
	@JoinColumn(name = "idSecretary")
	private Secretary secretary;

	@NotEmpty
	@OneToOne(cascade={CascadeType.ALL})
	@JoinColumn(name = "idClinic", referencedColumnName = "idClinic")
	private Clinic clinic;
	
	@NotEmpty
	@OneToOne(cascade={CascadeType.ALL})
	@JoinColumn(name = "idAdresse", referencedColumnName = "idAdresse")
	private Adresse adresse;

	@NotEmpty
	@OneToOne(cascade={CascadeType.ALL})
	@JoinColumn(name = "idContactInformation", referencedColumnName = "idContactInformation")
	private ContactInformation contactInformation;

	@NotEmpty
	@OneToOne(cascade={CascadeType.ALL})
	@JoinColumn(name = "idMedicalSpeciality", referencedColumnName = "idMedicalSpeciality")
	private MedicalSpeciality medicalSpeciality;

	@OneToMany(mappedBy = "doctor")
	private List<Appointment> appointments;
	
	@OneToMany(mappedBy="doctor",targetEntity=UserProfile.class)
	private List<UserProfile> userProfiles;

	public Doctor() {
		super();
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
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @return the secretary
	 */
	public Secretary getSecretary() {
		return secretary;
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
	 * @return the numInami
	 */
	public String getNumInami() {
		return numInami;
	}

	/**
	 * @param numInami
	 *            the numInami to set
	 */
	public void setNumInami(String numInami) {
		this.numInami = numInami;
	}

	/**
	 * @return the adresse
	 */
	public Adresse getAdresse() {
		return adresse;
	}

	/**
	 * @param adresse
	 *            the adresse to set
	 */
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	/**
	 * @return the contactInformation
	 */
	public ContactInformation getContactInformation() {
		return contactInformation;
	}

	/**
	 * @param contactInformation
	 *            the contactInformation to set
	 */
	public void setContactInformation(ContactInformation contactInformation) {
		this.contactInformation = contactInformation;
	}

	/**
	 * @return the medicalSpeciality
	 */
	public MedicalSpeciality getMedicalSpeciality() {
		return medicalSpeciality;
	}

	/**
	 * @param medicalSpeciality
	 *            the medicalSpeciality to set
	 */
	public void setMedicalSpeciality(MedicalSpeciality medicalSpeciality) {
		this.medicalSpeciality = medicalSpeciality;
	}

	/**
	 * @return the appointments
	 */
	public List<Appointment> getAppointments() {
		return appointments;
	}

	/**
	 * @param appointments
	 *            the appointments to set
	 */
	public void setAppointments(List<Appointment> appointments) {
		this.appointments = appointments;
	}

	/**
	 * @return the medicalExams
	 */
	public List<MedicalExam> getMedicalExams() {
		return medicalExams;
	}

	/**
	 * @param medicalExams the medicalExams to set
	 */
	public void setMedicalExams(List<MedicalExam> medicalExams) {
		this.medicalExams = medicalExams;
	}

	/**
	 * @return the clinic
	 */
	public Clinic getClinic() {
		return clinic;
	}

	/**
	 * @param clinic the clinic to set
	 */
	public void setClinic(Clinic clinic) {
		this.clinic = clinic;
	}

	/**
	 * @return the userProfiles
	 */
	public List<UserProfile> getUserProfiles() {
		return userProfiles;
	}

	/**
	 * @param userProfiles the userProfiles to set
	 */
	public void setUserProfiles(List<UserProfile> userProfiles) {
		this.userProfiles = userProfiles;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((numInami == null) ? 0 : numInami.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
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
		Doctor other = (Doctor) obj;
		if (numInami == null) {
			if (other.numInami != null)
				return false;
		} else if (!numInami.equals(other.numInami))
			return false;
		return true;
	}

	/**
	 * @param secretary
	 *            the secretary to set
	 */
	public void setSecretary(final Secretary secretary) {
		this.secretary = secretary;
	}

}
