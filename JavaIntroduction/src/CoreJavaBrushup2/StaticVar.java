package CoreJavaBrushup2;

public class StaticVar {
	
	String name;// Instance variable
	String address;
	static String city= "Tamilnadu"; //static or class variable
	static int i=0;

	public StaticVar(String name, String address)  //local variable
	{
		this.name= name;
		this.address = address;
		i++;
		System.out.println(i);
	}
	
	public void getAddress()
	{
		System.out.println(address+","+city);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticVar obj = new StaticVar("ashwin", "velachery");
		StaticVar obj1 = new StaticVar("pavi", "kpm");
		obj.getAddress();
		obj1.getAddress();
	}

}
