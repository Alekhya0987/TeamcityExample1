package versioning.Model;

public class Shoe {

	private String name;
	private String brand;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Shoe(String name, String brand) {
		super();
		this.name = name;
		this.brand = brand;
	}

	public Shoe() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Shoe [name=" + name + ", brand=" + brand + "]";
	}
	

}
