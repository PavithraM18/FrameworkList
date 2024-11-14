package CoreJavaBrushup1;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Array 
		int[] a1 = new int[5];
		a1[0] = 45;
		a1[1] = 67;
		a1[2] = 8;
		a1[3] = 87;
		a1[4] = 55;
	
		int[] a2 = {4,7,8,2,56,9};
		
		//int array
		for (int i = 0; i<a1.length; i++)
		{
			System.out.println(a1[i]);
		}
		
		System.out.println("#######");
		
		for (int i = 2; i<a2.length; i++)
		{
			System.out.println(a2[i]);
		}
		
		System.out.println("#######");
	}

}
