package exceptionHandling;

public class Mainclass {
	
	
	public static void purchase() throws BigBazarException {
		int amt=800;
		
		if(amt>=1000) {
			System.out.println("shop");
		}
		else
		{
			throw new BigBazarException("shop for min1000");
		
		}

	}
	public static void main(String[] args) {
	try {
		Mainclass.purchase();
	}
	catch(BigBazarException b) {
		System.out.println(b.getmsg());
	}
		
		
}
}