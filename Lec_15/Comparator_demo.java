package Lec_15;

import java.util.Comparator;
import java.util.TreeSet;

public class Comparator_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object o=new Object();
		
		TreeSet<Student> set=new TreeSet<>(new StudentComparator_rollNumber());
		
		Student s1=new Student("gaurav", 400,5);
		Student s2=new Student("shubham", 200,3);
		Student s3=new Student("aman", 240,2);
		Student s4=new Student("tarun", 300,1);
		Student s5=new Student("tanuj", 450,9);
		Student s6=new Student("abhishek", 500,7);
		
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		set.add(s5);
		set.add(s6);
		
		System.out.println(set);
		
	}

}
class Student{
	String name;
	int marks;
	int rollnumber;
	
	Student(){
		
	}
	Student(String n, int m, int rn){
		name=n;
		marks=m;
		rollnumber=rn;
	}
	
	@Override
	public String toString() {
		return name;
	}
	
}
class StudentComparator_marks implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.marks-o2.marks;
	}
	
}
class StudentComparator_rollNumber implements Comparator<Student>{
	
	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.rollnumber-o2.rollnumber;
	}
	
}
