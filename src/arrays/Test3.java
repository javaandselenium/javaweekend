package arrays;

public class Test3 {

	public static void main(String[] args) {
		int a[]=new int[4];
		  a[0]=10;
		  a[1]=20;
		  a[2]=30;
		  a[3]=40;
		  
		  for(int i=0;i<4;i++) {
			  System.out.println(a[i]);
		  }

		  System.out.println("**after copying**");
		  
		      int  b[]= a;
		      
		      for(int i=0;i<4;i++) {
		    	  System.out.println(b[i]);
		      }
		  

	}

}
