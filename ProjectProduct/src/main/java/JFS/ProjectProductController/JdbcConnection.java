package JFS.ProjectProductController;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import org.springframework.stereotype.Component;

@Component
public class JdbcConnection  {
	public static Connection getDBConnection() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver"); 
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/product", "root", "root");
		return connection;
	}
	
	public static ResultSet getResultSet(String query) throws SQLException, ClassNotFoundException
	{
		Connection connection=getDBConnection();
		Statement statement=connection.createStatement();
		ResultSet resultset=statement.executeQuery(query);
		return resultset;
		
		
	}
	public static int saveRecord(String query) throws SQLException, ClassNotFoundException
	{
		Connection connection=getDBConnection();
		PreparedStatement pst=connection.prepareStatement(query);
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Item_Code");
		pst.setString(1,scan.next());
		System.out.println("Enter the Item_Name");
		pst.setString(2,scan.next());
		System.out.println("Enter the Item_Rate");
		pst.setInt(3,scan.nextInt());
		System.out.println("Enter the Quantity");
		pst.setInt(4,scan.nextInt());
		 int rows_inserted=pst.executeUpdate();
		 System.out.println(+rows_inserted+" Records Added Successfully");
		return rows_inserted;
	}
	public static int modifyRecord(String query) throws SQLException, ClassNotFoundException
	{
		Connection connection=getDBConnection();
		PreparedStatement pst=connection.prepareStatement(query);
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Item_Rate");
		pst.setInt(1,scan.nextInt());
		System.out.println("Enter the Item_Code of price revised");
		pst.setString(2,scan.next());
		 int rows_updated=pst.executeUpdate();
		 System.out.println(+rows_updated+" Records Updated Successfully");
		return rows_updated;
	}
	public static int deleteRecord(String query) throws SQLException, ClassNotFoundException
	{
		Connection connection=getDBConnection();
		PreparedStatement pst=connection.prepareStatement(query);
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Item_Code to delete the record");
		pst.setString(1,scan.next());;
		 int rows_deleted=pst.executeUpdate();
		 System.out.println(+rows_deleted+" Records deleted Successfully");
		return rows_deleted;
	}

}

