package interfaceProgm;

public class AtmMachine implements Atm {

	@Override
	public void card() {
		System.out.println("insert the card");
		
	}

	@Override
	public void pin() {
	System.out.println("eneter the pin");	
		
	}

	@Override
	public void amount() {
		System.out.println("eneter the amount");
	}
	
	public static void main(String[] args) {
		AtmMachine a=new AtmMachine();
		a.card();
		a.pin();
		a.amount();
	}

	
}
