package Lec_20;

import java.util.Scanner;

public class io_demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		my_thread downloader =new my_thread();
		downloader.start();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("input was-> "+n);
		for(int i=0;i<1000;i++) {
			System.out.println("playing_music");
			Thread.sleep(10);
		}
	}

}
//class my_thread extends Thread{
//	@Override 
//	public void run() {
//		System.out.println("Started Downloading");
//		for (int i = 0; i < 101; i++) {
//			System.out.println("Downloading "+i+"%");
//			try {
//				Thread.sleep(50);   // time in miliseconds5
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//		System.out.println("Downloading Completed");
//	}
//}
