package CoreJava;

class Normal
{

	public Normal(String a) {
		super();
		System.out.println("I'm inside constructor");
	}
//	public void show(String a)
//	{
//	System.out.println("I'm inside show method");
//	}
//	
//	public static void show(String a)
//	{
//	System.out.println("I'm inside show method");
//	}
	
}

public class LambdaExpression {
	
	public static void main(String args[])
	{
//		MyInterface ref=()->
//		{
//			System.out.println("I'm inside display method");
//	    };
//		ref.display();
		
		//LambdaExpression
//		MyInterface ref=(int s, int p)-> // We can define like this also MyInterface re=(s,p)
//		{
//			System.out.println("Mutiplication of s*p is "+"\n"+ s*p);
//	    };
//		ref.display(3,9);
		//Non-Static Method
//		Normal obj=new Normal();
//		MyInterface ref=obj::show;
//		ref.display("Method Reference");
		
		//Static Method
	
//		MyInterface ref=Normal::show;
//		ref.display("Method Reference");
		
		//constructor
		
	
	    MyInterface ref=Normal::new;
		ref.display("Method Reference");
		
	}

}
