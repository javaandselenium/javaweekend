package collections;

import java.util.HashMap;

public class Test14 {

	public static void main(String[] args) {
	HashMap<String,Integer>t=new HashMap<String,Integer>();
	t.put("Ganesh",123);
	t.put("Suresh",456);
	t.put("Mahesh",123);
	t.put("Dinesh",890);
	t.put("Nagesh",768);
	
	HashMap<String,Integer>t1=new HashMap<String,Integer>();
	t1.put("Ganesh",123);
	t1.put("Suresh",456);
	t1.put("Mahesh",123);
	
	
	
	System.out.println(t);
	t.putAll(t1);
	System.out.println(t1);

	}

}
