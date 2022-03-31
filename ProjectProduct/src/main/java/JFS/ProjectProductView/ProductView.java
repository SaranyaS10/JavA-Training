package JFS.ProjectProductView;


import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Around;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import JFS.ProjectProductController.*;
import JFS.ProjectProductModel.*;

@Component
public class ProductView {
	@Autowired
       ProductController productcontroller;
	
	@Autowired
	List<Product> productList;
    
	public void initial() {
	
		productcontroller=new ProductController();
		
		}
	@Around("execution( public void display())")
    public void display(JoinPoint joinPoint) throws ClassNotFoundException, SQLException 
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
    		Scanner scanner=new Scanner(System.in);
    		
    		switch(scanner.nextInt())
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
    		
    		//scanner.close();
    	}
    }
//	public static void main(String args[]) throws SQLException, ClassNotFoundException {
//		Connection c=JdbcConnection.getDBConnection();
//		ProductView productview=new ProductView();
//		productview.display();
//	}
       
}

