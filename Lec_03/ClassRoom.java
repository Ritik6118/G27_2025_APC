package Lec_03;

public class ClassRoom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ArrayList<Integer> li=new ArrayList<>();
		System.out.println(10/0);
		System.out.println("this is start point of debugger");
//		Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
//			ArrayList cannot be resolved to a type
//			ArrayList cannot be resolved to a type
		
		Student s1=new Student();
		s1.name="ankit";
		
		s1.dept="cse";
		s1.knowledge=20;
		
		Student s2=new Student();
		s2.name="gaurav";
		
		s2.dept="cse";
		s2.knowledge=30;
		
//		s1.introduce();
//		s2.introduce();
		
		System.out.println(s1.knowledge);
		s1.study();
		System.out.println(s1.knowledge);
		
		
		s1.teach(s2);
		System.out.println(s1.knowledge);
		
		s1.appear_in_Exam();
		
		System.out.println(s1.getRollnumber());
		System.out.println(s2.getRollnumber());
	}
	static {
		System.out.println("hello this is static block");
	}

}
