package Lec_03;

public class Student {
	String name;  //
	private int rollnumber;
	int knowledge;
	String dept;
	
	static int count=1;
	
	Student(String name,int knowledge, String dept){
		rollnumber=count;
		count++;
//		this keyword 
		this.name =name;
		this.knowledge =knowledge;
		this.dept =dept;
	}
	
	Student(){
		rollnumber=count;
		count++;
	}
	public void introduce() {
		System.out.println("Hello my name is "+name+" and iam form "+dept+" department");
	}
	public void study() {
		System.out.println(name+" is Studying...");
		knowledge+=20;
	}
	
	public void teach(Student s1) {
		System.out.println(name+" is teaching "+s1.name);
		knowledge+=10;
		s1.knowledge+=10;
	}
	public void appear_in_Exam() {
		System.out.println(name +" is in examination ");
		if(knowledge>=40) {
			System.out.println("Result : pass");
		}
		else {
			System.out.println("Result : fail");
		}
	}
	
	public int getRollnumber() {
		return rollnumber;
	}
}
