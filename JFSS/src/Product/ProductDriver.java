package Product;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;


public class ProductDriver {
	
	Invoice invoice=null;
    Scanner scanner=null;
	public ProductDriver() {
		super();
		invoice=new Invoice();
		scanner=new Scanner(System.in);
		}
 public void display() throws ClassNotFoundException, SQLException, MyOwnException 
 {
 	Lable:
 	while(true)
 	{
 		System.out.println("Welcome to Online Shopping");
 		System.out.println("1.Display the Available Product List");
 		System.out.println("2.Add Products");
 		System.out.println("3.Modify added record");	
 		System.out.println("4.Delete the record");	
 		System.out.println("5.Payment mode");	
 		System.out.println("6.View the Bill or Order");
 		System.out.println("7.Exit");
 		System.out.println("Enter your choice to proceed:");
 		int choice=scanner.nextInt();
 		
 		switch(choice)
 		{
 		case 1:
 			 List<ProductInfo> productList=invoice.findAllData();
 			 for(ProductInfo p: productList)
 				 System.out.println(p); 
 			break;
 		case 2:
 			invoice.invoicedetails();
 			break;
 		case 3:
 			invoice.edit();
 			break;
 		case 4:
 			invoice.delete();
 			break;	
 		case 5:
          invoice.paymentmode();
 		case 6:
 			invoice.total();
 		case 7:
 			System.out.println("\n\t\t\t\t----------------Thank You for Shopping!!-----------------");  
 	        System.out.println("\t\t\t\t                     Visit Again");  
 			break Lable;	
 			  default:
 				System.out.println("Invalid Option");
 		}
 
 	}
 }

public static void main(String[] args) throws ClassNotFoundException, SQLException, MyOwnException {
		
	     ProductDriver productDriver=new ProductDriver();
	     productDriver.display();
	}
}
