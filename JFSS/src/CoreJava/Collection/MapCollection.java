package CoreJava.Collection;

import java.util.HashMap;
import java.util.Map;

public class MapCollection {

	public static void main(String[] args) {

   Map<Integer,String> map1=new HashMap<Integer, String>();
   map1.put(1, "Ziggy");
   map1.put(2, "Madhu");
      for(Map.Entry m:map1.entrySet()) {
    	  System.out.println(m.getKey()+" "+m.getValue());
      }
     map1.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
	}

}
