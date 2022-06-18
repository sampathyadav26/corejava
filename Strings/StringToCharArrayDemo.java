package Strings;

public class StringToCharArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		String str="Sampath";
		
		char[] chars=str.toCharArray();
		System.out.println(chars);
		for(int i=0;i<chars.length;i++) {
			System.out.println(chars[i]);
		}
	}

}
