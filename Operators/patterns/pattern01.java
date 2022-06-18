package patterns;

public class pattern01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	   for(int i=1;i<=6;i++) {
		   for(int j=1;j<=6;j++) {
			   
			   if(i==2 && j==3)
			   System.out.print("A");
			   else {
				   System.out.print("*");
			   }
		   }
		   System.out.println();
	   }

	}

}
