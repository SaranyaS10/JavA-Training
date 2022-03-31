package MySpring;


import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
//import Model.Product;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;




public class DriverClass {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context=new ClassPathXmlApplicationContext("BeanConfig.xml");
	    ((AbstractApplicationContext)context).registerShutdownHook();
//		BookStore bookStore=(BookStore)context.getBean("bookstore");
//		BookPublisher bookPublisher=(BookPublisher) context.getBean("bookPublisher");
//		bookStore.sales();
//	    bookStore.purchase();
//		bookPublisher.booksales();
//   	bookPublisher.bookpurchase();
//    	Books books1=(Books)context.getBean("books");
//    	Books books2=(Books)context.getBean("books");
//    	books2.setRate(1200);
//    	books1.bookRate();
//    	System.out.println(books1);
//    	books2.bookRate();
//    	System.out.println(books2);
    	
//    	Product product=(Product)context.getBean("product");
//    	System.out.println(product);
	    BookDetails bookDetails=(BookDetails)context.getBean("bookdetails");
    	System.out.println(bookDetails);
    	
    	BookCollection bookCollection=(BookCollection)context.getBean("bookCollection");
    	System.out.println(bookCollection);
    	
    	BeanDefinitionRegistry beanFactory=new DefaultListableBeanFactory();
    	XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(beanFactory);
    	reader.loadBeanDefinitions(new ClassPathResource("BeanConfig.xml"));
    	 
	}

}
