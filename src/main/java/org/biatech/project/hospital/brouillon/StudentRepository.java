/**
 * 
 */
package org.biatech.project.hospital.brouillon;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * @author yayacky
 *
 */
public interface StudentRepository extends JpaRepository<Student, Long> {
	  
	  @Query("select s from Student s where s.userName = :userName")
	  Student findByUserName(@Param("userName") String userName);
}
