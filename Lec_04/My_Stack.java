package Lec_04;

public class My_Stack {

	private int [] arr;
	private int top;
	
	My_Stack(){
		arr=new int [5];		
	}
	My_Stack(int n){
		arr=new int [n];
	}
	
	public void push(int n) {
		arr[top]=n;
		top++;
	}
	
	public int pop() {
		top--;
		return arr[top];
	}
	
	public int peek() {
		return arr[top-1];
	}
	
	public boolean isEmpty() {
		return top==0;
	}
	
	public boolean isFull() {
		return top==arr.length;
	}
	
	public void display() {
		for(int i=0;i<top;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println(".");
	}
}

