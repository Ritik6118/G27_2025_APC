package Lec_19;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Lambda_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Interf_Impl obj =new Interf_Impl();
//		obj.fun(10);
		
//		F_Inter obj= new Interf_Impl();
//		obj.fun(10);
		
//		F_Inter obj=new F_Inter() {
//			
//			@Override
//			public void fun(int a) {
//				// TODO Auto-generated method stub
//				System.out.println("number is "+a);
//			}
//		};
//		
//		obj.fun(10);
		
//		F_Inter obj=(a)->System.out.println(a);
//		obj.fun(10);
		
		
//		F_Inter sum =(a,b)-> System.out.println(a+b);
//		
//		F_Inter mult =(a,b)-> System.out.println(a*b);
//		
//		F_Inter subt =(a,b)-> System.out.println(a-b);
//		
//		F_Inter div =(a,b)-> System.out.println(a/b);
//	
//		sum.calculate(2, 3);
//		mult.calculate(2, 3);
//		subt.calculate(2, 3);
//		div.calculate(6, 3);
//		
//		
//		F_Inter count =(a,b)->{
//			for(int i=a;i<=b;i++) {
//				System.out.println(i);
//			}
//		};
//		count.calculate(10, 20);
	
//		Predicate<Integer> chek_prime=(a)->a%2==0;
//		System.out.println(chek_prime.test(5));
//		System.out.println(chek_prime.test(4));
//		
//		Predicate<String> chek_length=(a)->a.length()==5;
//		
//		System.out.println(chek_length.test("abcd"));
//		System.out.println(chek_length.test("abcde"));
		
																	//<Data type of parameter / Data Type of Return type>
//		Function<String, Integer>  count_Vouvals=(s)->{
//			int c=0;
//			for(int i=0;i<s.length();i++) {
//				if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='o'||s.charAt(i)=='i'||s.charAt(i)=='u') {
//					c++;
//				}
//			}
//			return c;
//		};
//		
//		System.out.println(count_Vouvals.apply("aeiou"));
//		System.out.println(count_Vouvals.apply("xcbnmz"));
		
//		BiFunction<T, U, R>      <type of 1st param , type of 2nd param , type of return type>
	
//		Consumer<T>   // when void return type is required with only one param  we use consumer
		
//		BiConsumer<T, U> //when void return type is required with two params  we use Biconsumer
	
//		Supplier<T>      // when we dont need any param but we have to return some value we can use supplier's get method by lambda expression
	
	
		Comparator<Student> age=(a,b)->a.age-b.age;
		Comparator<Student> roll=(a,b)->a.roll-b.roll;
		Comparator<Student> name=(a,b)->a.name.compareTo(b.name);
		
//		PriorityQueue<Student> pq=new PriorityQueue<>(name);
		PriorityQueue<Student> pq=new PriorityQueue<>((Student a,Student b)->a.age-b.age);
		
		Student s1=new Student("aman", 25, 1);
		Student s2=new Student("tarun", 21, 10);
		Student s3=new Student("rohit", 22, 11);
		Student s4=new Student("shubham", 24, 21);
		Student s5=new Student("mohit", 23, 2);
		
		
		pq.add(s1);
		pq.add(s2);
		pq.add(s3);
		pq.add(s4);
		pq.add(s5);
		
		while(!pq.isEmpty()) {
			System.out.println(pq.poll());
		}
		System.err.print("hello");
		
		
		
		
		
	}

}


class Student{
	String name;
	int age;
	int roll;
	
	Student(String n,int a,int r){
		this.name=n;
		this.age=a;
		this.roll=r;
	}
	Student(){
		
	}
	
	@Override
	public String toString() {
		return name;
	}
}
//class Interf_Impl implements F_Inter{
//
//	@Override
//	public void fun(int a) {
//		// TODO Auto-generated method stub
//		System.out.println(a);
//	}
//	
//}
