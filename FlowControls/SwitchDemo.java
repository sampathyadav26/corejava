package FlowControls;

import java.util.Scanner;

public class SwitchDemo {
           
	/**
	 * 
	 * @param args
	 * performing Add,sub,multi,div  using Switch case
	 * 
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Scanner sc=new Scanner(System.in);
		
		System.out.println("|-----1.Addition-----|");
		
		System.out.println("|-----2.Subtraction-----|");
		
		System.out.println("|-----3.Multiplication-----|");
		
		System.out.println("|-----4.Division-----|");
		
		
		System.out.println("Enter your choice");
		
		int num=sc.nextInt();
		
		System.out.println("Enter A value ?");
		int a=sc.nextInt();
		
		System.out.println("Enter B value ?");
		int b=sc.nextInt();
		
		switch(num){
			case 1 :{
				System.out.println((a+b));
				break;
			}
			case 2 :{
				System.out.println((a-b));
				break;
			}
			case 3 :{
				System.out.println((a*b));
				break;
			}
			case 4 :{
				System.out.println((a/b));
				break;
			}
			
			default:System.out.println("default will excute");
			
				
		
		}
		
	}

}
