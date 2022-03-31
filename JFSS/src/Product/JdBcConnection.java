package Product;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JdBcConnection extends Invoice {

		public static Connection getDBConnection() throws SQLException, ClassNotFoundException {
			Class.forName("com.mysql.cj.jdbc.Driver"); 
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/myproject", "root", "root");
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
			System.out.println("Enter the product details: ");  
			System.out.println("Enter the Item_Code");
			String item_code=scan.next();
			pst.setString(1,item_code);
			System.out.println("Enter the Item_Name");
			String item_name=scan.next();
			pst.setString(2,item_name);
			scan.nextLine();
			System.out.println("Enter the Item_Rate): ");  
			int item_rate = scan.nextInt();
			pst.setInt(3,item_rate);
		    System.out.println("Enter the Quantity: ");  
		    int quantity = scan.nextInt();
			pst.setInt(4,quantity);
			int totalprice=(item_rate * quantity);
		    pst.setInt(5,totalprice);
		    int discount=totalprice*2/100;
		    pst.setInt(6,discount);
            int subtotal=totalprice-discount;
            pst.setInt(7,subtotal);
            int cgst=subtotal*18/100; 
            pst.setInt(8,cgst);
            int sgst=subtotal*18/100; 
            pst.setInt(9,sgst);
            int invoice_total=(subtotal+cgst+sgst);
            pst.setInt(10,invoice_total);

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
			int item_rate = scan.nextInt();
			pst.setInt(1,item_rate);
			System.out.println("Enter the Quantity: ");  
		    int quantity = scan.nextInt();
			pst.setInt(2,quantity);
			int totalprice=(item_rate * quantity);
		    pst.setInt(3,totalprice);
		    System.out.println("Enter the Item_Code of price revised");
			String item_code=scan.next();
			pst.setString(4,item_code);
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

