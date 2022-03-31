package CoreJava;

public class Functions {
	public static void operator()
	{
	int a,b;
	a=6;
	b=9;
	System.out.println(a>=b);
	}
	public static void profile()
	{
	String name="Saranya S";
	String location="Chennai";
	String pincode="600040";
	System.out.println("Name: "+name);
	System.out.println("Location: "+location);
	System.out.println("Pincode: "+pincode);
	}
	public static void age(String name, int age)
	{
		System.out.println(name + " is " + age);
	}
	public static void decisionmaking()
	{
		int year=200;
		if (year % 4 == 0) 
		System.out.println(year + " is a leap year.");
		else
		System.out.println(year + " is not a leap year.");	
	}
	public static void loops()
	{
		for(int m=1;m<=5;m++){ 
			for(int n=1;n<=m;n++){  
			        System.out.print("*");  
			}  
		System.out.println();//new line  
			}
	}
	public static void parameter(int i)
	{
		 for(;i<=10;i++){  
		        System.out.println("3*"+i+"="+i*3);  
		    } 
	}	

	public static void main(String args[]){ 
		operator();
		profile();
		loops();
		 parameter(1);
		decisionmaking();
		age("Anu", 5);
		age("Arun", 10);
		age("Bakiya", 9);
	}
	}
