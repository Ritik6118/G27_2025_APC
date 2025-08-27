package Dao;
import java.sql.ResultSet;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import Entity.Student;

public class Student_Dao_JDBC implements Student_Dao{

	
	private JdbcTemplate jt;

	public JdbcTemplate getJt() {
		return jt;
	}

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	@Override
	public void insert_Student(Student s) {
		// TODO Auto-generated method stub
		String query="insert into students (rollnumber,name,age) values(?,?,?)";
		jt.update(query,s.getRollnumber(),s.getName(),s.getAge());
	}

	

	@Override
	public void delete_Student(Student s) {
		// TODO Auto-generated method stub
		String query="delete from students where rollnumber=?";
		jt.update(query,s.getRollnumber());
	}

	@Override
	public Student get_Student(int rollnumber) {
		// TODO Auto-generated method stub
		String query="select * from students where rollnumber="+rollnumber;
		// implemented using lambda expression
		RowMapper<Student> rm=(ResultSet rs, int a)->new Student(rs.getInt(1),rs.getString(2),rs.getInt(3));
		Student s=jt.queryForObject(query, rm);
		return s;
	}

	@Override
	public void update_Student(Student s) {
		// TODO Auto-generated method stub 
		String query="update students set name=? where rollnumber=?";
		jt.update(query,s.getName(),s.getRollnumber());
	}

	@Override
	public List<Student> get_all() {
		// TODO Auto-generated method stub
		String query="select * from students";
//		List<Student> li=jt.query(query, new Student_row_mapper());
		List<Student> li=jt.query(query, (ResultSet rs, int a)->new Student(rs.getInt(1),rs.getString(2),rs.getInt(3)));
		return li;
	}

}
