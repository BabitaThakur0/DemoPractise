package Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Test {
	
	/*
	 Puma 1500
    Woodland 2100
   Campus 1400
    USPolo 2000
   Map<>
 
	 */

	public static void main(String[] args) {
		  Map<String, Integer> map = new HashMap<String, Integer>();
		 List<Integer> list = new ArrayList<Integer>();
		  map.put("Puma", 1500);
		  map.put("Woodland", 2100);
		  map.put("Campus", 1500);
		  map.put("USPolo", 2000);
	    Set<Entry<String, Integer>> newValue = map.entrySet();
	     Iterator<Entry<String, Integer>> itr = newValue.iterator();
	     while(itr.hasNext())
	     {
	    	 
	    	  list.add(itr.next().getValue());
	    	 Collections.sort(list);
	 		
	       }
	    
	     System.out.println("Result : "+list.get(2));
	     
	     
	   
		  
		
	}

}
