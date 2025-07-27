package Lec_20;

public class Sync_demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		my_t t1=new my_t();
		my_t t2=new my_t();
		t1.start();
		t2.start();
//		Thread.sleep(1000);
		t1.join();
		t2.join();
		System.out.println(my_t.c);
	}

}

class my_t extends Thread{
	static int c=0;
	
	public static void count() {
		c++;
	}
	
	public void run() {
		for(int i=0;i<1000;i++) {
			count();
		}
	}
}
