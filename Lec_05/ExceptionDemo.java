package Lec_05;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * f1(); System.out.println("hello from main after exception");
		 */
		fun();
	}

	private static void fun() {
		// TODO Auto-generated method stub
		int [] arr= {1,2,3};
		String s=null;
		try {
			System.out.println(5/0);
			System.out.println(s.toUpperCase());
			System.out.println(arr[-1]);
		}
		catch(Exception e) {
			System.out.println(e);
		}
//		catch( NullPointerException e ) {
//			System.out.println(e);
//		}
//		catch( ArithmeticException e) {
//			System.out.println(e);
//		}
//		catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println(e);			
//		}
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
		System.out.println(3/0); // throws an exception
		System.out.println("hello from f3 after exception");
	}

}
