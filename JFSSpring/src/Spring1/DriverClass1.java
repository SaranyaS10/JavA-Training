package Spring1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DriverClass1 {

	public static void main(String[] args) {
	
		ApplicationContext context=new ClassPathXmlApplicationContext("bookconfiguration.xml");
		BookStore1 bookStore1=(BookStore1)context.getBean("bookStore1");
	
		System.out.println(bookStore1);
		BookStore2 bookStore2=(BookStore2)context.getBean("bookStore2");
		System.out.println(bookStore2);
	}

}
