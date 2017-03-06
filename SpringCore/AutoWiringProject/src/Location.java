
public class Location {
	private String city;
	
	public Location(String city){
		System.out.println(city);
		this.setCity(city);
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
