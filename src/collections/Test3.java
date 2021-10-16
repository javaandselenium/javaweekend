package collections;

import java.util.ArrayList;

public class Test3 {

	public static void main(String[] args) {
		ArrayList list1=new ArrayList();
		list1.add(10);
		list1.add(9.00);
		list1.add('A');
		list1.add("hello");
		
		ArrayList list2=new ArrayList();
		list2.add(10);
		list2.add(9.00);
		list2.add('A');
		list2.add("hello");
		
		System.out.println(list1.addAll(list2));
		System.out.println(list2);

	}

}
