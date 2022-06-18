package patterns;

public class Pattern19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub   
		
		int s=1;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(i==j) {
					System.out.print(s +" ");
					s++;
				}else {
					System.out.print("0" +" ");
				}
			}
			System.out.println();
		}

	}

}
