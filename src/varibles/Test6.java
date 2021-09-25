package varibles;

public class Test6 {
	int a=10;
	
	public void demo() {
		int b=20;
		System.out.println(b);
		System.out.println(a);
	}

	public static void main(String[] args) {
		Test6 t=new Test6();
		System.out.println(t.a);
		t.demo();
		
	}

}
