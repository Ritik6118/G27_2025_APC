package Entity;

public class Student {
	private int rollnumber;
	private String name;
	private int age;

	Student() {
	}

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
