package cucumber.resources;

public enum ApiResources {

	//enum is a special class in java , which has collection of constants and methods.
	
	AddPlaceAPI("/maps/api/place/add/json"),
	getPlaceApi("/maps/api/place/get/json"),
	deletePlaceApi("/maps/api/place/delete/json");

	private String resource; 
	
	ApiResources(String resource) {
		this.resource = resource;
	}
	
	public String getResource()
	{
		
		return resource;
	}
}
