package foo.acn.bl;

import java.util.List;

import foo.acn.bo.City;
import foo.acn.bo.Country;

public interface CityBL {

	public List<City> getCityByCountry(Country country);

}
