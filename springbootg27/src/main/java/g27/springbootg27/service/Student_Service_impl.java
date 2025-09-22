package g27.springbootg27.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import g27.springbootg27.entity.Student;
import g27.springbootg27.repository.Student_repository;


@Service
public class Student_Service_impl implements Student_Service{

	@Autowired
	Student_repository sr;
	
	@Override
	public void add(Student s) {
		// TODO Auto-generated method stub
		sr.save(s);
	}

	@Override
	public void update(Student s) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Student s) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Student get(int Studentid) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
