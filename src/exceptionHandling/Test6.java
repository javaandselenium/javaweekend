package exceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test6 {
	public void add() throws FileNotFoundException {
		FileInputStream f=new FileInputStream("./d");
		
	}
	
	public void sub() {
		System.out.println(10-4);
	}
	

	public static void main(String[] args) {
     Test6 t=new Test6();
     try {
     t.add();
     }
     catch(Exception e) {
    	 
     }
     t.sub();


	}

}
