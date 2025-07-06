package Lec_01;

import java.util.Arrays;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr1= {1,2,3};
		int [] arr2= {4,5,6};
		swap(arr1,arr2);
		System.out.println(Arrays.toString(arr1)+" "+Arrays.toString(arr2));
	}

	private static void swap(int[] arr1, int[] arr2) {
		// TODO Auto-generated method stub
		arr1[0]=arr2[2];
		arr2[2]=arr1[0];
	}

}
