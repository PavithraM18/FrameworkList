package Interv;

public class IntegerCaching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Integer caching/pool range : -127 to 127  ,range is fixed for JVM
		//Only applicable for Integer Literals
		
		 Integer t1 = 100;
		 Integer t2 = 100;
		 System.out.println(t1==t2);  // will be true because it comes under pool range
		
		 Integer p1 = 200;
		 Integer p2 = 200;
		 System.out.println(p1==p2); // will be false because it is beyond pool range
		 
		 Integer i1 = new Integer(100);//Integer caching is not applicable for integer object 
		 Integer i2 = new Integer(100);
		 System.out.println(i1==i2);
		 
		 System.out.println(p1.equals(p2));//
		 System.out.println(i1.equals(i2));//	equals to will compare the value not the reference	 
	}

}
