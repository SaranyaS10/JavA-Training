
public class PrivateMethodsinInterface implements PrivateInterface {
	public void abstractMethod()
	{
		System.out.println("I am inside abstract metohod");
	}
	public static void main(String[] args) {
		PrivateMethodsinInterface obj=new PrivateMethodsinInterface();
		obj.abstractMethod();
        obj.defaultMethod();
        PrivateInterface.staticMethod();
	}
	
}
