package collections;

import java.util.ArrayList;

public class Test4 {

	public static void main(String[] args) {
		ArrayList list1=new ArrayList();
		list1.add(10);
		list1.add(9.00);
		list1.add('A');
		list1.add("hello");
		
		System.out.println(list1.indexOf('A'));
		System.out.println(list1.lastIndexOf(10));
		System.out.println(list1.remove(2));
		System.out.println(list1);

	}

}
