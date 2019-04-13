package headFirst.guitarLevel2_1;

import headFirst.guitarLevel2_1.Builder;
import headFirst.guitarLevel2_1.Type;
import headFirst.guitarLevel2_1.Wood;

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
