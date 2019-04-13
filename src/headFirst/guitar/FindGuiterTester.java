package headFirst.guitar;

public class FindGuiterTester {

	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		initializeInventory(inventory);
		Guitar whatErinLikes = new Guitar("V95693", "Fender", "Stratocastor", "electric", "Alder", "Alder", 1499.95);
		
		Guitar guitar = inventory.search(whatErinLikes);
		if(guitar!=null){
			System.out.println("Erin , you might like this " +guitar.getBuilder() +
					" " + guitar.getModel() + " " + guitar.getType() + "guitar:\n " +
					guitar.getBackWood() + "back and sides, \n " +
					guitar.getTopWood() + " top. \n You can have it for only $ " + guitar.getPrice() + " !");
		}else{
			System.out.println("Sorry ,  Erin , we have nothin for you");
		}
	}

	public static void initializeInventory(Inventory inventory){
		//add guitar to inventory...
		inventory.addGuitar("V95693", "Fender", "Stratocastor", "electric", "Alder", "Alder", 1499.95);
	}
}
