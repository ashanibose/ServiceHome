package foo.acn.bo;

import java.util.List;

public class City extends BO implements GeoLocation<LocationDetails> {

	private static final long serialVersionUID = -4902769003767176391L;

	private LocationDetails locationDetails;
	private List<Weather> cities;

	public List<Weather> getCities() {
		return cities;
	}

	public void setCities(List<Weather> cities) {
		this.cities = cities;
	}

	public LocationDetails getLocationDetails() {
		return locationDetails;
	}

	public void setLocationDetails(LocationDetails locationDetails) {
		this.locationDetails = locationDetails;

	}

}
