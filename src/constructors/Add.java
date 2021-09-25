package constructors;

public class Add {

	public Add(int a, int b) {
		System.out.println(a + b);
	}

	public Add(String a, int b) {
		System.out.println(a + b);
	}

	public Add(double a, int b) {
		System.out.println(a + b);
	}

	public Add(String a, double b) {
		System.out.println(a + b);
	}

	public static void main(String[] args) {
		Add a=new Add(20.90,20);
		Add a1=new Add("Hello",89.00);
		Add a2=new Add("bye",60);
		Add a3=new Add(10,20);

	}

}
