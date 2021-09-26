package constructors;

public class SangeethaMobileshop{
	
	String name;
	String price;
	String phoneType;
	
	public SangeethaMobileshop(String name,String price,String phoneType) {
		this.name=name;
		this.price=price;
		this.phoneType=phoneType;
	}
	
	

	public static void main(String[] args) {
      SangeethaMobileshop s=new SangeethaMobileshop("iphone","75000","IOS");
      System.out.println(s.name);
      System.out.println(s.price);
      System.out.println(s.phoneType);
  

	}

}
