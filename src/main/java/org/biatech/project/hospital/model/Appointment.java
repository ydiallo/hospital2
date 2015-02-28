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
import javax.validation.constraints.Past;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

@Component
@XmlRootElement
@Entity
@Table(name = "APPOINTMENT")
public class Appointment implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    
    @Id
    @GeneratedValue
    private Long idAppointment;
    
    @NotEmpty
    @Past
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date dateAppointment;

    private String description;

    @NotEmpty
    @ManyToOne(cascade={CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH })
    @JoinColumn(name="numInami",referencedColumnName="numInami")
    private Doctor doctor;

    @NotEmpty
    @Past
    @DateTimeFormat(pattern = "hh:mm")
    private Date endTime;

    @ManyToOne(cascade={CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH })
    @JoinColumn(name="idPatient")
    private Patient patient;

    @NotEmpty
    @Past
    @DateTimeFormat(pattern = "hh:mm")
    private Date startTime;

    @NotEmpty
    private String title;
    

    public Appointment() {
        super();
    }

    /**
     * @return the dateAppointment
     */
    public Date getDateAppointment() {
        return dateAppointment;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @return the doctor
     */
    public Doctor getDoctor() {
        return doctor;
    }

    /**
     * @return the endTime
     */
    public Date getEndTime() {
        return endTime;
    }	

    /**
     * @return the patient
     */
    public Patient getPatient() {
        return patient;
    }

    /**
     * @return the startTime
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param dateAppointment
     *            the dateAppointment to set
     */
    public void setDateAppointment(final Date dateAppointment) {
        this.dateAppointment = dateAppointment;
    }

    /**
     * @param description
     *            the description to set
     */
    public void setDescription(final String description) {
        this.description = description;
    }

    /**
     * @param doctor
     *            the doctor to set
     */
    public void setDoctor(final Doctor doctor) {
        this.doctor = doctor;
    }

    /**
     * @param endTime
     *            the endTime to set
     */
    public void setEndTime(final Date endTime) {
        this.endTime = endTime;
    }

    /**
     * @param patient
     *            the patient to set
     */
    public void setPatient(final Patient patient) {
        this.patient = patient;
    }

    /**
     * @param startTime
     *            the startTime to set
     */
    public void setStartTime(final Date startTime) {
        this.startTime = startTime;
    }

    /**
     * @param title
     *            the title to set
     */
    public void setTitle(final String title) {
        this.title = title;
    }

	/**
	 * @return the idAppointment
	 */
	public Long getIdAppointment() {
		return idAppointment;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((dateAppointment == null) ? 0 : dateAppointment.hashCode());
		result = prime * result + ((doctor == null) ? 0 : doctor.hashCode());
		result = prime * result + ((endTime == null) ? 0 : endTime.hashCode());
		result = prime * result
				+ ((startTime == null) ? 0 : startTime.hashCode());
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
		Appointment other = (Appointment) obj;
		if (dateAppointment == null) {
			if (other.dateAppointment != null)
				return false;
		} else if (!dateAppointment.equals(other.dateAppointment))
			return false;
		if (doctor == null) {
			if (other.doctor != null)
				return false;
		} else if (!doctor.equals(other.doctor))
			return false;
		if (endTime == null) {
			if (other.endTime != null)
				return false;
		} else if (!endTime.equals(other.endTime))
			return false;
		if (startTime == null) {
			if (other.startTime != null)
				return false;
		} else if (!startTime.equals(other.startTime))
			return false;
		return true;
	}

}
