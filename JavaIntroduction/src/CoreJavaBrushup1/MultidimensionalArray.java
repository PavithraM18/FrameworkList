package CoreJavaBrushup1;

public class MultidimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][] = {{2,4,6},{7,4,9},{1,5,8}};
		System.out.println(a[1][2]);
		
		for(int i = 0 ;i<2; i++)
			
		{
			for (int j=0; j<3; j++)
			{
			System.out.println (a[i][j]);
			}
		}
	}

}
