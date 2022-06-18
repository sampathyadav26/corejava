package patterns;

public class Pattern09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        for(int i=1;i<=6;i++) {
        	for(int j=1;j<=6;j++) {
        		
        		if((i==6)||(j==6)||(i+j==7)) {
        			System.out.print("*");
        		}else {
        			System.out.print(" ");
        		}
        	}
        	System.out.println("");
        }
        for(int i=1;i<=6;i++) {
        	for(int j=1;j<=6;j++) {
        		
        		if((i==6)||(i==j)) {
        			System.out.print("*");
        		}else {
        			System.out.print(" ");
        		}
        	}
        	System.out.println("");
        }
	}

}
