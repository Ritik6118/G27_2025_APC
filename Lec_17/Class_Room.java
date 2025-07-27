package Lec_17;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Class_Room {

	static File f=new File("Student_db.txt");
	static HashSet<Integer> set=new HashSet<>();
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ArrayList<Student> li=get_all();
		for(Student s:li) {
			set.add(s.roll);
		}
//		f.createNewFile();
		addStudent();
		li=get_all();
		System.out.println(li);
	}
	public static ArrayList<Student> get_all() throws FileNotFoundException{
		Scanner sc=new Scanner(f);
		ArrayList<Student> li=new ArrayList<>(); 
		while(sc.hasNext()) {
			String s=sc.nextLine();
			String [] arr=s.split(" ");
			li.add(new Student(Integer.parseInt(arr[0]),arr[1],Integer.parseInt(arr[2])));
		}
		return li;
	}
	
	public static void addStudent() throws IOException {
		System.out.println("write rollnumber name age of student :");
		Scanner sc=new Scanner(System.in);
		Student s=new Student(sc.nextInt(),sc.next(),sc.nextInt());
		if(set.contains(s.roll)) {
			System.out.println("Invalid Entry Roll Already Exist!");
		}
		else {
			FileWriter fr=new FileWriter(f,true);
			PrintWriter pr =new PrintWriter(fr);
			set.add(s.roll);
			pr.println(s.roll+" "+s.name+" "+s.age);
			pr.flush();
			pr.close();			
			System.out.println(s.name +" added succesfully");
		}
		
	}

}

class Student{
	int roll; 
	String name;
	int age;
	
	Student(int r,String n,int a){
		roll=r;
		name=n;
		age=a;
	}
	Student(){}
	
	@Override
	public String toString() {
		return "name: "+name+"\n"+"roll number: "+roll+"\n"+"age: "+age+"\n";
	}
}
