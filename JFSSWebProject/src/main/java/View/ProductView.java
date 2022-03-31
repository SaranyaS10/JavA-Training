package View;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import Controller.JdbcConnection;
import Controller.ProductController;
import Model.Product;

public class ProductView {
       ProductController productcontroller=null;
       Scanner scanner=null;
	public ProductView() {
		super();
		productcontroller=new ProductController();
		scanner=new Scanner(System.in);
		}
    public void display() throws ClassNotFoundException, SQLException 
    {
    	Lable:
    	while(true)
    	{
    		System.out.println("Welcome to Online Shopping");
    		System.out.println("1.Find All Produts");
    		System.out.println("2.Add Products");
    		System.out.println("3.Modify the record");	
    		System.out.println("4.Delete the record");	
    		System.out.println("5.Exit");
    		System.out.println("Enter your choice to proceed:");
    		int choice=scanner.nextInt();
    		
    		switch(choice)
    		{
    		case 1:
    			 List<Product> productList=productcontroller.findAllProduct();
    			 for(Product p: productList)
    				 System.out.println(p);
//    			 Collection.sort(productlist,(p1,p2)->{ return p1.getItem_Name().compareTo (p2.getItem_Name())};);
//    			 System.out.println("After Sorting");
//				 for(Product p: productList)
//			     System.out.println(p);
   
    			break;
    		case 2:
    			productcontroller.save();
    			break;
    		case 3:
    			productcontroller.modify();
    			break;
    		case 4:
    			productcontroller.delete();
    			break ;
    		case 5:
    			System.out.println("Thank you Visit again");
    			break Lable;
    			default:
    				System.out.println("Invalid Option");
    		
    		}
    		
    		
    	}
    }
	public static void main(String args[]) throws SQLException, ClassNotFoundException {
		Connection c=JdbcConnection.getDBConnection();
		ProductProjectView productview=new ProductProjectView();
		productview.display();
	}
       
}
