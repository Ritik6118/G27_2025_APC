package Lec_30;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac=new ClassPathXmlApplicationContext("Spring-Config.xml");
		
		Student s=(Student) ac.getBean("student");
		
		System.out.println(s.getCourses());
		System.out.println(s.getTrainer_Course_Mapping());
	
		System.out.println(s.getName());
		System.out.println(s.getLaptop());
		System.out.println(System.identityHashCode(s.getLaptop()));
		Laptop l=(Laptop) ac.getBean("laptop");   // address is same scope is singleton
		Laptop l2=(Laptop) ac.getBean("laptop");
		System.out.println(System.identityHashCode(l));
		System.out.println(System.identityHashCode(l2));
		System.out.println(s.getAddress());
		
	}

}
