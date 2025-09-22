package G27.Spring_Aop_G27;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext ac= new ClassPathXmlApplicationContext("Spring_Config.xml");
//        System.out.println( "Hello World!" );
        Service s=(Service) ac.getBean("service");
        s.m1();
        
    }
}
