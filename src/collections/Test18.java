package collections;

import java.util.ArrayList;
import java.util.Collections;

public class Test18 {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add("Java");
		a.add("Selenium");
		a.add("Python");
		a.add("Api");
		a.add("Appium");
		
		System.out.println("before shuffleing "+a);
		Collections.shuffle(a);
		
		System.out.println("After shuffling "+a);
		

	}

}
