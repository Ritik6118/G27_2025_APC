package Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Student_Table")
public class Student {
	
	@Id
	@Column(name ="sId")
	private int rollnumber;
	
	@Column(name= "Student's Name")
	private String name;
	
	private int age;

	@Embedded
	private Address address;

	public Student(int rollnumber, String name, int age, Address address) {
		super();
		this.rollnumber = rollnumber;
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	
	public Student() {}
	
	public Student(int rollnumber, String name, int age) {
		super();
		this.rollnumber = rollnumber;
		this.name = name;
		this.age = age;
	}

	public int getRollnumber() {
		return rollnumber;
	}

	public void setRollnumber(int rollnumber) {
		this.rollnumber = rollnumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
