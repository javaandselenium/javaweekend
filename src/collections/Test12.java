package collections;

import java.util.TreeMap;

public class Test12 {

	public static void main(String[] args) {
		TreeMap<String,Integer> t=new TreeMap<String,Integer>();
		t.put("Ganesh",123);
		t.put("Suresh",456);
		t.put("Mahesh",123);
		t.put("Dinesh",890);
		
		TreeMap<String,Integer> t1=new TreeMap<String,Integer>();
		t1.put("Ga",123);
		t1.put("Su",456);
		t1.put("Ma",123);
		t1.put("Di",890);

		
		
		System.out.println(t.equals(t1));
	
	}

}
