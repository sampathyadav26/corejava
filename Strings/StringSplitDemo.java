package Strings;

public class StringSplitDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		
		String str="gsdadgjaghghgh";
		
		String[] split=str.split("gja");
		
		for(String obj:split) {
			System.out.println(obj);
		}
	}

}
