package Lec_29;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac=new ClassPathXmlApplicationContext("Spring-Config.xml");
		
		Student s=(Student) ac.getBean("student");
		System.out.println(s.getName());
		
	}

}
