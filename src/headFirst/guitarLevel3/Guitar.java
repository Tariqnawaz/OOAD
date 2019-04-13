package headFirst.guitarLevel3;

import headFirst.guitarLevel3.Builder;
import headFirst.guitarLevel3.Type;
import headFirst.guitarLevel3.Wood;

public class Guitar {
	private String serialNumber ;
	private double price;
	private GuitarSpec spec;
	
	public Guitar(String serialNumber , double price , GuitarSpec spec){
		this.serialNumber = serialNumber;
		this.price = price;
		this.spec = spec;
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
