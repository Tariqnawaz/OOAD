package headFirst.guitarLevel2;

import headFirst.guitarLevel2.Builder;
import headFirst.guitarLevel2.Type;
import headFirst.guitarLevel2.Wood;

public class Guitar {
	private String serialNumber ;
	private double price;
	private GuitarSpec spec;
	
	
	
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
