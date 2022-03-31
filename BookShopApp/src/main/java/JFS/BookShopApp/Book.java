package JFS.BookShopApp;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;

@Component
public class Book {
	@Autowired
	BookStock bookstock;
	
	@Autowired
	BookImplementation bookimplementation;
	
	@Autowired
	@Qualifier("bookImplementation")
	BookInterface bookinterface;
	
	@Autowired
	HorrorBook horrorBook;
	
	@Autowired
	ComedyBook comedyBook;
	

	public BookStock getBookstock() {
		return bookstock;
	}


	public void setBookstock(BookStock bookstock) {
		this.bookstock = bookstock;
	}


	public void displaybook() {
		System.out.println("Book Name is Java 17");
		bookstock.stockDetails();
		bookstock.firstbook();
		bookimplementation.firstbook();
		System.out.println("Using Qualifier method in BookImplementation: ");
		bookinterface.firstbook();
		horrorBook.horrorbookcount();
	//	comedyBook.comedyBookCount();
	}
	
}
