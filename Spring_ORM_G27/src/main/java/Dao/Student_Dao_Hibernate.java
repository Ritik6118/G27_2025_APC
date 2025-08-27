package Dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import Entity.Student;

public class Student_Dao_Hibernate implements Student_dao{

	private HibernateTemplate ht;
	
	public Student_Dao_Hibernate() {}
	
	public Student_Dao_Hibernate(HibernateTemplate ht) {
		super();
		this.ht = ht;
	}

	public HibernateTemplate getHt() {
		return ht;
	}

	public void setHt(HibernateTemplate ht) {
		this.ht = ht;
	}

	@Override
	@Transactional
	public void insert(Student s) {
		// TODO Auto-generated method stub
		ht.persist(s);
	}

	@Override
	@Transactional
	public void update(Student s) {
		// TODO Auto-generated method stub
		ht.merge(s);
	}

	@Override
	@Transactional
	public void delete(Student s) {
		// TODO Auto-generated method stub
		ht.delete(s);
	}

	@Override
	@Transactional
	public Student get(int rn) {
		// TODO Auto-generated method stub
		Student s=ht.get(Student.class, rn);
		return s;
	}

	@Override
	public List<Student> getAll() {
		// TODO Auto-generated method stub
		List<Student> li=ht.loadAll(Student.class);
		return li;
	}

}
