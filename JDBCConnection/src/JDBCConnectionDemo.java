import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

public class JDBCConnectionDemo {

	public static void main(String[] args) throws SQLException, ClassNotFoundException	{
		String url="jdbc:mysql://localhost:3306/saranya";
	    String username="root";
	    String password="root";
	   // String query="select * from empdetail";
	    String query="select * from Students where Subjects='Maths' Order By Stud_Name Asc";
		//DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver()); Register Driver method
	    Class.forName("new com.mysql.cj.jdbc.Driver"); //Register Driver another method

	Connection con=DriverManager.getConnection(url, username, password);
	Statement st=con.createStatement();
	ResultSet rs=st.executeQuery(query);
    String name;
	int id;
//	String Designation;
//	float Salary;
//	Date date;
	String FatherName;
	String Subjects;
	float Marks;
	int age;
	boolean pass_fail;
	

	while(rs.next()) //set of value
	{
//		name=rs.getString("emp_name");
//		id =rs.getInt("emp_id");
//		Designation=rs.getString("Designation");
//		Salary=rs.getFloat("Salary");
//		date=rs.getDate("DOJ");
//	    System.out.print("emp_id emp_name Designation   Salary   DOJ\n");
//		System.out.println(id+" "+name+" "+Designation+" "+Salary+" "+date);
//		
//	  System.out.println(rs.getInt("emp_id")+" "+rs.getString("emp_name"));
//	  System.out.println(rs.getString(2)); //single element
	name=rs.getString("Stud_Name");
	id =rs.getInt("Stud_id");
	FatherName=rs.getString("Father_Name");
	Subjects=rs.getString("Subjects");
	Marks=rs.getFloat("Marks");
	age =rs.getInt("Age");
	pass_fail=rs.getBoolean("Pass_Fail");
	System.out.println(id+" "+name+" "+FatherName+" "+Subjects+" "+Marks+" "+age+" "+pass_fail);
	}
	st.close();
	con.close();
	}
}
