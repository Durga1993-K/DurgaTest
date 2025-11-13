package Array;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Hashmap {
	public static void main(String[] args) {
		
	Map<Integer, String> m = new HashMap<Integer, String>();
	
	m.put(101, "Kalyani");
	
	m.put(102, "Bhavi");
	m.put(103, "Vasu");
	m.put(104, "Harvin");
	m.put(105, "Vasu");
	
//	System.out.println(m);
//	boolean val =m.containsKey(106);
//	System.out.println(val);
	for(Map.Entry k : m.entrySet())
	{
		System.out.println(k.getKey() + " " + 
	k.getValue());
		
	}
	}

}
