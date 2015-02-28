/**
 * 
 */
package org.biatech.project.hospital.brouillon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author yayacky
 *
 */
//@Service("studentService")
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;

	@Transactional
	public Student save(Student student) {
		return studentRepository.save(student);
	}

	public boolean findByLogin(String userName, String password) {
		Student stud = studentRepository.findByUserName(userName);

		if (stud != null && stud.getPassword().equals(password)) {
			return true;
		}

		return false;
	}

	public boolean findByUserName(String userName) {
		Student stud = studentRepository.findByUserName(userName);

		if (stud != null) {
			return true;
		}

		return false;
	}
}
