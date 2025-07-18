package Lec_12;

import java.util.TreeSet;

public class Comparable_and_Comparator_demo {
	
	public static void main(String [] args) {
//		TreeSet<Integer> set=new TreeSet<>();
//		
//		set.add(1);
//		set.add(2);
//		set.add(9);
//		set.add(7);
//		set.add(8);
//		set.add(3);
//		set.add(5);
//		
//		System.out.println(set);

		TreeSet<Student> set=new TreeSet<>();
		Student s1=new Student("tarun", 200);
		Student s2=new Student("rohit", 300);
		Student s3=new Student("gaurav", 500);
		
		set.add(s3);
		set.add(s1);
		set.add(s2);
		
		System.out.println(set);
		
	}
}
class Student implements Comparable<Student>{
	String name;
	int marks;
	Student(){
		
	}
	Student(String name, int marks){
		this.name =name;
		this.marks=marks;
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
//		return this.marks-o.marks;// ascending order
		return o.marks-this.marks;// descending order
	}
	
	@Override
	public String toString() {
		return name;
	}
}


