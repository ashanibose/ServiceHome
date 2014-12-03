package foo.acn.bo;

public interface GeoLocation<T extends LocationDetails> {

	public T getLocationDetails();

	public void setLocationDetails(T locationDetails);
}
