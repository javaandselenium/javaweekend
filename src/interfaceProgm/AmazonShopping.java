package interfaceProgm;

public class AmazonShopping implements Amazon{

	@Override
	public void payment() {
		System.out.println("do payment");
		
	}

	@Override
	public void seller() {
		System.out.println("buy a product from seller");
		
	}

	public static void main(String[] args) {
		AmazonShopping a=new AmazonShopping();
		a.payment();
		a.seller();
		System.out.println(Amazon.price);
		System.out.println(Amazon.amount);
	}
}
