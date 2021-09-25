package methods;

public class Test7 {
	
	static int a=100;
	int b=900;
	
	public static void mul() {
		System.out.println(10*20);
	}
	
	public static void add() {
		System.out.println(10+50);
	}
	
	public void sub() {
		System.out.println(10-3);
	}

	public static void main(String[] args) {
    System.out.println(Test7.a);
    Test7 t7=new Test7();
    System.out.println(t7.b);
    
    Test7.mul();
    Test7.add();
    t7.sub();
    
    


	}

}
