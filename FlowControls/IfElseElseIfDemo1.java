package FlowControls;

import java.util.Scanner;

public class IfElseElseIfDemo1 {
	
	/**
	 * 
	 * @param args
	 * finding grade in Subject using  Ifelse..elseif
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner Sc= new Scanner(System.in);
          
          System.out.println("|-----Enter your marks and check your Grade------|");
          
          int marks=Sc.nextInt();
         
          
          if(marks>90) {
        	  System.out.println("Secured A grade");
        	  
          }else if (marks>80&&marks<90) {
        	  System.out.println("Secured  B grade");
          }
          else if (marks>70&&marks<80) {
        	  System.out.println("Secured  C grade");
          }
          else if (marks>60&&marks<70) {
        	  System.out.println("Secured   D grade");
          }
          else if (marks>50&&marks<60) {
        	  System.out.println("Secured   E grade");
          }
          else if (marks>40&&marks<50) {
        	  System.out.println("Secured   F grade");
          }
          else if (marks>35&&marks<40) {
        	  System.out.println("Secured G grade");
          }
          else {
        	  System.out.println("you are Failed");
          }
	}

}
