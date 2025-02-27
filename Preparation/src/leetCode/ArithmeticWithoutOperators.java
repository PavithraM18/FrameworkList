package leetCode;

public class ArithmeticWithoutOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 15;
		int b = 20;
		int sum = additionWithoutOperator(a,b);
		System.out.println("Addition two numbers without using + operator: " + sum);
		int subtract = subtractionWithoutOperator(a,b);
		System.out.println("Subtraction two numbers without using - operator: " + subtract);
	}

	private static int subtractionWithoutOperator(int a, int b) {
	
		// using bitwise XOR ^ , bitwise AND & , bitwise shift << ,Bitwise NOT (~)
				// integers are converted into binary value in this process
				while(b!= 0)
				{
				int borrow = (~a) & b;  // Find the borrow bits
				a = a ^ b ;	// performs the subtraction without considering the borrow bits
				b = borrow <<1;   // shifts the borrow bits to the left, preparing them for the next subtraction iteration
				
				}
				return a;
	}

	private static int additionWithoutOperator(int a, int b) {
		
		// using bitwise XOR ^ , bitwise AND & , bitwise shift <<
		// integers are converted into binary value in this process
		while(b!= 0)
		{
		int carry = a & b;  // Find the carry bits
		a = a^ b ;	// Perform the XOR operation to get the sum without carry
		b = carry <<1;   // Shift the carry bits to the left
		
		}
		return a;
	}

}
