package Lec_06;

public class Generics_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer [] arr1= {1,2,3,4,5};
		
		String [] arr2= {"abc","def","ghi","jkl"};
		
		Boolean [] arr3= {true,false,true,false};
		
		display(arr1);
		display(arr2);
		display(arr3);
	}

	private static <T>void display(T [] arr) {
		// TODO Auto-generated method stub
		for( T i:arr) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	

}
