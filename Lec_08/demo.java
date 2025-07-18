package Lec_08;

public interface demo {
	int a=5;
	
	void fun3();
	
	default void fun4() {
		System.out.println("this is fun 4 of interface");
	}
	
	static int geta() {
		return a;
	}
	
}
