package BookStall;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class Books1 {

	int BookID=100;
	int BookPrice;
	
	
//
//	public   Books1(int bookID, int bookPrice) {
//	super();
//		BookID = bookID;
//		BookPrice = bookPrice;
//	}

	public int getBookID() {
		return BookID;
	}

	public void setBookID(int bookID) {
		BookID = bookID;
	}

	public int getBookPrice() {
		return BookPrice;
	}

	public void setBookPrice(int bookPrice) {
		BookPrice = bookPrice;
	}
	
}
