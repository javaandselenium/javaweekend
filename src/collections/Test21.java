package collections;

import java.util.NavigableSet;
import java.util.TreeSet;

public class Test21 {

	public static void main(String[] args) {
	TreeSet t=new TreeSet();
	t.add(200);
	t.add(20);
	t.add(10);
	t.add(2);
	t.add(1000);
	
	System.out.println("before reversing "+t);
	
	NavigableSet des = t.descendingSet();
	System.out.println("after reversing "+des);
	
	}

}
