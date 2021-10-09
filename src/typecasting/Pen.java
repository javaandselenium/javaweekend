package typecasting;

public class Pen extends Paper {
	
	public void blackPen() {
		System.out.println("blackpen");
	}
	

	public void redPen() {
		System.out.println("redpen");
	}

	public static void main(String[] args) {
		Paper p=new Pen();
		p.blackPaper();
		p.whitePaper();
	
		
		

	}

}
