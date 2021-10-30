package collections;

import java.util.LinkedList;

public class Test22 {

	public static void main(String[] args) {
		LinkedList l=new LinkedList<>();
		l.add(20);
		l.add(300);
		l.add(400);
		l.add(10);
		l.add(1);
		
		System.out.println(l.getFirst());
		System.out.println(l.getLast());

	}

}
