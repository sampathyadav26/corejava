package Constructors;

public class ParentDemo
{
int x;
ParentDemo()
{
this(10);
System.out.println("parent Default constructor");
//System.out.println(x);
}
ParentDemo(int x)
{
//this.x=x;
System.out.println(x);
}

public void show()
{
System.out.println("show method");
}
public static void main(String[] args)
{
System.out.println("Main method");
ParentDemo parentDemo=new ParentDemo();
//System.out.println(parentDemo.x);
parentDemo.show();
}

	 

}
