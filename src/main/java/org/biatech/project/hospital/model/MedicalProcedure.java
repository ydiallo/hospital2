package org.biatech.project.hospital.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "MEDICAL_PROCEDURE")
public class MedicalProcedure implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@NotEmpty
    private String averageDuration;

    @Id
    @GeneratedValue
    private Long idMedicalProcedure;

    @NotEmpty
    private String nameProcedure;
    
    @NotEmpty
    @ManyToOne(cascade={CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH })
    @JoinColumn(name="nameSpeciality",referencedColumnName="nameSpeciality")
    private MedicalSpeciality medicalSpeciality;

    public MedicalProcedure() {
        super();
    }

    /**
     * @return the averageDuration
     */
    public String getAverageDuration() {
        return averageDuration;
    }

    /**
     * @return the nameProcedure
     */
    public String getNameProcedure() {
        return nameProcedure;
    }

    /**
     * @param averageDuration
     *            the averageDuration to set
     */
    public void setAverageDuration(final String averageDuration) {
        this.averageDuration = averageDuration;
    }

    /**
     * @param nameProcedure
     *            the nameProcedure to set
     */
    public void setNameProcedure(final String nameProcedure) {
        this.nameProcedure = nameProcedure;
    }

	public Long getIdMedicalProcedure() {
		return idMedicalProcedure;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((averageDuration == null) ? 0 : averageDuration.hashCode());
		result = prime
				* result
				+ ((medicalSpeciality == null) ? 0 : medicalSpeciality
						.hashCode());
		result = prime * result
				+ ((nameProcedure == null) ? 0 : nameProcedure.hashCode());
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
		MedicalProcedure other = (MedicalProcedure) obj;
		if (averageDuration == null) {
			if (other.averageDuration != null)
				return false;
		} else if (!averageDuration.equals(other.averageDuration))
			return false;
		if (medicalSpeciality == null) {
			if (other.medicalSpeciality != null)
				return false;
		} else if (!medicalSpeciality.equals(other.medicalSpeciality))
			return false;
		if (nameProcedure == null) {
			if (other.nameProcedure != null)
				return false;
		} else if (!nameProcedure.equals(other.nameProcedure))
			return false;
		return true;
	}

	/**
	 * @return the medicalSpeciality
	 */
	public MedicalSpeciality getMedicalSpeciality() {
		return medicalSpeciality;
	}

	/**
	 * @param medicalSpeciality the medicalSpeciality to set
	 */
	public void setMedicalSpeciality(MedicalSpeciality medicalSpeciality) {
		this.medicalSpeciality = medicalSpeciality;
	}
}
