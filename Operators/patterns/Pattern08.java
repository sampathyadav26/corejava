package patterns;

public class Pattern08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         for(int i=0;i<10;i++) 
         { 
        	 for(int j=0;j<10;j++) 
        	 {
        		 if((i==5)||(j==5))
        		 {
        			 System.out.print("*");
        		 }else
        		 {
        			 System.out.print(" ");
        		 }
        	 }
        	 System.out.println(" ");
         }
	}

}
