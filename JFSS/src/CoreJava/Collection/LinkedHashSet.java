package CoreJava.Collection;


import java.util.Set;

public class LinkedHashSet {

	public static void main(String[] args) {
		Set<Integer> set1=new java.util.LinkedHashSet<Integer>();
		set1.add(100);
		set1.add(90);
		set1.add(80);
		set1.add(70);
		set1.add(90);
		
		System.out.println("The set of elements using LinkedHashSet Method - Add ");
		for(Integer i: set1) 
		{
	    System.out.println(i);
		}
		Set<Integer> set2=new java.util.LinkedHashSet<Integer>();
			
		set2.add(95);
		set2.add(85);
		set2.add(105);
		set2.add(120);
		set2.add(90);
		
		Set<Integer> union=new java.util.TreeSet<Integer>(set1);
		union.addAll(set2);
		
		System.out.println("The set of elements using LinkedHashSet Method - Combining 2 add method to find unique records");
		for(Integer p: union) 
		{
	    System.out.println(p);
		}
		System.out.println("The set of elements using LinkedHashSet Method - RetainAll");
		set1.retainAll(set2);
		for(Integer p: set1) 
		{
	    System.out.println(p);
		}   
		union.removeAll(set2); 
        System.out.print("Difference of set1 and set2 is:"); 
        for(Integer p: union) 
		{
	    System.out.println(p);
		}
	}

}
