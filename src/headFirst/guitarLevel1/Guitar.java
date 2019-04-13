package headFirst.guitarLevel1;

public class Guitar {
	private String serialNumber , model,  builder  ,  type , backWood2 , topWood2 ;
	private double price;
	Builder builderB;
	Type typeT;
	Wood backWood; 
	Wood topWood;
	
	public Guitar(){
		
	}
	public Guitar(String serialNumber , String builder , String model , String type , String backWood2 , String topWood2 , double price){
		this.serialNumber = serialNumber;
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.backWood2 = backWood2;
		this.topWood2 = topWood2;
		this.price = price;
	}
	
	public Guitar(String serialNumber , Builder builder , String model , Type type1, Wood backWood1, Wood topWood1, double price){
		this.serialNumber = serialNumber;
		this.builderB = builder;
		this.model = model;
		this.typeT = type1;
		this.backWood = backWood1;
		this.topWood = topWood1;
		this.price = price;
	}
	
	public String getSerialNumber() {
		return serialNumber;
	}
	public String getModel() {
		return model;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	public Builder getBuilderB() {
		return builderB;
	}

	public Type getTypeT() {
		return typeT;
	}

	public Wood getBackWood() {
		return backWood;
	}

	public Wood getTopWood() {
		return topWood;
	}

	
	
}
