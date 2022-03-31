package CoreJava;

public class Method {
	public static float mutiplication(float a, float b)
	{
		return(a*b);
	}
	public static int addition(int a, int b)
	{
		return(a+b);
	}
	public static int subtraction(int a, int b)
	{
		return(a-b);
	}
	public static void table(int i)
	{
		for(;i<=10;i++){  
	        System.out.println(i+"*3="+i*3);
	}
	}
	public static void main(String args[]){ 
		float resl=mutiplication(7.5f,8.5f);
		System.out.println("Result is "+resl);
		System.out.println(addition(5,8));
		int res=subtraction(8,10);
		System.out.println("Result of subtraction is "+res);
		table(1);
	}
}
