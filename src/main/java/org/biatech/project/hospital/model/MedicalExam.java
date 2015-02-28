package org.biatech.project.hospital.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "MEDICAL_EXAM")
public class MedicalExam implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Long idMedicalExam;

	@NotEmpty
    @Past
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date dateExamination;
	
	
	@NotEmpty
	@ManyToOne
    @JoinColumn(name = "idMedicalRecord",referencedColumnName="idMedicalRecord")
    private MedicalRecord medicalRecord;
	
	@NotEmpty
	@ManyToOne
    @JoinColumn(name = "numInami",referencedColumnName="numInami")
    private Doctor doctor;

    @NotEmpty
    private String objectExam;

    @NotEmpty
    private String observation;

    public MedicalExam() {
        super();
    }

    /**
     * @return the dateExamination
     */
    public Date getDateExamination() {
        return dateExamination;
    }

    /**
     * @return the objectExam
     */
    public String getObjectExam() {
        return objectExam;
    }

    /**
     * @return the observation
     */
    public String getObservation() {
        return observation;
    }

    /**
     * @param dateExamination
     *            the dateExamination to set
     */
    public void setDateExamination(final Date dateExamination) {
        this.dateExamination = dateExamination;
    }

    /**
     * @param objectExam
     *            the objectExam to set
     */
    public void setObjectExam(final String objectExam) {
        this.objectExam = objectExam;
    }

    /**
     * @param observation
     *            the observation to set
     */
    public void setObservation(final String observation) {
        this.observation = observation;
    }

	/**
	 * @return the medicalRecord
	 */
	public MedicalRecord getMedicalRecord() {
		return medicalRecord;
	}

	/**
	 * @param medicalRecord the medicalRecord to set
	 */
	public void setMedicalRecord(MedicalRecord medicalRecord) {
		this.medicalRecord = medicalRecord;
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
	 * @return the idMedicalExam
	 */
	public Long getIdMedicalExam() {
		return idMedicalExam;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((dateExamination == null) ? 0 : dateExamination.hashCode());
		result = prime * result + ((doctor == null) ? 0 : doctor.hashCode());
		result = prime * result
				+ ((medicalRecord == null) ? 0 : medicalRecord.hashCode());
		result = prime * result
				+ ((objectExam == null) ? 0 : objectExam.hashCode());
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
		MedicalExam other = (MedicalExam) obj;
		if (dateExamination == null) {
			if (other.dateExamination != null)
				return false;
		} else if (!dateExamination.equals(other.dateExamination))
			return false;
		if (doctor == null) {
			if (other.doctor != null)
				return false;
		} else if (!doctor.equals(other.doctor))
			return false;
		if (medicalRecord == null) {
			if (other.medicalRecord != null)
				return false;
		} else if (!medicalRecord.equals(other.medicalRecord))
			return false;
		if (objectExam == null) {
			if (other.objectExam != null)
				return false;
		} else if (!objectExam.equals(other.objectExam))
			return false;
		return true;
	}
}
