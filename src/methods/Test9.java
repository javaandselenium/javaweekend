package methods;

public class Test9 {
	public static void send(int numb, String photo) {
		System.out.println(numb + photo);
	}

	public static void send(String name, String location) {
		System.out.println(name + location);
	}

	public static void send(int numb, String video, String document) {
		System.out.println(numb + video + document);
	}

	public static void send(int numb, int num) {
		System.out.println(num + num);
	}

	public static void main(int a)
	{
		System.out.println(a);
	}
	

	public static void main(int a,double b)
	{
		System.out.println(a+b);
	}
	
	
	public static void main(String[] args) {
      
		Test9.send(8978654,"ac.png");
      Test9.send(233,"Sample","fsg");
      Test9.main(10,20.90);
	}

}
