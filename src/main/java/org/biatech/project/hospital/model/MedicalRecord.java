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
@Table(name = "MEDICAL_RECORD")
public class MedicalRecord implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	@Id
	@GeneratedValue
	private Long idMedicalRecord;
	
	
	@NotEmpty
    @Past
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date creationDate;

    @NotEmpty
    private String observation;
    
    @OneToMany(mappedBy="medicalRecord")
    private List<MedicalExam> medicalExams;

    @OneToMany(mappedBy="medicalRecord")
    private List<Pathology> pathologies;

    @NotEmpty
    @OneToOne(cascade={CascadeType.ALL})
	@JoinColumn(name = "idPatient", referencedColumnName = "idPatient")
    private Patient patient;

    public MedicalRecord() {
        super();
    }

    /**
     * @return the creationDate
     */
    public Date getCreationDate() {
        return creationDate;
    }

    /**
     * @return the observation
     */
    public String getObservation() {
        return observation;
    }

    /**
     * @return the pathologies
     */
    public List<Pathology> getPathologies() {
        return pathologies;
    }

    /**
     * @return the patient
     */
    public Patient getPatient() {
        return patient;
    }

    /**
     * @param creationDate
     *            the creationDate to set
     */
    public void setCreationDate(final Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * @param observation
     *            the observation to set
     */
    public void setObservation(final String observation) {
        this.observation = observation;
    }

    /**
     * @param pathologies
     *            the pathologies to set
     */
    public void setPathologies(final List<Pathology> pathologies) {
        this.pathologies = pathologies;
    }

    /**
     * @param patient
     *            the patient to set
     */
    public void setPatient(final Patient patient) {
        this.patient = patient;
    }

	/**
	 * @return the idMedicalRecord
	 */
	public Long getIdMedicalRecord() {
		return idMedicalRecord;
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

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((creationDate == null) ? 0 : creationDate.hashCode());
		result = prime * result + ((patient == null) ? 0 : patient.hashCode());
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
		MedicalRecord other = (MedicalRecord) obj;
		if (creationDate == null) {
			if (other.creationDate != null)
				return false;
		} else if (!creationDate.equals(other.creationDate))
			return false;
		if (patient == null) {
			if (other.patient != null)
				return false;
		} else if (!patient.equals(other.patient))
			return false;
		return true;
	}

}
