package Lec_21;

public class Volatile_demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		thread t1=new thread();
		
		t1.start();
		Thread.sleep(1000);
		t1.m1();
		System.out.println(t1.flag);
	}

}
class thread extends Thread{
	
//	volatile boolean flag=true;
	boolean flag=true;
	
	public void run() {
		
		System.out.println("hello");
		while(flag) {
			System.out.println("fdefa");  // flushes the cache of thread and then thread takes the new updated value from memory
			
//			int n=0+5;
		}
		System.out.println("hi");
	}
	
	public void m1() {
		flag=false;
		
		System.out.println("flag==>false");
	}
	
}
