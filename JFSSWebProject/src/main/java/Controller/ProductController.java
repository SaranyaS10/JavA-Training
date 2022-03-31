package Controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Model.Product;

public class ProductController {

   public List<Product> findAllProduct()throws SQLException,ClassNotFoundException
   {
	   List<Product> productList=new ArrayList<Product>();
	   String query=("Select * from productdetails;");
	   ResultSet resultset;
	   
	   try {
		   resultset=JdbcConnection.getResultSet(query);
		   while(resultset.next()) 
			{
		   		//System.out.println(resultset.getString("Item_Code")+" "+resultset.getString("Item_Name")+" "+resultset.getInt("Item_Rate")+" "+resultset.getInt("quantity"));
                String Item_Code=resultset.getString("Item_Code");
                String Item_Name=resultset.getString("Item_Name");
                int Item_Rate=resultset.getInt("Item_Rate");
                int quantity=resultset.getInt("quantity");
                productList.add(new Product(Item_Code,Item_Name,Item_Rate,quantity));
		    }
	   }catch (ClassNotFoundException | SQLException e )
	   {
		    e.printStackTrace();
	   }
	   return productList;
   }
   
   public void save()
   {
	   String query="insert into productdetails(Item_Code,Item_Name,Item_Rate,quantity)values(?,?,?,?)"; 
	   int rows_inserted=0;
	   try {
		   rows_inserted=JdbcConnection.saveRecord(query);
	   }
	   catch (ClassNotFoundException | SQLException e )
	   {
		    e.printStackTrace();
	   }
	   
	  System.out.println("Query ok, "+rows_inserted+" rows_updated");
   }
   public void modify()
   {
	   String query=("update productdetails set Item_Rate=? where Item_Code=?"); 
	   int rows_updated=0;
	   try {
		   rows_updated=JdbcConnection.modifyRecord(query);
	   }
	   catch (ClassNotFoundException | SQLException e )
	   {
		    e.printStackTrace();
	   }
	   
		 System.out.println("Query ok, "+rows_updated+" rows_updated");
	   
   }
   public void delete()
   {
	   String query=("delete from productdetails where Item_Code=?"); 
	   int rows_deleted=0;
	   try {
		   rows_deleted=JdbcConnection.deleteRecord(query);
	   }
	   catch (ClassNotFoundException | SQLException e )
	   {
		    e.printStackTrace();
	   }
	   
		 System.out.println("Query ok, "+rows_deleted+" rows_deleted");
	   
   }
}
