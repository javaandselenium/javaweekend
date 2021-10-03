package methods;

public class Mobile2 extends Mobile1{
	
	public void camera() {
		System.out.println("front and back camera");
	    super.camera();
	}

	public static void main(String[] args) {
   Mobile2 m=new Mobile2();
   m.camera();


	}

}
