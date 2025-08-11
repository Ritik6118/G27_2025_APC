package Lec_30;

import java.util.HashMap;
import java.util.List;

public class Student {
	private String name;
	private int rollnumber;
	private List<String> courses;
	private HashMap<String, String> Trainer_Course_Mapping;
	private Laptop laptop;
	private Address address;


	Student(){
		
	}
	public Student(String name, int rollnumber, List<String> courses, HashMap<String, String> trainer_Course_Mapping,
			Laptop laptop, Address address) {
		super();
		this.name = name;
		this.rollnumber = rollnumber;
		this.courses = courses;
		Trainer_Course_Mapping = trainer_Course_Mapping;
		this.laptop = laptop;
		this.address = address;
	}

	public List<String> getCourses() {
		return courses;
	}
	
	public void setCourses(List<String> courses) {
		this.courses = courses;
	}
	
	public HashMap<String, String> getTrainer_Course_Mapping() {
		return Trainer_Course_Mapping;
	}
	
	public void setTrainer_Course_Mapping(HashMap<String, String> trainer_Course_Mapping) {
		Trainer_Course_Mapping = trainer_Course_Mapping;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollnumber() {
		return rollnumber;
	}

	public void setRollnumber(int rollnumber) {
		this.rollnumber = rollnumber;
	}

	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

//	Student(Laptop l, Address a){
//		laptop =l;
//		address=a;
//	}

}
