package g27.springbootg27.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Student_from_springboot")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Student_id;
	
	private String name;
	private String email;
	public int getStudent_id() {
		return Student_id;
	}
	public void setStudent_id(int student_id) {
		Student_id = student_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Student(int student_id, String name, String email) {
		super();
		Student_id = student_id;
		this.name = name;
		this.email = email;
	}
	public Student() {
		super();
	}
	
}
