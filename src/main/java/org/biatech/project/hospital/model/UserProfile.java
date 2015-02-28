package org.biatech.project.hospital.model;

import java.io.Serializable;

import javax.persistence.Column;
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
@Table(name = "USER_PROFILE")
public class UserProfile implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Long idUserProfile;

	@NotEmpty
	@Column(name = "enabled", columnDefinition = "BIT", length = 1)
    private boolean enabled;

	@NotEmpty
	@ManyToOne
    @JoinColumn(name = "profileName",referencedColumnName="profileName")
    private Profiles profile;
	
	@ManyToOne
    @JoinColumn(name = "login",referencedColumnName="login", insertable = false, updatable = false)
	private Doctor doctor;
	
	@ManyToOne
    @JoinColumn(name = "login",referencedColumnName="login", insertable = false, updatable = false)
	private Secretary secretary;
	


    public UserProfile() {
        super();
    }
  
    /**
     * @return the enabled
     */
    public boolean isEnabled() {
        return enabled;
    }

    /**
     * @param enabled
     *            the enabled to set
     */
    public void setEnabled(final boolean enabled) {
        this.enabled = enabled;
    }

}
