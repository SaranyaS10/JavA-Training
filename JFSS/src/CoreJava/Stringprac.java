package CoreJava;

public class Stringprac {
	public static void main(String args[]){ 
		System.out.println("-- String --");
		String str1="My Dear";
		System.out.println(str1);
		char ch=str1.charAt(4);
		System.out.println("charAt() "+ch);  
		String str2=new String(" Sara");
		System.out.println(str2);
		String str3=str1+str2;
		System.out.println("Concatenate of Str1 & Str2 --"+str3);
		char[] ch1={'S','a','r','a','n','y','a'};  
		System.out.println(ch1);
		String s1="Gayathri Saravanan";   
		System.out.println("string length is: "+s1.length());
		String s3="";  
		String s2="Hello"; 		  
		System.out.println("boolean isEmpty()"+s3.isEmpty());  
		System.out.println("boolean isEmpty()"+s2.isEmpty()); 
		String s4="  hello 	   ".trim();
		System.out.println("trim() "+s4+"GiGi");
		System.out.println("----------------");
	
		System.out.println();
		System.out.println("-- StringBuffer --");
		StringBuffer sb=new StringBuffer("Hey ");
		sb.append("John");
		System.out.println("Append(): "+sb);
		StringBuffer sb1=new StringBuffer("Hello ");
		sb1.replace(1,3,"ey"); 
		System.out.println("Replace(): "+sb1);
		StringBuffer sb6=new StringBuffer("Hello ");
		sb6.delete(4,5);
		System.out.println("Delete(): "+sb6);
		StringBuffer sb5=new StringBuffer("Saranya ");
		sb5.reverse();  
		System.out.println("Reverse(): "+sb5);
		StringBuffer sb3=new StringBuffer("Hi ");
		sb3.insert(2,"Hey");
		System.out.println("Insert(): "+sb3);
		StringBuffer sb2=new StringBuffer("java is my favourite language ");  
		System.out.println("Capacity(): "+sb2.capacity());	
		StringBuffer sb4=new StringBuffer("Saranya Saravanan "); 
		String subseq= sb4.substring(6); 
	    System.out.println("subseq from start index = "+subseq);  
	    StringBuffer sb7=new StringBuffer("Saranya Saravanan "); 
		String subsequ= sb7.substring(6,10); 
	    System.out.println("subsequ from start and end index = "+subsequ); 
	    StringBuffer sb8 = new StringBuffer("stringbuffer"); 
	    System.out.println("character at index 2: "+sb8.charAt(3));
	    int length1 = sb.length();  
        System.out.println("total character count of \"Hey John\": " + length1);  
        System.out.println("----------------");
        }
}