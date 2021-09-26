package conditionalStatement;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("eneter the age");
		int age = s.nextInt();


		
		if(age<=18) {
			System.out.println("not eleigble to cast vote");
		}
		else
		{
			System.out.println("he can vote");
		}


	}

}
