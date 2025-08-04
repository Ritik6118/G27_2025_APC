package Lec_22;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Higher_Order_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		inter i =new inter() {
//			
//			@Override
//			public void fun() {
//				// TODO Auto-generated method stub
//				System.out.println("fun is implemented by annonymus class");
//			}
//		};

		
//		inter i=()->System.out.println("fun is implemented by lambda expression");
//		
//		i.fun();
//		String s="abcd";
//		int a=12;
//		
//		sampleFun(a,s);
//		sampleFun(12,"abcd");
		
//		HigherOrderFun("abcd",15,()->System.out.println("Implemented in higher order fun first"));
//		HigherOrderFun("abcd",15,()->System.out.println("Implemented in higher order fun secod"));
//		HigherOrderFun("abcd",15,()->System.out.println("Implemented in higher order fun third"));
//		HigherOrderFun("abcd",15,()->System.out.println("Implemented in higher order fun fourth"));
//	
//		inter i= funReturningfun();
//		i.fun();
		
//		ArrayList<Integer> li=new ArrayList<>();
//		li.add(1);
//		li.add(12);
//		li.add(10);
//		li.add(14);
//		li.add(155);
//		li.add(100);
//		li.add(125);
//		li.add(123);
//		li.add(121);
//		li.add(431);
//		
//		
//		System.out.println(li);
//		
////		li=filter(li,(n)->n%2!=0);
////		li=filter(li,(n)->n%2==0);
//		
//		li=filter(li,(n)->n%10==0);
//		
//		System.out.println(li);
		
		
		ArrayList<product> li=new ArrayList<>();
		
		li.add(new product("Iphone 15",10,"SmartPhone"));
		li.add(new product("Iphone 14",20,"SmartPhone"));
		li.add(new product("Iphone 11",2,"SmartPhone"));
		li.add(new product("Iphone x",0,"SmartPhone"));
		li.add(new product("Iphone xr",0,"SmartPhone"));
		li.add(new product("Iphone se",0,"SmartPhone"));
		li.add(new product("macbook m1",1,"laptop"));
		li.add(new product("macbook m2",10,"laptop"));
		li.add(new product("macbook m3",0,"laptop"));
		
		System.out.println(li);
		
		map(li,(product p)->p.quantity+=10);
		
//		li=filter(li,(product p)->p.category.equals("laptop"));
//		li=filter(li,(product p)->p.category.equals("SmartPhone"));
		li=filter(li,(product p)->p.quantity==0);

		System.out.println(li);
		
		
	}
//	private static ArrayList<Integer> filter(ArrayList<Integer> li,Predicate<Integer> p) {
//		// TODO Auto-generated method stub
//		ArrayList<Integer> filtered =new ArrayList<>();
//		for(int i:li) {
//			if(p.test(i)) {
//				filtered.add(i);
//			}
//		}
//		return filtered;
//	}
	private static<T> ArrayList<T> filter(ArrayList<T> li,Predicate<T> p) {
		// TODO Auto-generated method stub
		ArrayList<T> filtered =new ArrayList<>();
		for(T i:li) {
			if(p.test(i)) {
				filtered.add(i);
			}
		}
		return filtered;
	}
	private static<T> void map(ArrayList<T> li,Consumer<T> c) {
		// TODO Auto-generated method stub
		ArrayList<T> filtered =new ArrayList<>();
		for(T i:li) {
			c.accept(i);
		}
		
	}
	private static inter funReturningfun() {
		// TODO Auto-generated method stub
		return ()->System.out.println("returning from a higher order function");
	}
	private static void HigherOrderFun(String s,int a,inter i) {
		// TODO Auto-generated method stub
		System.out.println(s+" "+a);
		i.fun();
	}
	public static void sampleFun(int a,String s) {
		System.out.println(s+" "+a);
	}

}


@FunctionalInterface
interface inter {
	public void fun();
	
//	public void fun2();
}


class product{
	String name;
	int quantity;
	String category;
	
	product(String n, int q,String c){
		name=n;
		quantity=q;
		category=c;
	}
	product(){
		
	}
	
	public String toString() {
		return name;
	}
	
}
