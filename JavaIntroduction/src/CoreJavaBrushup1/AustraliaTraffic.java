package CoreJavaBrushup1;

public class AustraliaTraffic implements CentralTraffic, ContientalTraffic{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CentralTraffic a = new AustraliaTraffic();
		a.Greengo();
		a.redstop();
		a.FlashingYellow();
		
		ContientalTraffic b = new AustraliaTraffic();
		b.walklawn();
		
		AustraliaTraffic c = new AustraliaTraffic();
		c.StopSign();
		
	}
	
	public void StopSign()
	{
		System.out.println("stop sign");
	}
	@Override
	public void Greengo() {
		// TODO Auto-generated method stub
		System.out.println("green go displays");
	}

	
	public void redstop() {
		// TODO Auto-generated method stub
		System.out.println("red stop displays");
	}

	@Override
	public void FlashingYellow() {
		// TODO Auto-generated method stub
		System.out.println("flashing yellow displays");
	}

	@Override
	public void walklawn() {
		// TODO Auto-generated method stub
		System.out.println("walking lawn displays");
	}

}
