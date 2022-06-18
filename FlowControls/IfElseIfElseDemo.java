package FlowControls;

import java.util.Scanner;

public class IfElseIfElseDemo {
	
	/**
	 * 
	 * @param args
	 * 
	 * finding the largest number using Ifelse..elseif
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the first,second and Third Number");
		
		int FirstNumber=sc.nextInt();
		int SecondNumber=sc.nextInt();
		int ThirdNumber=sc.nextInt();
		
		if(FirstNumber>SecondNumber&&FirstNumber>ThirdNumber ) {
			
			System.out.println("|-------First Number is Large Number-------|");
			
		}else if(SecondNumber>FirstNumber&&SecondNumber>ThirdNumber) {
			
			System.out.println("Second Number is Large Number");
			
		}else if(ThirdNumber>FirstNumber&&ThirdNumber>SecondNumber) {
			
			System.out.println("Third Number is Large Number");
			
		}else {
			
			System.out.println("Any two or more numbers ");
		}
		sc.close();
	}

}
