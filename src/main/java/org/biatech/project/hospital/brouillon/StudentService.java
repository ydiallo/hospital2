/**
 * 
 */
package org.biatech.project.hospital.brouillon;


/**
 * @author yayacky
 *
 */
public interface StudentService {
	Student save(Student student);

	boolean findByLogin(String userName, String password);

	boolean findByUserName(String userName);
}
