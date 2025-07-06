package Lec_05;

public class My_Stack {

	protected int [] arr;
	protected int top;
	
	My_Stack(){
		arr=new int [5];		
	}
	My_Stack(int n){
		arr=new int [n];
	}
	
	public void push(int n)  {
		try {
			if(this.isFull()) {
				throw new Exception("Stack is Full");
			}			
			arr[top]=n;
			top++;
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public int pop() {
		try {
			if(this.isEmpty()) {
				throw new Exception("Stack is Empty");
			}
			top--;
			return arr[top];			
		}
		catch(Exception e) {
			System.out.println(e);
			return 0;
		}
	}
	
	public int peek() {
		try {
			if(this.isEmpty()) {
				throw new Exception("Stack is Empty");
			}
			return arr[top-1];			
		}
		catch(Exception e) {
			System.out.println(e);
			return 0;
		}
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

