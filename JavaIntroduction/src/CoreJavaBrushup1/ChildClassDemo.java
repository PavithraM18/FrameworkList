package CoreJavaBrushup1;

public class ChildClassDemo extends ParentClassDemo{

	public void engine()
	{
		System.out.println("New engine installed");
	}
	
	public void colour()
	{
		System.out.println(colour);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildClassDemo ccd =  new ChildClassDemo();
		ccd.colour();
		ccd.audioSystem();
		
		
	}

	
}
