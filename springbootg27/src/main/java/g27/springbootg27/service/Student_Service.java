package g27.springbootg27.service;

import g27.springbootg27.entity.Student;

public interface Student_Service {

	void add(Student s);
	void update(Student s);
	void delete(Student s);
	Student get(int Studentid);

}
