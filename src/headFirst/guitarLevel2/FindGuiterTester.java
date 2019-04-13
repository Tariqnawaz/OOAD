package headFirst.guitarLevel2;

import java.util.Iterator;
import java.util.List;

public class FindGuiterTester {

	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		initializeInventory(inventory);
		
		GuitarSpec whatErinLikes = new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC,  Wood.ALDER,  Wood.ALDER);
		
		List matchingGuitars = inventory.search(whatErinLikes);
		
		if(!matchingGuitars.isEmpty()){
			System.out.println("Erin , you might like this ");
			for(Iterator i = matchingGuitars.iterator() ; i.hasNext();){
				/*Guitar guitar = (Guitar) i.next();
				GuitarSpec spec = guitar.getSpec();*/
				
				GuitarSpec spec = (GuitarSpec) i.next();
				
				System.out.println("We have " +
						spec.getBuilder() +" " + spec.getModel() + " " + 
						spec.getType() + "  guitar:\n " +
						spec.getBackWood() + " back and sides, \n " +
						spec.getTopWood() + " top. \n You can have it for only $ " + 
						/*guitar.getPrice() +*/ " !\n -----");
			}
		}else{
			System.out.println("Sorry ,  Erin , we have nothing for you");
		}
		
		
		/*if(!matchingGuitars.isEmpty()){
			System.out.println("Erin , you might like this ");
			for(Iterator i = matchingGuitars.iterator() ; i.hasNext();){
				Guitar guitar = (Guitar) i.next();
				System.out.println("We have " +
									guitar.getBuilder() +" " + guitar.getModel() + " " + 
									guitar.getTypeT() + "  guitar:\n " +
									guitar.getBackWood() + " back and sides, \n " +
									guitar.getTopWood() + " top. \n You can have it for only $ " + 
									guitar.getPrice() + " !\n -----");
			}
		}else{
			System.out.println("Sorry ,  Erin , we have nothing for you");
		}*/
	}

	public static void initializeInventory(Inventory inventory){
		//add guitar to inventory...
		inventory.addGuitar("V95700", Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER, 1395.95);
		inventory.addGuitar("V95700", Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER, 1595.95);
	}
}
