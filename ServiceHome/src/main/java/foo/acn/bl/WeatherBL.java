package foo.acn.bl;

import foo.acn.bo.GeoLocation;
import foo.acn.bo.Weather;

@SuppressWarnings("rawtypes")
public interface WeatherBL<T extends GeoLocation> {

	public Weather getWeatherByLocation(T location);

}
