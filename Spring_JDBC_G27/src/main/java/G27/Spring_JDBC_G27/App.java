package G27.Spring_JDBC_G27;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import Dao.Student_Dao;
import Entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext ac=new ClassPathXmlApplicationContext("App_Config.xml");
//    	String url="jdbc:mysql://127.0.0.1:3306/G27_db";
//    	String user="root";
//    	String pass="root";
//        DriverManagerDataSource dmds= new DriverManagerDataSource(url,user,pass);
        
//        JdbcTemplate jt=new JdbcTemplate(dmds);
//        JdbcTemplate jt=(JdbcTemplate) ac.getBean("template");
    
        
//        String query="insert into students (rollnumber,name,age) values(?,?,?)";
//        jt.update(query,13,"new Student 2",23);
        
    	
//    	Student s=new Student(13,"Updated",23);
    	
    	Student_Dao sd=(Student_Dao) ac.getBean("student_dao");
//        sd.update_Student(s);
//        sd.delete_Student(s);
    	
//    	Student s=sd.get_Student(1);
//    	System.out.println(s.getRollnumber()+" "+s.getName()+" "+s.getAge());
    
    	List<Student> li=sd.get_all();
    	for(Student s:li) {
    		System.out.println(s.getRollnumber()+" "+s.getName()+" "+s.getAge());
    	}
    	System.out.println("executed!");
    }
}
