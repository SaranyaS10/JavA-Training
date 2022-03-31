package JFS.BookShopApp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component
public class BookStock implements BookInterface{

	public void stockDetails()
	{
		System.out.println("Java Book stock Count is 1000");
	}
	
	public void firstbook()
	{
		System.out.println("firstbook() method from BookStock implements BookInterface ");
	}
}
