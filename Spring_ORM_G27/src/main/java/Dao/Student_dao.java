package Dao;

import java.util.List;

import Entity.Student;

public interface Student_dao {
	void insert(Student s);

	void update(Student s);

	void delete(Student s);

	Student get(int rn);

	List<Student> getAll();
}
