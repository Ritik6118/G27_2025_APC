package Lec_07;

import java.util.ArrayList;

public class Gen_Stack<T> {
	
	ArrayList<T>  li=new ArrayList<>();
	
	public void push(T input) {
		li.add(input);
	}
	
	public T pop() {
		T n= li.get(li.size()-1);
		li.remove(li.size()-1);
		return n;
	}
	
	public T peek() {
		T n= li.get(li.size()-1);
		return n;
		
	}
	
	public boolean isEmpty() {
		return li.size()==0;
	}
	
	public int size() {
		return li.size();
	}
	
	@Override
	public String toString() {
		String s="[ ";
		
		for( T n : li) {
			s+=n+" ";
		}
		s+="]";
		return s;
		
	}
}

