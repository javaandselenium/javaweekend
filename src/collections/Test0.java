package collections;

import java.util.ArrayList;

public class Test0 {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(10);
		a.add(9.00);
		a.add('A');
		a.add("hello");
		a.add("");
		a.add(10);
		
		for(int i=0;i<a.size();i++) {
			System.out.println(a.get(i));
		}
		
	}

}
