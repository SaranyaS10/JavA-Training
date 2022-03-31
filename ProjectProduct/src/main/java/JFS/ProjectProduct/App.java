package JFS.ProjectProduct;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import JFS.ProjectProductView.ProductView;



public class App 
{
    public static void main( String[] args ) throws ClassNotFoundException, SQLException
    {
		ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		ProductView productview=context.getBean(ProductView.class);
		productview.initial();
		productview.display(null);
    }
}
