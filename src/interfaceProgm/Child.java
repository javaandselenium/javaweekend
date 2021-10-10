package interfaceProgm;

public class Child extends Parent1 implements Parent2,Parent3 {
	


	@Override
	public void cycle() {
		System.out.println("cycle from parent 2");
		
	}

	@Override
	public void bike() {
		System.out.println("bike from parent 3");
		
	}
	public static void main(String[] args) {
		Child c=new Child();
		c.car();
		c.cycle();
		c.bike();
	}

}
