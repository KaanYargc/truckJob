package truckJob;

public class Truck {
	private String plateName;
	private String brand;
	private String model;
	private Driver driver;
	public Truck() {
		super();
	}
	public Truck(String plateName, String brand, String model) {
		super();
		this.plateName = plateName;
		this.brand = brand;
		this.model = model;
	}
	public Truck(String plateName, String brand, String model, Driver driver) {
		super();
		this.plateName = plateName;
		this.brand = brand;
		this.model = model;
		this.driver = driver;
	}
	public String getPlateName() {
		return plateName;
	}
	public void setPlateName(String plateName) {
		this.plateName = plateName;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Driver getDriver() {
		return driver;
	}
	public void setDriver(Driver driver) {
		this.driver = driver;
	}
}
