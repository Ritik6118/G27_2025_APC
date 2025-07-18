package Lec_07;

public class Stack_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Gen_Stack<Integer> st=new Gen_Stack<>();
//		st.push(0);
//		st.push(1);
//		st.push(2);
//		st.push(3);
//		st.push(4);
//		System.out.println(st);
//		
//		while(!st.isEmpty()) {
//			System.out.println(st.pop());
//		}
		Gen_Stack<String> st=new Gen_Stack<>();
		st.push("abc");
		st.push("def");
		st.push("ghi");
		st.push("jkl");
		st.push("mno");
		System.out.println(st);
		
		while(!st.isEmpty()) {
			System.out.println(st.pop());	
		}
		
	}

}
