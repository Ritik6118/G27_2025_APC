package Lec_28;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.Arrays;

public class Jdbc_demo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String db="G27_db";
		
		String url="jdbc:mysql://127.0.0.1:3306/"+db;
		
		String user="root";
		String pass="root";
		
		Connection c= DriverManager.getConnection(url,user,pass);
		// connected sucessfully
		System.out.println("Connection created");
		
		Statement st=c.createStatement();
		
		PreparedStatement insert_student_to_table= c.prepareStatement("insert into students (rollnumber,name,age) values(?,?,?)");
		
		// statement created sucessfully
		
//		String Create_db="create database G27_db";   // query to create new database
//		String Create_table="Create table Students(rollnumber int(10) , name varchar(30) , age int(3))";    // query to create table
//		
//		String add_student="insert into students(rollnumber , name , age) values(1,\"ritik\", 25)";   // query to add into table
		
//		String update_Student="update students set name=\"pratiyush\" where rollnumber=1";   // query to update something in table
		
//		String delete_Student="delete from students where rollnumber=6";   // query to delete student by rollnumber
		
//		String delete_table="drop table students";
		
//		String delete_db="drop database "+db;
		
		
//		String get_table="Select * from students";
		
		// query created
		
//		st.executeUpdate(Create_db);
//		st.executeUpdate(Create_table);
//		st.executeUpdate(add_student);
//		st.executeUpdate(add_student_to_table(2, "aman", 25));
//		st.executeUpdate(add_student_to_table(3, "rohit", 22));
//		st.executeUpdate(add_student_to_table(4, "tarun", 23));
//		st.executeUpdate(add_student_to_table(5, "gaurav", 24));
//		st.executeUpdate(add_student_to_table(6, "saurav", 21));
//		st.executeUpdate(update_Student);
//		st.executeUpdate(update_name_by_roll(2, "ravi"));
//		st.executeUpdate(delete_Student);
//		st.executeUpdate(delete_Student_by_roll(5));
//		st.executeUpdate(delete_table);
//		ResultSet rs = st.executeQuery(get_table);
//		ResultSetMetaData rsmd=rs.getMetaData();
//		int col=rsmd.getColumnCount();
//		
//		for(int i=1;i<=col;i++) {
//			System.out.print(rsmd.getColumnName(i)+" | ");
//		}
//		System.out.println();
//		int row=0;
//		while(rs.next()) {
//			for(int i=1;i<=col;i++) {
//				String s=rs.getString(i);
//				System.out.print(s+"        ");
//			}
//			System.out.println();
//			row++;
//		}
//		System.out.println("total rows in result set = " +row);
		
//		insert_student_to_table.setInt(1, 7);
//		insert_student_to_table.setString(2, "abcd");
//		insert_student_to_table.setInt(3, 22);
		
//		insert_student_to_table.setInt(1, 8);
//		insert_student_to_table.setString(2, "efg");
//		insert_student_to_table.setInt(3, 22);
//		insert_student_to_table.addBatch();
//		
//		
//		insert_student_to_table.setInt(1, 9);
//		insert_student_to_table.setString(2, "hij");
//		insert_student_to_table.setInt(3, 22);
//		insert_student_to_table.addBatch();
//		
//		insert_student_to_table.setInt(1, 10);
//		insert_student_to_table.setString(2, "klm");
//		insert_student_to_table.setInt(3, 22);
//		insert_student_to_table.addBatch();
//		
//		insert_student_to_table.setInt(1, 11);
//		insert_student_to_table.setString(2, "nop");
//		insert_student_to_table.setInt(3, 22);
//		insert_student_to_table.addBatch();
//		
//		int [] arr=insert_student_to_table.executeBatch();
//		System.out.println(Arrays.toString(arr));
//		
//		st.execute("create procedure getName (in rn int(10), out n varchar(30))\r\n"
//				+ "begin\r\n"
//				+ "select name into n from students where rollnumber = rn;\r\n"
//				+ "end ");
		
		
		CallableStatement cs=c.prepareCall("{call getName(?,?) }");
		cs.setInt(1, 1);
		
		
		cs.registerOutParameter(2, Types.VARCHAR);
		
		cs.execute();
		
		System.out.println(cs.getString(2));
		
		// execute query
		
		c.close();
		// connection closed
		System.out.println("program executed sucessfully and connection is closed now");
		
		
	}
	public static String add_student_to_table(int rollnumber ,String name,int age) {
		String add_student="insert into students(rollnumber , name , age) values("+rollnumber+",\""+name+"\", "+age+")";
		return add_student;
	}
	
	public static String update_name_by_roll(int rn,String name) {
		String update_Student="update students set name=\""+name+"\" where rollnumber="+rn;
		return update_Student;
	}
	
	public static String delete_Student_by_roll(int rn) {
		String delete_Student="delete from students where rollnumber="+rn;
		return delete_Student;
	}
}
