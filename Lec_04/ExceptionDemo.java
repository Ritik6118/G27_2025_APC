package Lec_04;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		f1();
		System.out.println("hello from main after exception");
	}

	private static void f1() {
		// TODO Auto-generated method stub
		try {
			f2();			
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println("hello from f1 after exception");
	}

	private static void f2() {
		// TODO Auto-generated method stub
		f3();
		System.out.println("hello from f2 after exception");
	}

	private static void f3() {
		// TODO Auto-generated method stub
		System.out.println(3/0);
		System.out.println("hello from f3 after exception");
	}

}
