import java.util.Scanner;
import java.sql.*;

public class JDBCClassModified {
	public static Scanner scan;
public static PreparedStatement pst;

int Empid;
String name;
String Designation;
float salary;


public void insert() throws SQLException


{
        scan=new Scanner(System.in);
	    System.out.println("Enter the Emp_ID");
	    pst.setInt(1,scan.nextInt());
	    System.out.println("Enter the Emp_Name");
	    pst.setString(2,scan.next());
	    System.out.println("Enter the Designation");
	    pst.setString(3,scan.next());
	    System.out.println("Enter the salary");
	    pst.setFloat(4,scan.nextFloat());
		
}

	public static void main(String[] args) throws SQLException, ClassNotFoundException{
	Class.forName("com.mysql.cj.jdbc.Driver"); 
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "root");
	Statement st=con.createStatement();
	JDBCClassModified daoobj=new JDBCClassModified();
	//insert statement
	String query1="INSERT INTO empdetail (emp_id,emp_Name,Designation,Salary,DOJ)Values(?,?,?,?,curdate())";
	pst=con.prepareStatement(query1);
    daoobj.insert();
    int rows_affected_pst=pst.executeUpdate();
    System.out.println("Query ok, "+rows_affected_pst+" row affected");
    
    //update statement
    String query2="update empdetail set salary=? where emp_id=?";
	pst=con.prepareStatement(query2);
	System.out.println("Enter the salary");
	pst.setFloat(1,scan.nextFloat());
	System.out.println("Enter the Emp_ID of salary revised");
	pst.setInt(2,scan.nextInt());
    int rows_updated=pst.executeUpdate();
    System.out.println("Query ok, "+rows_updated+" rows_updated");
    
  //delete statement
    String query3="delete from empdetail where emp_id=?";
	pst=con.prepareStatement(query3);
	System.out.println("Enter the Emp_ID to delete the record");
	pst.setInt(1,scan.nextInt());
    int rows_deleted=pst.executeUpdate();
    System.out.println("Query ok, "+rows_deleted+" rows_deleted");

    st.close();
	con.close();
	   
	

	}
}
