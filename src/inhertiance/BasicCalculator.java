package inhertiance;

public class BasicCalculator {

	public void add(int a,int b) {
		System.out.println(a+b);
	}
	
	public void sub(int a,int b) {
		System.out.println(a-b);
	}
	
	public static void main(String[] args) {
		BasicCalculator b=new BasicCalculator();
		b.add(10,20);
		b.sub(20,10);

	}

}
