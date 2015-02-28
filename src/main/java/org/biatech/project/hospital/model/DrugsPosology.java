package org.biatech.project.hospital.model;

import java.io.Serializable;

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
@Table(name = "DRUGS_POSOLOGY")
public class DrugsPosology implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Long idDrugsPosology;


    @NotEmpty
    private int duration;

    @NotEmpty
    private String posology;
    
    @NotEmpty
    @ManyToOne
    @JoinColumn(name = "drugsName",referencedColumnName="drugsName")
    private Drugs drugs;
    
    @NotEmpty
    @ManyToOne
    @JoinColumn(name = "idDrugsPrescription",referencedColumnName="idDrugsPrescription")
    private DrugsPrescription drugsPrescription;

    public DrugsPosology() {
        super();
    }

    /**
     * @return the duration
     */
    public int getDuration() {
        return duration;
    }

    /**
     * @return the posology
     */
    public String getPosology() {
        return posology;
    }

    /**
     * @param duration
     *            the duration to set
     */
    public void setDuration(final int duration) {
        this.duration = duration;
    }

    /**
     * @param posology
     *            the posology to set
     */
    public void setPosology(final String posology) {
        this.posology = posology;
    }

	/**
	 * @return the idDrugsPosology
	 */
	public Long getIdDrugsPosology() {
		return idDrugsPosology;
	}

	/**
	 * @param idDrugsPosology the idDrugsPosology to set
	 */
	public void setIdDrugsPosology(Long idDrugsPosology) {
		this.idDrugsPosology = idDrugsPosology;
	}

	/**
	 * @return the drugs
	 */
	public Drugs getDrugs() {
		return drugs;
	}

	/**
	 * @param drugs the drugs to set
	 */
	public void setDrugs(Drugs drugs) {
		this.drugs = drugs;
	}

	/**
	 * @return the drugsPrescription
	 */
	public DrugsPrescription getDrugsPrescription() {
		return drugsPrescription;
	}

	/**
	 * @param drugsPrescription the drugsPrescription to set
	 */
	public void setDrugsPrescription(DrugsPrescription drugsPrescription) {
		this.drugsPrescription = drugsPrescription;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((drugs == null) ? 0 : drugs.hashCode());
		result = prime
				* result
				+ ((drugsPrescription == null) ? 0 : drugsPrescription
						.hashCode());
		result = prime * result + duration;
		result = prime * result
				+ ((posology == null) ? 0 : posology.hashCode());
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
		DrugsPosology other = (DrugsPosology) obj;
		if (drugs == null) {
			if (other.drugs != null)
				return false;
		} else if (!drugs.equals(other.drugs))
			return false;
		if (drugsPrescription == null) {
			if (other.drugsPrescription != null)
				return false;
		} else if (!drugsPrescription.equals(other.drugsPrescription))
			return false;
		if (duration != other.duration)
			return false;
		if (posology == null) {
			if (other.posology != null)
				return false;
		} else if (!posology.equals(other.posology))
			return false;
		return true;
	}
}
