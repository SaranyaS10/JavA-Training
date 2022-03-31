import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

class UnitTestinggTestCase {
	static UnitTestingg unitTesting=null;
	static Scanner scan=null;
	static void setup()
	{
		unitTesting=new UnitTestingg();
		scan=new Scanner(System.in);
		
	}
	
	@Test
	void test() {
		//fail("Not yet implemented");
	  unitTesting=new UnitTestingg();
		int result=unitTesting.mul(8, 6);
		assertEquals(47,result, "should be 48"); 
	}
		@Test
	void test1() {
		unitTesting=new UnitTestingg();
		long result1=unitTesting.add(1000, 3500);
		assertEquals(4500,result1, "issue"); 
	}
		@Test
		void test2() {
		unitTesting=new UnitTestingg();
		char result2=unitTesting.character('S');
		assertEquals('S',result2, "should be S");
	}
		
		@AfterEach
		void teardown() {
			System.out.println();
		}
		
		@AfterAll
		static void tear()
		{
			scan.close();
		}
}


