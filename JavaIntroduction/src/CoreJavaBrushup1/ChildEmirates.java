package CoreJavaBrushup1;

public class ChildEmirates extends ParentAirCraft  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildEmirates c = new ChildEmirates();
		c.bodyColour();
		c.engine();
		c.safetyGuideline();
			
	}

	@Override
	public void bodyColour() {
		
		System.out.println("Colopur of the Aircraft is Red");
		
	}

}
