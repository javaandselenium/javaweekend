package exceptionHandling;

public class Test5 {
	
	public void demo() {
		System.out.println("close the database");
	}
	
	public void add() {
		System.out.println("adding");
	}

	public static void main(String[] args) {
		
		try {
		int a=1/0;
		}
		
		catch(Exception e) {
			
		}
		
		finally {
			Test5 t=new Test5();
			t.demo();
		}
		
		System.out.println("hello");
		Test5 t=new Test5();
		t.add();
		
		

	}

}
