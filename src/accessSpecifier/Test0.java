package accessSpecifier;

public class Test0 {
	
	public int a=10;
	
	public void demo() {
		System.out.println("public method");
	}
	
	public Test0() {
		System.out.println("Public constructor");
	}

	public static void main(String[] args) {
    Test0 t=new Test0();
    System.out.println(t.a);
    t.demo();
    
    Test3 t3=new Test3();
	System.out.println(t3.a);
	t3.add();

	}

}
