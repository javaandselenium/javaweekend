package encapsulation;

public class Test1 {

	public static void main(String[] args) {
		SBI s=new SBI();
		System.out.println(s.getAcctnumb());
		System.out.println("current balance "+s.getBalance());
		s.setBalance(700);
		System.out.println("updated balance "+s.getBalance());
		System.out.println(s.getPassword());
		System.out.println("old numb "+s.getNumb());
		s.setNumb(8788676);
		System.out.println("updted numb "+s.getNumb());
	}

}
