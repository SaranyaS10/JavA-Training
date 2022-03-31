package MyProductProject;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import Assessments.Calculator;



class CaculatorTestCase {
	
	static Calculator calculator=null;
	@BeforeAll
	static void save() {
		calculator=new Calculator();
		
	}

	@Test
	void test() {
		calculator=new Calculator();
		int result1=calculator.add(10, 30);
		assertEquals(40,result1, "No Issue"); 
	}

}
