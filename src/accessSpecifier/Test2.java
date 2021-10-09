package accessSpecifier;

public class Test2 {
	
	private int a=900;
	
	private void add() {
		System.out.println("private method");
	}
	
	private Test2() {
		System.out.println("private constructor");
		
	}

	public static void main(String[] args) {
		Test2 t2=new Test2();
		t2.add();
		System.out.println(t2.a);

	}

}
