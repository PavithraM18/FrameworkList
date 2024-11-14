package CoreJavaBrushup2;

public class thisDemo {

	int a = 2;
	
	public void getData()
	{
		int a = 3;
		System.out.println(a);
		System.out.println(this.a);
		int c;
		c = a+ this.a;
		System.out.println(c);
	}
	
	// this refers to the current object - object scope lies in class level
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thisDemo td = new thisDemo();
		td.getData();
		
	}

}
