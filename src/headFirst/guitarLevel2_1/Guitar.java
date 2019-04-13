package headFirst.guitarLevel2_1;

import headFirst.guitarLevel2_1.Builder;
import headFirst.guitarLevel2_1.Type;
import headFirst.guitarLevel2_1.Wood;

public class Guitar {
	private String serialNumber ;
	private double price;
	private GuitarSpec spec;
	
	public Guitar(String serialNumber , double price , Builder builder , String model , Type type, Wood backWood, Wood topWood){
		this.serialNumber = serialNumber;
		this.price = price;
		this.spec = new GuitarSpec(builder, model, type, backWood, topWood);
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getSerialNumber() {
		return serialNumber;
	}
	public GuitarSpec getSpec() {
		return spec;
	}
	
	
	
}
