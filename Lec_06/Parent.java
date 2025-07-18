package Lec_06;

public class Parent {
	int a;
	int b;
	
	int common;
	
	Parent(){
		a=10;
		b=20;
		common=50;
	}
	 
	public void fun1() {
		System.out.println("hello from fun1");
	}
	
	public void fun2() {
		System.out.println("Hello from fun2");
	}
	
	public void fun5() {
		System.out.println("hello from fun5 of parent class");
	}
}
