package patterns;

public class Pattern07 {

	public static void main(String[] args) {
		// TODO Auto-generated method
		
		  for(int i=0;i<=6;i++) {
			  for(int j=0;j<=6;j++) {
				  if((j==6)||(i==6)||(i+j==6)) {
					  System.out.print("*");  
				  }else
				  System.out.print(" ");
			  }
			  System.out.println(" ");
		  }
		
		}
}

