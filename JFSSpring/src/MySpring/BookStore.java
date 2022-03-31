package MySpring;

import javax.annotation.PostConstruct;

import javax.annotation.PreDestroy;


import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;



public class BookStore implements InitializingBean,DisposableBean{

	public void sales() {
		System.out.println("I'm inside Sales Method");
	}	
//	public void purchase() {
//		System.out.println("I'm inside Purchase Method");
//	}
	
	@PostConstruct
	public void initfirst() {
		System.out.println("Bean instantiated...");
	}
	@PreDestroy
	public void destroylast() {
		System.out.println("Bean Destroyed");
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Bean instantiated");
		
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("Bean Destroyed");
		
	}
	
		
	}
	
	


