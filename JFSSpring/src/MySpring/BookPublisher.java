package MySpring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BookPublisher implements InitializingBean,DisposableBean {

	public void booksales() {
		System.out.println("I'm inside BookSales Method in BookPublisher class");
	}	
//	public void bookpurchase() {
//		System.out.println("I'm inside BookPurchase Method in BookPublisher class");
//	}
	@PostConstruct
	public void initfirst1() {
		System.out.println("Bean instantiated from BookPublisher class ...");
	}
    @PreDestroy
	public void destroylast1() {
		System.out.println("Bean Destroyed from BookPublisher class");
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("AfterPropertiesSet method from InitializingBean in BookPublisher class");
		
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("Destroy method from DisposableBean in BookPublisher class ");
		
	}
	
}
