package Lec_20;

public class Thread_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		my_thread t1=new my_thread();
//		t1.run();
//		t1.start();
		
//		Thread t1 =new Thread(new my_thread());
		
//		Runnable r=new Runnable() {
//			
//			@Override
//			public void run() {
//				// TODO Auto-generated method stub
//				for(int i=0;i<100;i++) {
//					System.out.println("implemented in runnable");
//				}
//			}
//		};
		
//		Thread t1=new Thread(r);
		
//		Thread t1=new Thread(new Runnable() {
//			
//			@Override
//			public void run() {
//				// TODO Auto-generated method stub
//				for(int i=0;i<100;i++) {
//					System.out.println("implemented in runnable");
//				}
//			}
//		});
		
		
		Thread t1=new Thread(()->{
			for(int i=0;i<100;i++) {
				System.out.println("implemented in runnble via lambda exp");
			}
		});
		
		t1.start();
//		t1.start();
		
		for(int i=0;i<200;i++) {
			System.out.println("hello from main thread");
		}
	}
	

}

class my_thread implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<100;i++) {
			System.out.println("implemented via runnable interface");
		}
	}
	
}

//class my_thread extends Thread{
//	@Override 
//	public void run() {
//		for (int i = 0; i < 200; i++) {
//			System.out.println("hello from my_thread");
//		}
//	}
//}
