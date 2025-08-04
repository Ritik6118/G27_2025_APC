package Lec_21;



public class Sync_demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		my_Thread t1=new my_Thread();
		my_Thread t2=new my_Thread();
		
		t1.start();
		t2.start();
//		Thread.sleep(1000);
		t1.join();
		t2.join();
		System.out.println(t1.getcount());
		System.out.println(t1.getcount2());
		
	}

}
class my_Thread extends Thread{
	private static int count;
	private static int coun2;
	
	static void counter() {
		
		count++;			
		synchronized (my_Thread.class) {
			coun2++;
		}
	}
//	static synchronized void counter() {
//		
//		count++;			
//		coun2++;			
//
//	}
	
	public void run() {
		for(int i=0;i<1000;i++) {
			counter();
//			System.out.println("run method is running");
		}
	}
	
	public static int getcount() {
//		System.out.println("get count is running");
		return count;
	}
	public int getcount2() {
		return coun2;
	}
}
