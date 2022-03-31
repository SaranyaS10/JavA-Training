 package Product;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Invoice extends OnlineMode {
	
  List<ProductInfo> productinfo = new ArrayList<ProductInfo>();  
	public  void invoicedetails()  {
		 String query="insert into invoicedetails(Item_Code,Item_Name,Item_Rate,quantity,totalprice,discount,subtotal,cgst,sgst,invoice_total)values(?,?,?,?,?,?,?,?,?,?)"; 
		   int rows_inserted=0;
		   try {
			   rows_inserted=JdBcConnection.saveRecord(query);
		   }
		   catch (ClassNotFoundException | SQLException e )
		   {
			    e.printStackTrace();
		   }
		   
		  System.out.println("Query ok, "+rows_inserted+" rows_updated");
		return;
	}
	public List<ProductInfo> findAllData()throws SQLException,ClassNotFoundException
	   {
		   List<ProductInfo> productList=new ArrayList<ProductInfo>();
		   String query=("Select * from invoicedetails;");
		   ResultSet resultset;
		   
		   try {
			   resultset=JdBcConnection.getResultSet(query);
			   while(resultset.next()) 
				{
			   		//System.out.println(resultset.getString("Item_Code")+" "+resultset.getString("Item_Name")+" "+resultset.getInt("Item_Rate")+" "+resultset.getInt("quantity"));
	                String Item_Code=resultset.getString("Item_Code");
	                String Item_Name=resultset.getString("Item_Name");
	                int Item_Rate=resultset.getInt("Item_Rate");
	                int quantity=resultset.getInt("quantity");
	                int totalPrice=resultset.getInt("totalPrice");
	                int discount=resultset.getInt("discount");
	                int subtotal=resultset.getInt("subtotal");
	                int cgst=resultset.getInt("cgst");
	                int sgst=resultset.getInt("sgst");
	                int invoice_total=resultset.getInt("invoice_total");

	                productList.add(new ProductInfo(Item_Code,Item_Name,Item_Rate,quantity, totalPrice,discount,subtotal,cgst,sgst,invoice_total));
			    
		   }}catch (ClassNotFoundException | SQLException e )
		   {
			    e.printStackTrace();
		   }
		   return productList;
	   }
	public void edit()
	   {
		   String query=("update invoicedetails set Item_Rate=?,quantity=?,totalPrice=? where Item_Code=?"); 
		   int rows_updated=0;
		   try {
			   rows_updated=JdBcConnection.modifyRecord(query);
		   }
		   catch (ClassNotFoundException | SQLException e )
		   {
			    e.printStackTrace();
		   }
		   
			 System.out.println("Query ok, "+rows_updated+" rows_updated");
		   
	   }
	public void delete()
	   {
		   String query=("delete from invoicedetails where Item_Code=?"); 
		   int rows_deleted=0;
		   try {
			   rows_deleted=JdBcConnection.deleteRecord(query);
		   }
		   catch (ClassNotFoundException | SQLException e )
		   {
			    e.printStackTrace();
		   }
		   
			 System.out.println("Query ok, "+rows_deleted+" rows_deleted");
		   
	   }
	
	
	public void paymentmode() 
	{
	
		System.out.println("Payment details");
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in); 
		
		 System.out.println("Choose the payment mode\n "+"\n"+"1.Cash\n"+"2.CreditCard\n"+"3.DebitCard");
		 String paymentmode=scan.nextLine(); 
		 if(paymentmode.length() == 9 || paymentmode.length() == 10)
		 {
			 System.out.println("Enter the number");
			 Integer number=scan.nextInt(); 
			 System.out.println("Enter the CVV");
			 Integer cvv=scan.nextInt();
			 
		 }else
		 {
			 System.out.println("Paid by cash");	 
		 }
	       
	}
	public void total()
        {
		  
	    System.out.println("\n\t\t\t\t           Invoice Receipt              ");  
	    System.out.format("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");  
	    System.out.print("\nItem_Code \t\tItem_Name\t\tquantity\t\tItem_Rate\t\tTotalPrice\t\tDiscount\t\tSub Total\t\tCGST\t\tSGST\t\tInvoice Total\n");  
	    System.out.format("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");   
		String query=("Select * from invoicedetails;");
		   ResultSet resultset = null;
		 
		   try {
			   resultset=JdBcConnection.getResultSet(query);
			   while(resultset.next()) {
		   }}catch (ClassNotFoundException | SQLException e ){
			   e.printStackTrace();
		   }
		   System.out.format("  %-9s            %-9s              %5d                          %6d                %6d            %7d           %10d          %13d         %11d  %15d \n" ,getItem_Code(), getItem_Name(), getQuantity(), getItem_Rate(), getTotalPrice(),getDiscount(),getSubtotal(),getCgst(),getSgst(),getInvoice_total());  
		    System.out.print("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
		   }
	}

	

