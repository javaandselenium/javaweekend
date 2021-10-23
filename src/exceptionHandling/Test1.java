package exceptionHandling;

public class Test1 {

	public static void main(String[] args) {
	int arr[]= {10,20,30,40,50};
	try {
	System.out.println(arr[10]);
	}
	catch(ArrayIndexOutOfBoundsException a) {
		System.out.println("handle");
	}
	
	System.out.println("hello");
	

	}

}
