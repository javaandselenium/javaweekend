package collections;

import java.util.ArrayList;
import java.util.Collections;

public class Test20 {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add("Java");
		a.add("Selenium");
		a.add("Python");
		a.add("Api");
		a.add("Appium");
		
		System.out.println("before swapping "+a);
      Collections.swap(a,1,2);
      
      System.out.println("After swapping "+a);
		
	}

}
