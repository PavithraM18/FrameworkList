package Programs;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		withThirdVariable();
		withoutThirdVariable();
	}

	public static void withThirdVariable()
	{
		int a = 30;
		int b = 60;
		System.out.println("Before Swaping the values a:" +a + "\n Before Swaping the values b:" +b);
		int c = a;
		a = b;
		b = c;
		System.out.println("After Swaping the values a:" +a + "\n After Swaping the values b:" +b);
 
	}
	public static void withoutThirdVariable()
	{
		int a = 45;
		int b = 80;
		System.out.println("Before Swaping the values a:" +a + "\n Before Swaping the values b:" +b);
		
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("After Swaping the values a:" +a + "\n After Swaping the values b:" +b);
	}
}
