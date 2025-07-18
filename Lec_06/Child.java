package Lec_06;

public class Child extends Parent{
	int c;
	int d;
	
	int common;
	
	Child(){
		c=30;
		d=40;
		common=100;
	}
	
	public void fun3() {
		System.out.println("hello from fun3");
	}
	public void fun4() {
		System.out.println("hello from fun4");
	}
	public void fun5() {
		System.out.println("hello from fun5 of child class");
	}
}
