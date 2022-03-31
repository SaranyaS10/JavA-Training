package JFS.BookShopApp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class BookImplementation implements BookInterface {

	public void firstbook()
	{
		System.out.println("firstbook() method from BookImplementation implements BookInterface ");
	}
}
