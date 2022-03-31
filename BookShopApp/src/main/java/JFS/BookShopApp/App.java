package JFS.BookShopApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class App 
{
    public static void main( String[] args )
    {
   
		ApplicationContext context=new AnnotationConfigApplicationContext(BeanConfiguration.class);
        Book book=context.getBean(Book.class);
        book.displaybook();

        HorrorBook horrorBook=context.getBean(HorrorBook.class);
        horrorBook.horrorbookcount();
      
        
     
    }
}
