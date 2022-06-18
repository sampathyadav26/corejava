package patterns;

public class pattern03 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) { 
       	 for(int j=i;j<=5;j++) { 
       		 if(i==2 && j==3) {
       		 System.out.print("a");
       	 }
       		 else {
       			System.out.print("*");
       		 } 
        }
       	System.out.println("");
	}

}
}
