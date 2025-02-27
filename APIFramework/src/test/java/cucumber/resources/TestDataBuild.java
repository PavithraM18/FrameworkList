package cucumber.resources;

import java.util.ArrayList;

import pojoClasses.AddPlacePost;
import pojoClasses.Location;

public class TestDataBuild {

	public AddPlacePost addPlacePayload(String name, String lanugage, String address)
	{
		AddPlacePost a = new AddPlacePost();
		a.setAccuracy(50);
		a.setAddress(address);
		a.setLanguage(lanugage);
		Location l = new Location();
		l.setLat(-38.383494);
		l.setLng(33.427362);
		a.setLocation(l);
		a.setName(name);
		a.setPhone_number("(+91) 983 893 3937");
		
		ArrayList<String> myList = new ArrayList<String>();
		myList.add("shoe park");
		myList.add("shop");
		a.setTypes(myList);
		a.setWebsite("http://google.com");
		return a;
	}
	
	public String deletePlacePayload(String placeId)
	{
		return "{\r\n\"place_id\":\""+placeId+"\"\r\n}";
	}

}
