package foo.acn.bo;

public class Weather extends BO {

	private static final long serialVersionUID = 1512152575077055145L;

	private float temperature;
	private String scale;

	public float getTemperature() {
		return temperature;
	}

	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}

	public String getScale() {
		return scale;
	}

	public void setScale(String scale) {
		this.scale = scale;
	}
}