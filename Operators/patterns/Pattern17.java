package patterns;

public class Pattern17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int number=6;
          for(int i=1;i<=5;i++) {
        	  for(int j=1;j<=5;j++) {
        		 if(j%2==0) {
        			 System.out.print("even"+" ");
        		 }else
        			  System.out.print("*" +"  ");
        	  }
        	  System.out.println();
          }
	}

}
