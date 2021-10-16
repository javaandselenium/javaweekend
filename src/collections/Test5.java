package collections;

import java.util.Vector;

public class Test5 {

	public static void main(String[] args) {
		Vector v=new Vector();
		v.add(10);
		v.add(30);
		v.add("Hello");
		v.add('A');
		v.add(90.90);
		v.add(10);
		v.add(10);
		v.add(30);
		v.add("Hello");
		v.add('A');
		v.add(90.90);
		v.add(10);
		
		System.out.println("current size of the element "+v.size());
		System.out.println("cpacity of the list "+v.capacity());
		
		for(int i=0;i<v.size();i++) {
			System.out.println(v.get(i));
		}
		

	}

}
