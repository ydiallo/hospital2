package org.biatech.project.hospital.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
@Table(name = "MEDICAL_SPECIALITY")
public class MedicalSpeciality implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

    private String description;

    @Id
    @GeneratedValue
    private Long idMedicalSpeciality;

    @NotEmpty
    private String nameSpeciality;
    
    @OneToMany(mappedBy="medicalSpeciality")
    private List<MedicalProcedure> medicalProcedures;

    public MedicalSpeciality() {
        super();
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @return the id
     */
    public Long getIdMedicalSpeciality() {
        return idMedicalSpeciality;
    }

    /**
     * @return the nameSpeciality
     */
    public String getNameSpeciality() {
        return nameSpeciality;
    }

    /**
     * @param description
     *            the description to set
     */
    public void setDescription(final String description) {
        this.description = description;
    }

    /**
     * @param nameSpeciality
     *            the nameSpeciality to set
     */
    public void setNameSpeciality(final String nameSpeciality) {
        this.nameSpeciality = nameSpeciality;
    }

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((nameSpeciality == null) ? 0 : nameSpeciality.hashCode());
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
		MedicalSpeciality other = (MedicalSpeciality) obj;
		if (nameSpeciality == null) {
			if (other.nameSpeciality != null)
				return false;
		} else if (!nameSpeciality.equals(other.nameSpeciality))
			return false;
		return true;
	}

	/**
	 * @return the medicalProcedures
	 */
	public List<MedicalProcedure> getMedicalProcedures() {
		return medicalProcedures;
	}

	/**
	 * @param medicalProcedures the medicalProcedures to set
	 */
	public void setMedicalProcedures(List<MedicalProcedure> medicalProcedures) {
		this.medicalProcedures = medicalProcedures;
	}

}
