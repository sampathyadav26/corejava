package patterns;

public class Pattern14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          for(int i=1;i<=5;i++) {
        	  for(int j=1;j<=i;j++) {
        		  System.out.print("A" + " ");
        	  }
        	  System.out.println( );
          }
          for(int i=1;i<5;i++) {
        	  for(int j=i;j<5;j++) {
        		  System.out.print("B" + " ");
        	  }
        	  System.out.println( );
          }
	}

}
