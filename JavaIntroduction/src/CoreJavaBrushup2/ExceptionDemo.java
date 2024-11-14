package CoreJavaBrushup2;

public class ExceptionDemo {
	
	int a= 5;
	public void arr()
	{
			try {
				int a[] = { 2, 4, 6, 8, 9 };
				System.out.println(a[7]);
			} catch (IndexOutOfBoundsException ie) {
				System.out.println("index number is not available");

			} 
			
			finally //finally block will be executed irrespective of exception thrown or not
			{
				System.out.println("will run all time");
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b =7;
		int c = 0;
		
		try {
			int k =b/c;

			System.out.println(k);
		}
		catch (ArithmeticException ae) //multiple catch block
		{
			System.out.println("infinite number given for divition");
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Check the invalid parameters");
		}
	
		ExceptionDemo ed = new ExceptionDemo();
		ed.arr();
	}

}
