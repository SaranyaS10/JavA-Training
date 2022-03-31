package CoreJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
	public static void main(String[] args) {
		String array[]= {"Hi","Rajendra"," Kumar"};
		//print array in string
		System.out.println("Array:" +Arrays.toString(array));
		//convert the array using aslist 
		List<String> list=Arrays.asList(array);
		System.out.println("List:" +list);
		List<Integer> list1=new ArrayList<Integer>();
		list1.add(2000);
		list1.add(3000);
		list1.add(1000);
		list1.add(8000);
		System.out.println("Using For Each");
		list1.stream().map(i->i*3).forEach(System.out::println);
		List<Integer> cl=list1.stream().map(i->i*3).collect(Collectors.toList());
		List<Integer> cl1=list1.stream().sorted().collect(Collectors.toList());
		System.out.println("Collector List" +cl);
		System.out.println("Sorted List" +cl1);
        List<String> stringlist=new ArrayList<String>();
        stringlist.add("Saranya");
        stringlist.add("Saravanan");
        List sl=stringlist.stream().filter(s->s.contains("Saran")).collect(Collectors.toList());
        List s2=stringlist.stream().filter(s->s.matches("Saranya")).collect(Collectors.toList());
        List s3=stringlist.stream().filter(s->s.startsWith("S")).collect(Collectors.toList());
        System.out.println("Using filer contains" +sl);
        System.out.println("Using filer matches" +s2);
        System.out.println("Using filer startsWith" +s3);
        
       int res1= list1.stream().filter(x->x>20).reduce(0,(Integer::sum));
       System.out.println(res1+"\n"+"Using method reference");
       int res2= list1.stream().filter(x->x>20).reduce(0,(sum,i)->Integer.sum(sum, i));
       System.out.println(res2+"\n"+"Integer.sum");
       int res3= list1.stream().filter(x->x>20).reduce(0,(sum,i)->sum+i);
       System.out.println(res3+"\n"+"normal reduce method");
       
        
	}
	
}
