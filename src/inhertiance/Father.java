package inhertiance;

public class Father extends GrandFather{
	
	public void car() {
		System.out.println("Poperty from father");
	}
	
	public static void main(String[] args) {
		Father fa=new Father();
		fa.car();
		fa.house();
	}

}
