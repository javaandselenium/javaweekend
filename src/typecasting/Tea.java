package typecasting;

public class Tea extends Coffee{

	public void hotTea() {
		System.out.println("hottea");
	}
	
	public void coldTea() {
		System.out.println("coldtea");
	}
	
	public static void main(String[] args) {
		Coffee c=new Tea();
		Tea t=(Tea)c;
		t.hotCoffee();
		t.coldCoffee();
		t.hotTea();
		t.coldTea();
		
		
		
	}
}
