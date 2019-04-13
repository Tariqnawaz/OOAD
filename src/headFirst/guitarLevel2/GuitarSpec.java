package headFirst.guitarLevel2;

import headFirst.guitarLevel2.Builder;
import headFirst.guitarLevel2.Type;
import headFirst.guitarLevel2.Wood;

public class GuitarSpec {
	Builder builder;
	Type type;
	Wood backWood; 
	Wood topWood;
	String model;
	
	public GuitarSpec( Builder builder , String model , Type type, Wood backWood, Wood topWood){
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.backWood = backWood;
		this.topWood = topWood;
	}
	
	public Builder getBuilder() {
		return builder;
	}
	public Type getType() {
		return type;
	}
	public Wood getBackWood() {
		return backWood;
	}
	public Wood getTopWood() {
		return topWood;
	}
	public String getModel() {
		return model;
	}
}
