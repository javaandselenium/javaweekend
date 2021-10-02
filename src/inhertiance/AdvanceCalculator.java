package inhertiance;

public class AdvanceCalculator extends BasicCalculator{
	
	public void costeta() {
		System.out.println("coseteta");
	}
	public void sinteta() {
		System.out.println("coseteta");
	}
	
	public static void main(String[] args) {
		AdvanceCalculator a=new AdvanceCalculator();
		a.costeta();
		a.sinteta();
		a.add(20,10);
		a.sub(30,10);
		
	}

}
