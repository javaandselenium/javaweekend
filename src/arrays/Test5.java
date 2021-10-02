package arrays;

public class Test5 {

	public static void main(String[] args) {

		int a[]=new int[4];
		  a[0]=10;
		  a[1]=20;
		  a[2]=30;
		  a[3]=40;
		  
		  for(int i=0;i<4;i++) {
			  System.out.println(a[i]);
		  }
		  
		  System.out.println("*********");
		  
		  for(int i=3;i>=0;i--) {
			  System.out.println(a[i]);
		  }

	}

}
