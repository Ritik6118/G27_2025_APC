package G27.Spring_ORM_G27;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import Dao.Student_dao;
import Entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ac= new ClassPathXmlApplicationContext("Spring_Config.xml");
    	
        Student_dao sd=(Student_dao) ac.getBean("studentdao");
        Student s= new Student(1,"Ritik",25);
        sd.insert(s);
        
    }
}
