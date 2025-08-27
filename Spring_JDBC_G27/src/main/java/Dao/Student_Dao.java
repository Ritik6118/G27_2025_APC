package Dao;

import java.util.List;

import Entity.Student;

public interface Student_Dao {
	
	void insert_Student(Student s);
	
	void update_Student(Student s);
	
	void delete_Student(Student s);
	
	Student get_Student(int rollnumber);
	
	List<Student> get_all();
}
