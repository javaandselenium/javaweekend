package methods;

public class Test8 {
	public void add(int a, int b) {
		System.out.println(a + b);
	}

	public void add(int a, double b) {
		System.out.println(a + b);
	}

	public void add(int a, int b, double c) {
		System.out.println(a + b + c);
	}

	public void add(double a, int b, int c) {
		System.out.println(a + b + c);
	}
	
	public void add(double a, int b, int c,int d) {
		System.out.println(a + b + c);
	}

	public static void main(String[] args) {
  Test8 t=new Test8();
  t.add(10,23.89);
  t.add(20.90,20,80);
  
	}

}
