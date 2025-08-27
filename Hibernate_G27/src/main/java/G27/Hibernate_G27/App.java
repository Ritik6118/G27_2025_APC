package G27.Hibernate_G27;

import java.util.ArrayList;
import java.util.Stack;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.engine.jdbc.env.spi.AnsiSqlKeywords;

import Entity.Address;
import Entity.Answer;
import Entity.Employee;
import Entity.Project;
import Entity.Question;
import Entity.Student;
import Entity.User;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	Configuration cf=new Configuration();  // creating configuration object
    	cf.configure("hiber.cfg.xml");         // loading hibernate config file
    	
    	SessionFactory sf=cf.buildSessionFactory(); // creating session factory from configuration
    	
//    	Session s=sf.openSession();           // opening a session from session factory
    	
//    	Student st=new Student(1,"Ritik",25);  // creating object for student 
//    	Student st=new Student(2,"ankit",25);  // creating object for student 
//    	Address ad =new Address("fno-101", "Faridabad", "Haryana");
//    	st.setAddress(ad);
    	
    	
//    	s.beginTransaction();        // transaction begin
    	
    	
    	
//    	s.save(st);  // depricated
//    	s.persist(st);    // create new entry in db
    	
//    	s.update(ad);   // depricated for update
//    	s.save(ad);   // depricated for update
//    	s.saveOrUpdate(ad); // depricated for update
//    	s.merge(st);  // for update
    	
//    	s.delete(st); // depricated
//    	s.remove(st);
    	
//    	Student student=s.get(Student.class, 2);  // get object from db
//    	System.out.println(student.getName() +" "+student.getAddress()+" "+student.getAddress().getCity());
    	
    	
//    	s.getTransaction().commit();
//    	
//    	s.close();
    	
    	
    	// one to one  uni and bi dir 
//    	Session s=sf.openSession();
//    	s.beginTransaction();
//    	Answer a2 =new Answer(2,"Ritik");
//    	Question q2=new Question(2,"What is your name",a2);
//    	a2.setQuestion(q2);
//    	s.persist(q2);
//    	s.persist(a2);
//      	s.getTransaction().commit();
//    	s.close();
    	
//    	one to many -> emp to project  and many to one -> proj to emp
//    	Session s=sf.openSession();
//    	s.beginTransaction();
//    	Employee e1=new Employee(1,"Ritik",new ArrayList<>());
//    	Employee e2=new Employee(2,"ankit",new ArrayList<>());
//    	
//    	Project p1 =new Project(1,"project 1",e1);
//    	Project p2 =new Project(2,"project 2",e1);
//    	Project p3 =new Project(3,"project 3",e2);
//    	Project p4 =new Project(4,"project 4",e2);
//    	Project p5 =new Project(5,"project 5",e1);
//    	
//    	e1.getProjects().add(p1);
//    	e1.getProjects().add(p2);
//    	e2.getProjects().add(p3);
//    	e2.getProjects().add(p4);
//    	e1.getProjects().add(p5);
//    	
//    	s.merge(e1);
//    	s.merge(e2);
//    	s.merge(p1);
//    	s.merge(p2);
//    	s.merge(p3);
//    	s.merge(p4);
//    	s.merge(p5);
//    	
//    	s.getTransaction().commit();
//    	s.close();
    	
    	
    	Session s=sf.openSession();
    	User u1=new User(1,"User 1",new ArrayList<>());
    	User u2=new User(2,"User 2",new ArrayList<>());
    	User u3=new User(3,"User 3",new ArrayList<>());
    	User u4=new User(4,"User 4",new ArrayList<>());
    	User u5=new User(5,"User 5",new ArrayList<>());
    	
//    	u1-> u2, u3
    	u1.getFriends().add(u2);
    	u1.getFriends().add(u3);
//    	u2->u1,u4
    	u2.getFriends().add(u1);
    	u2.getFriends().add(u4);
//    	u3->u1,u4
    	u3.getFriends().add(u1);
    	u3.getFriends().add(u4);
//    	u4->u2,u5,u3
    	u4.getFriends().add(u2);
    	u4.getFriends().add(u5);
    	u4.getFriends().add(u3);
//    	u5->u4
    	u5.getFriends().add(u4);
    	
    	s.beginTransaction();
    	s.persist(u1);
    	s.persist(u2);
    	s.persist(u3);
    	s.persist(u4);
    	s.persist(u5);
    	
    	s.getTransaction().commit();
    	s.close();
    	
        System.out.println( "Executed!" );
    }
}
