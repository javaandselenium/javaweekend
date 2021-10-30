package collections;

import java.util.ArrayList;
import java.util.Collections;

public class Test19 {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add("Java");
		a.add("Selenium");
		a.add("Python");
		a.add("Api");
		a.add("Appium");
		
		System.out.println("Before swapping "+a);
		
		Collections.swap(a,0,a.size()-1);
		
		System.out.println("After sapping "+a);

	}

}
