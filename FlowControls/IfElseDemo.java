package FlowControls;

import java.util.Scanner;

public class IfElseDemo {
	
	
	/**
	 * 
	 * @param args
	 * 
	 * Wap given number is even or odd using if else condition
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		Scanner obj=new Scanner(System.in);
		
		System.out.println("|---------Enter the NUmber--------|");
		int number=obj.nextInt();
		
		if(number%2==0) {

              System.out.println("Number is Even");
			
		}else {
			System.out.println("Number is odd");
		}	
		
	}

}
