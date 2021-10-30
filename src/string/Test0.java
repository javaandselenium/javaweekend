package string;

public class Test0 {

	public static void main(String[] args) {
	String s=" Hello Selenium ";
	
	System.out.println(s.length());
	System.out.println(s.equals(" Hello Selenium "));
	System.out.println(s.charAt(3));
	System.out.println(s.concat("JAVA"));
	System.out.println(s.equalsIgnoreCase(" hello selenium "));
	System.out.println(s.toUpperCase());
	System.out.println(s.toLowerCase());
	System.out.println(s.contains("java"));
	System.out.println(s.compareTo(" Hello Selenium "));
	System.out.println(s.trim());
	System.out.println(s.contentEquals(" Hello Selenium "));
	System.out.println(s.endsWith(" "));
	System.out.println(s.indexOf('S'));
	System.out.println(s.substring(3));
	System.out.println(s.lastIndexOf('u'));
	

	}

}
