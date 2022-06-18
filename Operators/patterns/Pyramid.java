package patterns;

public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            
		int space=4,str=1,k;
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
			}
			for(k=1;k<=str;k++) {
				System.out.print("*");
			}
			System.out.println(" ");
			space--;
			str+=2;
		}
	
	}

}
