package CoreJavaBrushup1;

public class InterviewMaxNumPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	int a[][] = {{2,4,6},{7,4,9},{1,89,8}};
		int Max = a[0][0];
		for(int i = 0 ;i<3; i++)
		{
			for (int j=0; j<3; j++)
			{
				if (Max < a[i][j])
				{
				
					Max = a[i][j];
					System.out.println (Max);					
				}
				
			}
		}  */
		
		int a[][] = {{2,1,6},{7,4,9},{1,89,8}};
		int min=a[0][0];
		int mincoloumn = 0;


		for(int i=0;i<3;i++)
		{
		for(int j=0;j<3;j++)
		{
		if(a[i][j]<min)//2
		{
		min=a[i][j];
		mincoloumn=j;
		}
		}
		}
		//=1
		int max=a[0][mincoloumn];
		int k = 0;
		while(k<3)
		{
		if(a[k][mincoloumn]>max)
		{
		max=a[k][mincoloumn];
		}
		k++;
		}

		System.out.println(max);
		}

		}

