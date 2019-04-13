package headFirst.guitarLevel3;

import headFirst.guitarLevel3.Builder;
import headFirst.guitarLevel3.Type;
import headFirst.guitarLevel3.Wood;

public class GuitarSpec {
	Builder builder;
	Type type;
	Wood backWood; 
	Wood topWood;
	String model;
	int numStrings;
	
	public GuitarSpec( Builder builder , String model , Type type, Wood backWood, Wood topWood , int numStrings){
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.backWood = backWood;
		this.topWood = topWood;
		this.numStrings = numStrings;
	}
	
	public int getNumStrings() {
		return numStrings;
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
