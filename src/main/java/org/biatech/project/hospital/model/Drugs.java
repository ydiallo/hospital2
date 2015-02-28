package org.biatech.project.hospital.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
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
@Table(name = "DRUGS")
public class Drugs implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long idDrugs;

    @NotEmpty
    private String drugsName;
    
    @ManyToMany
    @JoinTable(name="DRUGS",
     joinColumns=@JoinColumn(name="idDrugs"),
     inverseJoinColumns=@JoinColumn(name="idDrugsRef")
    )
    private List<Drugs> drugs;

    
    @ManyToMany
    @JoinTable(name="DRUGS",
     joinColumns=@JoinColumn(name="idDrugsRef"),
     inverseJoinColumns=@JoinColumn(name="idDrugs")
    )
    private List<Drugs> drugsRef;

    private String substance;
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "drugs")
    private List<DrugsPosology> drugsPosologies;

    public Drugs() {
        super();
    }

   
    /**
     * @return the substance
     */
    public String getSubstance() {
        return substance;
    }

    /**
     * @param substance
     *            the substance to set
     */
    public void setSubstance(final String substance) {
        this.substance = substance;
    }

	/**
	 * @return the drugsRef
	 */
	public List<Drugs> getDrugsRef() {
		return drugsRef;
	}

	/**
	 * @param drugsRef the drugsRef to set
	 */
	public void setDrugsRef(List<Drugs> drugsRef) {
		this.drugsRef = drugsRef;
	}

	/**
	 * @return the idDrugs
	 */
	public Long getIdDrugs() {
		return idDrugs;
	}

	/**
	 * @return the drugsName
	 */
	public String getDrugsName() {
		return drugsName;
	}


	/**
	 * @param drugsName the drugsName to set
	 */
	public void setDrugsName(String drugsName) {
		this.drugsName = drugsName;
	}


	/**
	 * @return the drugsPosologies
	 */
	public List<DrugsPosology> getDrugsPosologies() {
		return drugsPosologies;
	}


	/**
	 * @param drugsPosologies the drugsPosologies to set
	 */
	public void setDrugsPosologies(List<DrugsPosology> drugsPosologies) {
		this.drugsPosologies = drugsPosologies;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((drugsName == null) ? 0 : drugsName.hashCode());
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
		Drugs other = (Drugs) obj;
		if (drugsName == null) {
			if (other.drugsName != null)
				return false;
		} else if (!drugsName.equals(other.drugsName))
			return false;
		return true;
	}

}
