package CoreJavaBrushup1;

public class FunctionOverLoading {
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub
			FunctionOverLoading fol = new FunctionOverLoading();
			fol.getData(5);
			fol.getData("Number");
			fol.getData(1, 8);
	}

		public void getData(int a)
		{
			System.out.println(a);
		}
		
		public void getData(String a)
		{
			System.out.println(a);
		}
		
		public void getData(int a,int b)
		{
			System.out.println(a+b);
		}
		
}
