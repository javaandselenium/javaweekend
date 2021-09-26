package constructors;

public class Test2 {
	
	String name;
	int numb;

	

	public Test2(String name, int numb) {
		super();
		this.name = name;
		this.numb = numb;
	}



	public static void main(String[] args) {
		Test2 t=new Test2("john",1345);
		System.out.println(t.name);
		System.out.println(t.numb);

	}

}
