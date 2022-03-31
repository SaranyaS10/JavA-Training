package MyProductProject;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;
import java.util.Scanner;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import Model.Product;
import Controller.*;
import View.ProductProjectView;

//@RunWith(Suite.class)
//@SuiteClasses({UnitTestinggTestCase.class })

class MyProductProjectTC {

public static ProductProjectView productview;
@BeforeAll
static void setup() {
	productview=new ProductProjectView();
	
	
}

 @Test
	void test() throws SQLException {
		Product p=new Product("P1000105","Mobile",1000,10);
		assertEquals("P1000105",p.getItem_ID());
		try {
			productview.display();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	@Test
	void test1() {
	Product p=new Product("P1000105","Mobile",1000,10);
		assertNotEquals("P1000105",p.getItem_Name());

		
	}
	@Test
	void test2() {
	Product p=new Product("P1000105","Mobile",1000,10);
		assertSame("Mobile",p.getItem_Name());
	
		
	}
	@Test
	void test3() {

		fail("Failed");
		
	}
	
	
}
