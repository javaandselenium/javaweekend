package ac;

import accessSpecifier.Test0;
import accessSpecifier.Test2;
import accessSpecifier.Test3;
import accessSpecifier.Test4;


public class Test2 extends Test4{

	public static void main(String[] args) {
		 Test0 t=new Test0();
		    System.out.println(t.a);
		    t.demo();
		    
		    Test2 t4=new Test2();
			System.out.println(t4.a);
			t4.add();
		    
		 
	}

}
