package inhertiance;

public class Child extends Father {
	
	public void cycle() {
		System.out.println("cycle from child");
	}

	public static void main(String[] args) {
         Child c=new Child();
         c.cycle();
         c.car();
         c.house();

	}

}
