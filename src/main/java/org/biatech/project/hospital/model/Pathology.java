package org.biatech.project.hospital.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
@Table(name = "PATHOLOGY")
public class Pathology implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long idPathology;
	
	@NotEmpty
    @Past
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date startDate;
    
    @Past
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date endDate;
    
    @NotEmpty
    private String pathologyName;
    
    @NotEmpty
    @ManyToOne(cascade={CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH })
    @JoinColumn(name="idMedicalRecord")
    private MedicalRecord medicalRecord;
    
    @OneToMany(mappedBy="pathology")
    private List<DrugsPrescription> drugsPrescription;

    @OneToMany(mappedBy="pathology")
    private List<ExaminationPrescription> examinationPrescription;

    public Pathology() {
        super();
    }

    /**
     * @return the drugsPrescription
     */
    public List<DrugsPrescription> getDrugsPrescription() {
        return drugsPrescription;
    }

    /**
     * @return the endDate
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * @return the examinationPrescription
     */
    public List<ExaminationPrescription> getExaminationPrescription() {
        return examinationPrescription;
    }

    /**
     * @return the medicalRecord
     */
    public MedicalRecord getMedicalRecord() {
        return medicalRecord;
    }

    /**
     * @return the pathologyName
     */
    public String getPathologyName() {
        return pathologyName;
    }

    /**
     * @return the startDate
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * @param drugsPrescription
     *            the drugsPrescription to set
     */
    public void setDrugsPrescription(final List<DrugsPrescription> drugsPrescription) {
        this.drugsPrescription = drugsPrescription;
    }

    /**
     * @param endDate
     *            the endDate to set
     */
    public void setEndDate(final Date endDate) {
        this.endDate = endDate;
    }

    /**
     * @param examinationPrescription
     *            the examinationPrescription to set
     */
    public void setExaminationPrescription(final List<ExaminationPrescription> examinationPrescription) {
        this.examinationPrescription = examinationPrescription;
    }

    /**
     * @param medicalRecord
     *            the medicalRecord to set
     */
    public void setMedicalRecord(final MedicalRecord medicalRecord) {
        this.medicalRecord = medicalRecord;
    }

    /**
     * @param pathologyName
     *            the pathologyName to set
     */
    public void setPathologyName(final String pathologyName) {
        this.pathologyName = pathologyName;
    }

    /**
     * @param startDate
     *            the startDate to set
     */
    public void setStartDate(final Date startDate) {
        this.startDate = startDate;
    }
    
    /**
	 * @return the idPathology
	 */
	public Long getIdPathology() {
		return idPathology;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((endDate == null) ? 0 : endDate.hashCode());
		result = prime * result
				+ ((medicalRecord == null) ? 0 : medicalRecord.hashCode());
		result = prime * result
				+ ((pathologyName == null) ? 0 : pathologyName.hashCode());
		result = prime * result
				+ ((startDate == null) ? 0 : startDate.hashCode());
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
		Pathology other = (Pathology) obj;
		if (endDate == null) {
			if (other.endDate != null)
				return false;
		} else if (!endDate.equals(other.endDate))
			return false;
		if (medicalRecord == null) {
			if (other.medicalRecord != null)
				return false;
		} else if (!medicalRecord.equals(other.medicalRecord))
			return false;
		if (pathologyName == null) {
			if (other.pathologyName != null)
				return false;
		} else if (!pathologyName.equals(other.pathologyName))
			return false;
		if (startDate == null) {
			if (other.startDate != null)
				return false;
		} else if (!startDate.equals(other.startDate))
			return false;
		return true;
	}

}
