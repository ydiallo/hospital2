package org.biatech.project.hospital.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
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
@Table(name = "SECRETARY")
@SecondaryTable(name="SECRETARY", pkJoinColumns = @PrimaryKeyJoinColumn(name="idUser"))
public class Secretary extends Users implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	

	@NotEmpty
	private String firstName;

	@NotEmpty
	private char gender;

	@NotEmpty
	private String lastName;
	
	@OneToMany(mappedBy="secretary")
	private List<Doctor> doctors;
	
	@OneToMany(mappedBy="secretary",targetEntity=UserProfile.class)
	private List<UserProfile> userProfiles;
	
	@NotEmpty
	@OneToOne(cascade={CascadeType.ALL})
	@JoinColumn(name = "idAdresse", referencedColumnName = "idAdresse")
	private Adresse adresse;
	
	@NotEmpty
	@OneToOne(cascade={CascadeType.ALL})
	@JoinColumn(name = "idContactInformation", referencedColumnName = "idContactInformation")
	private ContactInformation contactInformation;

	public Secretary() {
		super();
	}

	/**
	 * @return the doctors
	 */
	public List<Doctor> getDoctors() {
		return doctors;
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
	 * /**
	 * 
	 * @param doctors
	 *            the doctors to set
	 */
	public void setDoctors(final List<Doctor> doctors) {
		this.doctors = doctors;
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

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public ContactInformation getContactInformation() {
		return contactInformation;
	}

	public void setContactInformation(ContactInformation contactInformation) {
		this.contactInformation = contactInformation;
	}
}
