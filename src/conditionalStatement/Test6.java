package conditionalStatement;

import java.util.Scanner;

public class Test6 {
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the marks");
	int marks = s.nextInt();
	
	switch(marks) {
	case 1:System.out.println("A+");
	break;
	case 2:System.out.println("A");
	break;
	case 3:System.out.println("B+");
	break;
	case 4:System.out.println("B");
	break;
	case 5:System.out.println("C+");
	break;
	case 6:System.out.println("C");
	break;
	default:
		System.out.println("Fail");
	}
	
	}

	
	

}
