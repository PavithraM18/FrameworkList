package CoreJavaBrushup2;

public class constructorDemo {
	
	public constructorDemo() //default constructor
	{
		System.out.println("I am inside the constructor");
	}
	
	
	//method
	public void getData()
	{
		System.out.println("I am inside the method");
	}
	
	public constructorDemo(int a , int b) //Parameterized constructor two argument
	{
		System.out.println("I am inside the Parameterized constructor two arguments");
		int c = a+b;
		System.out.println(c);
	}
	
	public constructorDemo(String h) //Parameterized constructor one argument
	{
		System.out.println("I am inside the Parameterized constructor one argument");
		System.out.println(h);
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		constructorDemo cd = new constructorDemo();
		cd.getData();
		constructorDemo cdp2 = new constructorDemo(4,5);
		constructorDemo cdp1 = new constructorDemo("Hello");
		
	}

}
