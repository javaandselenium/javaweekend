package collections;

import java.util.TreeMap;

public class Test11 {

	public static void main(String[] args) {
	TreeMap<String,Integer> t=new TreeMap<String,Integer>();
	t.put("Ganesh",123);
	t.put("Suresh",456);
	t.put("Mahesh",123);
	t.put("Dinesh",890);
	t.put("Nagesh",768);
	t.put("Suresh",456);
	
	//t.clear();
	System.out.println(t.isEmpty());
  System.out.println(t.keySet());
  System.out.println(t.values());
  System.out.println(t.containsKey("Sur"));
  System.out.println(t.containsValue(1234));
	
	

	}

}
