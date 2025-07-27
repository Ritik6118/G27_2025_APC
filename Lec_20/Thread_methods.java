package Lec_20;

public class Thread_methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName());
		
		
		Thread t1=new Thread(()->{
			for(int i=0;i<100;i++) {
				System.out.println("hello from t1");				
			}
		});
		
		Thread t2=new Thread(()->{
			for(int i=0;i<100;i++) {
				System.out.println("hello from t2");				
			}
		});
		t1.setPriority(1);
		t2.setPriority(10);
		t2.start();
		t1.start();
		
		
//		t1.setName("Thread-a");
//		
//		System.out.println(t1.getName());
		

		
	}

}
