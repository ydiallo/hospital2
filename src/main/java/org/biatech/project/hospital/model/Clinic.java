/**
 * 
 */
package org.biatech.project.hospital.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Component;

/**
 * @author yayacky
 * 
 */
@Component
@XmlRootElement
@Entity
@Table(name = "CLINIC")
public class Clinic implements Serializable {

    /**
	 * 
	 */
    private static final long serialVersionUID = -3880891939909817898L;

    
    @Id
    @GeneratedValue
    private Long idClinic;
    
    @NotEmpty
    private String clinicName;

    @NotEmpty
    private String registration;
    
    
	@OneToOne(cascade={CascadeType.ALL})
	@JoinColumn(name = "idAdresse", referencedColumnName = "idAdresse")
    private Adresse adresse;
	
	@OneToMany(mappedBy="clinic")
	private List<Doctor> doctors;


    @NotEmpty
    private int employees;
    
    
    public Clinic() {
        super();
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Clinic other = (Clinic) obj;
        if (clinicName == null) {
            if (other.clinicName != null) {
                return false;
            }
        } else if (!clinicName.equals(other.clinicName)) {
            return false;
        }
        if (registration == null) {
            if (other.registration != null) {
                return false;
            }
        } else if (!registration.equals(other.registration)) {
            return false;
        }
        return true;
    }

    public int getEmployees() {
        return employees;
    }

    public Long getIdClinic() {
        return idClinic;
    }

    public String getClinicName() {
        return clinicName;
    }

    public String getRegistration() {
        return registration;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((clinicName == null) ? 0 : clinicName.hashCode());
        result = prime * result + ((registration == null) ? 0 : registration.hashCode());
        return result;
    }

    public void setEmployees(final int employees) {
        this.employees = employees;
    }

    public void setClinicName(final String clinicName) {
        this.clinicName = clinicName;
    }

    public void setRegistration(final String registration) {
        this.registration = registration;
    }

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

}
