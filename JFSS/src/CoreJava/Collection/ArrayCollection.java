package CoreJava.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayCollection {
	public static void main(String[] args) {
	List<String> arrlist=new ArrayList<String>();
	arrlist.add("Saranya");
	arrlist.add("Gowri");
	arrlist.add("Akshaya");
	
	System.out.println("Elements of Array after insertion:");
	for(String s: arrlist) {
		System.out.println(s);
	}
	Collections.sort(arrlist);	
	System.out.println("Elements of Array after sorting:");
	for(String s: arrlist) {
		System.out.println(s);
	}
	arrlist.remove(1);
	System.out.println("Elements of Array after deletion:");
	for(String s: arrlist) {
		System.out.println(s);
	}
		
	ArrayList<String> arrlist1=new ArrayList<String>();   
	arrlist1.add("Ravish");    
	arrlist1.add("Hari"); 
	arrlist.addAll(arrlist1);
	System.out.println("Updated list : "+arrlist);
	System.out.println("Elements of Array after Iteration:");
		Iterator<String> itr=arrlist.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("Elements of Array after listIteration:");
		ListIterator<String> litr=arrlist.listIterator(arrlist.size());
		while(litr.hasPrevious())
		{
			System.out.println(litr.previous());
		}
		arrlist.clear();
		System.out.println("Elements of Array after clear: []");
		for(String s: arrlist) {
			System.out.println(s);
		}
	}
}