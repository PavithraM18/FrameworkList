package CoreJavaBrushup2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Date d = new Date();
			System.out.println(d.toString());
			SimpleDateFormat sdf = new SimpleDateFormat();
			String c = sdf.format(d);
			System.out.println(c);
			SimpleDateFormat sd = new SimpleDateFormat("dd/MM/YY , hh/mm/ss ");
			System.out.println(sd.format(d));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
