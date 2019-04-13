package headFirst.guitarLevel1;

import java.util.Iterator;
import java.util.List;

public class FindGuiterTester {

	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		initializeInventory(inventory);
		Guitar whatErinLikes = new Guitar("V95693", Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER, 1499.95);
		
		/*Guitar guitar = inventory.search(whatErinLikes);
		if(guitar!=null){
			System.out.println("Erin , you might like this " +guitar.getBuilderB() +
					" " + guitar.getModel() + " " + guitar.getTypeT() + "  guitar:\n " +
					guitar.getBackWood() + " back and sides, \n " +
					guitar.getTopWood() + " top. \n You can have it for only $ " + guitar.getPrice() + " !");
		}else{
			System.out.println("Sorry ,  Erin , we have nothin for you");
		}*/
		
		List matchingGuitars = inventory.search(whatErinLikes);
		if(!matchingGuitars.isEmpty()){
			System.out.println("Erin , you might like this ");
			for(Iterator i = matchingGuitars.iterator() ; i.hasNext();){
				Guitar guitar = (Guitar) i.next();
				System.out.println("We have " +
									guitar.getBuilderB() +" " + guitar.getModel() + " " + 
									guitar.getTypeT() + "  guitar:\n " +
									guitar.getBackWood() + " back and sides, \n " +
									guitar.getTopWood() + " top. \n You can have it for only $ " + 
									guitar.getPrice() + " !\n -----");
			}
		}else{
			System.out.println("Sorry ,  Erin , we have nothing for you");
		}
	}

	public static void initializeInventory(Inventory inventory){
		//add guitar to inventory...
		inventory.addGuitar("V95693", Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER, 1499.95);
		inventory.addGuitar("V95700", Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER, 1595.95);
	}
}
