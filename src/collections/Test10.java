package collections;

import java.util.LinkedHashSet;

public class Test10 {

	public static void main(String[] args) {
		LinkedHashSet l=new LinkedHashSet<>();
		l.add(10);
		l.add(20);
		l.add(2);
		l.add(30);
		l.add(100);
		l.add(10);
		
		System.out.println(l);

	}

}
