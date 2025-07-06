package Lec_05;

public class Throw_and_Throws {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			m1();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	private static void m1() throws Exception {
		// TODO Auto-generated method stub
		m2();
	}

	private static void m2() throws Exception {
		// TODO Auto-generated method stub
		throw new Exception("my Exception");
//		try {
//		}
//		catch(Exception e) {
//			System.out.println(e);
//		}
	}

}
