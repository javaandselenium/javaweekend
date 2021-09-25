package constructors;

public class Search {

	public Search(int a) {
		System.out.println(a);
	}

	public Search(int a, double b) {
		this(20);
		System.out.println(a + b);
	}

	public Search(String a, int b) {
		this(10,20.00);
		System.out.println(a + b);
	}

	public Search(String b, double a) {
		this("Heelo",20);
		System.out.println(b + a);
	}

	public static void main(String[] args) {
	Search s=new Search("bye",90.00);

	}

}
