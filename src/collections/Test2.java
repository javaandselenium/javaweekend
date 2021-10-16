package collections;

import java.util.ArrayList;

public class Test2 {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(10);
		a.add(9.00);
		a.add('A');
		a.add("hello");
		
		ArrayList a1=new ArrayList();
		a1.add(10);
		a1.add(9.00);
		a1.add('B');
		a1.add("hello");
		
		System.out.println(a.equals(a1));
	}

}
