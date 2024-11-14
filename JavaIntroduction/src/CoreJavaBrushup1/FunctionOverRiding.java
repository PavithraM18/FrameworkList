package CoreJavaBrushup1;

public class FunctionOverRiding extends ParentClassDemo{
	
	public void audioSystem()
	{
		System.out.println("Child Audio sytem code is implemented"); 
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParentClassDemo ford =  new FunctionOverRiding();
		ford.brakes();
		ford.audioSystem();
		
	}

}
