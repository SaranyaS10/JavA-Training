import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCSimpleConnection {
	public static void main(String[] args) throws SQLException, ClassNotFoundException{
	Class.forName("com.mysql.cj.jdbc.Driver"); 
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/myproject", "root", "root");
	Statement st=con.createStatement();
	//Statement st1=con.createStatement();
	String query1="INSERT INTO empdetail (emp_id,emp_Name,Designation,Salary)Values(?,?,?,?)";
	PreparedStatement pst=con.prepareStatement(query1);
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the Emp_ID");
    int id=scan.nextInt();
    System.out.println("Enter the Emp Name");
    String name=scan.next();
    System.out.println("Enter the Designation");
    String desgination=scan.next();
    System.out.println("Enter the Salary");
    float salary=scan.nextFloat();
    
    System.out.println("Given value are"+id+name+desgination+salary);
    pst.setInt(1,id);
    pst.setString(2,name);
    pst.setString(3,desgination);
    pst.setFloat(4,salary);
    
    int rows_affected_pst=pst.executeUpdate();
    System.out.println("Query ok, "+rows_affected_pst+" row affected");
    
    int rows_affected=st.executeUpdate("INSERT INTO empdetail (emp_id,emp_Name,Designation,Salary) Values(107, 'Anand','Dev',25000);");
    System.out.println("Query ok, "+rows_affected+" row affected");
    
	
	ResultSet rs=st.executeQuery("Select * from empdetail;");
  //  ResultSet rs1=st1.executeQuery("Select * from employeesalary");
   // System.out.println("Employee Details Data:");
   	while(rs.next()) 
	{
   		System.out.println(rs.getInt("emp_id")+" "+rs.getString("emp_name")+" "+rs.getString("Designation")+" "+rs.getFloat("Salary"));
   	  	
   		//System.out.println(rs.getInt("Emp_ID")+" "+rs.getString("Emp_Name")+" "+rs.getString("Dept")+" "+rs.getString("Email_ID")+" "+rs.getString("Phone_No")+rs.getString("Location")+" "+rs.getFloat("Salary")+" "+rs.getFloat("HRA")+" "+rs.getFloat("DA")+" "+rs.getFloat("IT")+" "+rs.getFloat("GP"));
  		
        }
   	//System.out.println("Employee Salary Data:");
   //	while(rs1.next()) 
  // 	{
  // 	System.out.println(rs1.getInt("Emp_ID")+" "+rs1.getString("Emp_Name")+" "+rs1.getString("Dept")+" "+rs1.getString("Location")+" "+rs1.getFloat("Salary")+" "+rs1.getFloat("HRA")+" "+rs1.getFloat("DA")+" "+rs1.getFloat("IT")+" "+rs1.getFloat("GP"));
  // 	}
	st.close();
//	st1.close();
	con.close();
	scan.close();
	}

}


