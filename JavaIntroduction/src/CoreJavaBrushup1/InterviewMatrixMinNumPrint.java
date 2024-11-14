package CoreJavaBrushup1;

public class InterviewMatrixMinNumPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][] = {{2,4,6},{7,4,9},{1,5,8}};
		int min = a[0][0];
		for(int i = 0 ;i<3; i++)
		{
			for (int j=0; j<3; j++)
			{
				
				if (a[i][j] <min )
				{
					System.out.println (a[i][j]);
					
				}
			}
		}
	}

}
