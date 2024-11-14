package CoreJavaBrushup1;

public class MethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodsDemo a = new MethodsDemo();
		a.getData();
		StringObj b = new StringObj();
		//b.getdata2();
		String c= b.getData2();
		System.out.println (c);
		getData1();
		
	}

	public void getData()
	{
		System.out.println("Methods Demo on same class");
	}
	public static void getData1()
	{
		System.out.println("Methods Demo on same class with static data");
		
			
	}
}
