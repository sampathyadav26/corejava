package FlowControls;

public class WhileDemo {

	/**
	 * 
	 * @param args
	 * 
	 *             printing 1 to 10 ..using whileLoop
	 * 
	 *             printing 1 to 10 using condition
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int i=1;
//		while(i<=10) {
//			System.out.println(i);
//			i++;
//		}
//		

		int i = 1;
		while (i <= 10) {
			if(i==5) {
				i++;
				continue;
			}
			System.out.println(i);
			i++;
		}
	}

}
