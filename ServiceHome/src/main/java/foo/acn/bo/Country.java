package foo.acn.bo;

import java.util.List;

public class Country extends BO implements GeoLocation<LocationDetails> {

	private static final long serialVersionUID = 8830915301564941952L;

	private String name;
	private LocationDetails locationDetails;
	private List<City> cities;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<City> getCities() {
		return cities;
	}

	public void setCities(List<City> cities) {
		this.cities = cities;
	}

	public LocationDetails getLocationDetails() {
		return locationDetails;
	}

	public void setLocationDetails(LocationDetails locationDetails) {
		this.locationDetails = locationDetails;

	}

}