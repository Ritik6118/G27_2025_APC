package Lec_01;

import java.util.Arrays;

public class Demo {

	static int x=1;
	static int y=2;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(x+" "+y);
//		swap(x,y);
//		sawp();
		int [] arr= {1,2,3};
		int [] arr2= {3,4,5};
		
		
		
		System.out.println(Arrays.toString(arr));		
		//swap
		swap(arr[0],arr[1]);
		swap(arr,0,1);
		System.out.println(Arrays.toString(arr));
		
	}
	private static void swap(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		
	}
	private static void swap(int i, int j) {
		// TODO Auto-generated method stub
		int t=i;
		i=j;
		j=t;
	}

//	private static void sawp() {
//		// TODO Auto-generated method stub
//		int t=x;
//		x=y;
//		y=t;
//				
//	}
//
//	private static void swap(int x, int y) {
//		int t=x;
//		x=y;
//		y=t;
//		System.out.println(x+" "+y);
//		
//	}

}
