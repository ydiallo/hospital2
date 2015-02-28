package org.biatech.project.hospital.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
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
@Table(name = "EXAMINATION_PRESCRIPTION")
public class ExaminationPrescription implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@NotNull
	@Past
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date datePrescription;

	@NotEmpty
	private String examinationName;

	@Id
	@GeneratedValue
	private Long idExaminationPrescription;

	@NotEmpty
	@ManyToOne(cascade={CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH })
    @JoinColumn(name="idPathology")
	private Pathology pathology;

	public ExaminationPrescription() {
		super();
	}

	/**
	 * @return the pathology
	 */
	public Pathology getPathology() {
		return pathology;
	}

	/**
	 * @param pathology
	 *            the pathology to set
	 */
	public void setPathology(Pathology pathology) {
		this.pathology = pathology;
	}

	/**
	 * @return the datePrescription
	 */
	public Date getDatePrescription() {
		return datePrescription;
	}

	/**
	 * @return the examinationName
	 */
	public String getExaminationName() {
		return examinationName;
	}

	/**
	 * @return the idExaminationPrescription
	 */
	public Long getIdExaminationPrescription() {
		return idExaminationPrescription;
	}

	/**
	 * @param datePrescription
	 *            the datePrescription to set
	 */
	public void setDatePrescription(final Date datePrescription) {
		this.datePrescription = datePrescription;
	}

	/**
	 * @param examinationName
	 *            the examinationName to set
	 */
	public void setExaminationName(final String examinationName) {
		this.examinationName = examinationName;
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
				+ ((datePrescription == null) ? 0 : datePrescription.hashCode());
		result = prime * result
				+ ((examinationName == null) ? 0 : examinationName.hashCode());
		result = prime * result
				+ ((pathology == null) ? 0 : pathology.hashCode());
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
		ExaminationPrescription other = (ExaminationPrescription) obj;
		if (datePrescription == null) {
			if (other.datePrescription != null)
				return false;
		} else if (!datePrescription.equals(other.datePrescription))
			return false;
		if (examinationName == null) {
			if (other.examinationName != null)
				return false;
		} else if (!examinationName.equals(other.examinationName))
			return false;
		if (pathology == null) {
			if (other.pathology != null)
				return false;
		} else if (!pathology.equals(other.pathology))
			return false;
		return true;
	}

}
