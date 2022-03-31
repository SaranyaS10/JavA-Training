package BookStall;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import BookStall.Books1;
@Component

public class BookUtil {
	
	@Autowired
	Books1 books1;
	
//	public void collection() {
//		
//      List<Books1> books=new LinkedList<Books1>();
//       books.add(new Books1(100,1000));
//       
//       for(Books1 b:books) {
//    	   System.out.println(b);
//       }
//	}
	public void offer(@Value("${books1.BookPrice}") String p) {
		int price=Integer.parseInt(p);
		if(price>20 && price<200)
		{
			
			System.out.println("Offer is eligible....!!");
		}
		else
			System.out.println("Offer is not eligible....!!");
		
	}
}
