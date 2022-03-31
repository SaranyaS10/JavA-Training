package CoreJava.Collection;


import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListCollections {
		
		public static void main(String[] args) {
			List<Double> arrlist=new LinkedList<Double>();
			arrlist.add(100.768);
			arrlist.add(200.789);
			arrlist.add(24.97);
			
			System.out.println("Elements of LinkedList after insertion:");
			for(Double d: arrlist) {
				System.out.println(d);
			}
			Collections.sort(arrlist);	
			System.out.println("Elements of LinkedList after sorting:");
			for(Double d: arrlist) {
				System.out.println(d);
			}
			arrlist.remove(2);
			System.out.println("Elements of LinkedList after deletion:");
			for(Double d: arrlist) {
				System.out.println(d);
			}
				
			LinkedList<Double> arrlist1=new LinkedList<Double>();   
			arrlist1.add(200.68);    
			arrlist1.add(500.282); 
			arrlist.addAll(arrlist1);
			System.out.println("Updated list : "+arrlist);
			System.out.println("Elements of LinkedList after Iteration:");
				Iterator<Double> itr=arrlist.iterator();
				while(itr.hasNext())
				{
					System.out.println(itr.next());
				}
				System.out.println("Elements of LinkedList after listIteration:");
				ListIterator<Double> litr=arrlist.listIterator(arrlist.size());
				while(litr.hasPrevious())
				{
					System.out.println(litr.previous());
				}
				arrlist.clear();
				System.out.println("Elements of LinkedList after clear: []");
				for(Double d: arrlist) {
					System.out.println(d);
				}
			}
	}


