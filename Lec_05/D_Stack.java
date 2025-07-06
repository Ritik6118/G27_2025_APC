package Lec_05;

public class D_Stack extends My_Stack {

	
	@Override
	public void push(int n) {
		super.arr[top]=n;
		super.top++;
		if(top==arr.length) {
			int [] arr=new int [super.arr.length*2];
			for(int i=0;i<super.top;i++) {
				arr[i]=super.arr[i];
			}
			super.arr=arr;
		}
	}
}
