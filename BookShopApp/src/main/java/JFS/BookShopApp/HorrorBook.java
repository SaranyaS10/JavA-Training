package JFS.BookShopApp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class HorrorBook {
	@Value("#{19+10}")
private int y;
	public Integer horrorbookcount()
	{
		Integer count = 100;
		count+=y;
		System.out.println(count);
		return count;
		
	}
}
