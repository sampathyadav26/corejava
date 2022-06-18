package Constructors;

public class ParameterizedConstructor {

    int id;
    String name;
	
	
	
	public ParameterizedConstructor(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
       public void display() {
    	   System.out.println(id+"    "+name);
    	     
       }
     

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParameterizedConstructor obj= new ParameterizedConstructor(100,"sampath");
		obj.display();
		
	}

}
