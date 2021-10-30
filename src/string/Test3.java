package string;

public class Test3 {

	public static void main(String[] args) {
		//StringBuilder sb=new StringBuilder("Java");
		StringBuffer sb=new StringBuffer("Java");
		sb.append("Selenium");
		System.out.println(sb);
		
//		sb.insert(1,"Python");
//		System.out.println(sb);
//		
//		sb.replace(0,4,"App");
//		System.out.println(sb);
//		
//		sb.delete(0,2);
//		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		
		

	}

}
