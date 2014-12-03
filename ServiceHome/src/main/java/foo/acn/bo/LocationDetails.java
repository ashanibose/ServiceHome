package foo.acn.bo;

public class LocationDetails extends BO {

	private static final long serialVersionUID = -9059466939827650063L;

	private String name;
	private String code;
	private String thumbnali;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getThumbnali() {
		return thumbnali;
	}

	public void setThumbnali(String thumbnali) {
		this.thumbnali = thumbnali;
	}
}
