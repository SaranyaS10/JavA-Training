package CoreJava;

public class Pyramid {
	public static void loops(int m,int n)
	{
		for(;m<=5;m++){ 
			for(;n<=m;n++){  
			        System.out.print("*");  
			}  
		System.out.println();//new line  
			}
	}
	public static void main(String args[]){ 
		loops(1,1);
		
	}
}
