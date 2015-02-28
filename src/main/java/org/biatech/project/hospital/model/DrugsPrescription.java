package org.biatech.project.hospital.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
@Table(name = "DRUGS_PRESCRIPTION")
public class DrugsPrescription implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long idDrugsPrescription;

    @NotEmpty
    @Past
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date datePrescription;
    
    @NotEmpty
    @ManyToOne(cascade={CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH })
    @JoinColumn(name="idPathology")
    private Pathology pathology;
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "drugsPrescription")
    private List<DrugsPosology> drugsPosologies;

    public DrugsPrescription() {
        super();
    }

    /**
     * @return the datePrescription
     */
    public Date getDatePrescription() {
        return datePrescription;
    }


    /**
     * @param datePrescription
     *            the datePrescription to set
     */
    public void setDatePrescription(final Date datePrescription) {
        this.datePrescription = datePrescription;
    }

	/**
	 * @return the pathology
	 */
	public Pathology getPathology() {
		return pathology;
	}

	/**
	 * @param pathology the pathology to set
	 */
	public void setPathology(Pathology pathology) {
		this.pathology = pathology;
	}

	/**
	 * @return the idDrugsPrescription
	 */
	public Long getIdDrugsPrescription() {
		return idDrugsPrescription;
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
		DrugsPrescription other = (DrugsPrescription) obj;
		if (datePrescription == null) {
			if (other.datePrescription != null)
				return false;
		} else if (!datePrescription.equals(other.datePrescription))
			return false;
		if (pathology == null) {
			if (other.pathology != null)
				return false;
		} else if (!pathology.equals(other.pathology))
			return false;
		return true;
	}


}
