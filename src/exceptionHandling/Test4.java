package exceptionHandling;

import java.io.FileInputStream;

public class Test4 {
	public static void add() {
		System.out.println(90+10);
	}
	public static void main(String[] args) {
		
		try {
		int a=1/0;
		}
		catch(ArithmeticException a) {
		System.out.println(a);
		
		}
		try {
		FileInputStream fis=new FileInputStream("./d");
		}
		catch(Exception e) {
			System.out.println("handled");
			System.out.println(e);
		}
		Test4.add();
		System.out.println("hello java");
		
		
	}

}
