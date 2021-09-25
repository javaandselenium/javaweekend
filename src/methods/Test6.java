package methods;

public class Test6 {
	
	int a=100;
	static int b=200;
	
	public static void add() {
		System.out.println(10+20);
	}
	
	public void sub() {
		System.out.println(10-5);
	}

	public static void main(String[] args) {
	Test6 t=new Test6();
	System.out.println(t.a);
	
	System.out.println(Test6.b);
	Test6.add();
	t.sub();
	
	
		

	}

}
