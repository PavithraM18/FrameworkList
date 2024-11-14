package CoreJavaBrushup2;

public class ChildDemo extends ParentDemo {
	
	String name = "Child name";
	public void getStringData()
	{
		System.out.println(name);
		System.out.println(super.name); //super keyword :will refer to the parent class variable, Parent class constructor is invoked, will be invoked when there is inheritance concept
	}

	public ChildDemo()
	{
		//super(); if both parent and child class has default constructors, no super keyword is required, 
		// inherits the parent class also, as both are default constructors (explicitly defined in child class).
		System.out.println("I am in child constructor");
	}
	
	public void getData()
	{
		super.getData();
		System.out.println("I am in child method");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildDemo cd = new ChildDemo();
		cd.getStringData();
		cd.getData();
	}

}
