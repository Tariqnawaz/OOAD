package headFirst.guitarLevel1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
	private List guitars;
	
	public Inventory(){
		guitars = new LinkedList();
	}
	
	public void addGuitar(String serialNumber , Builder builder , String model , Type type , Wood backWood , Wood topWood , double price){
		Guitar guitar = new Guitar(serialNumber, builder, model, type, backWood, topWood, price);
		guitars.add(guitar);
	}
	
	public Guitar getGuitar(String serialNumber){
		for(Iterator i = guitars.iterator();i.hasNext();){
			Guitar guitar = (Guitar)i.next();
			if(guitar.getSerialNumber().equals(serialNumber)){
				return guitar;
			}
		}
		return null;
	}
	
	/*public Guitar search(Guitar searchGuitar){
		Guitar guitar = new Guitar();
		for(Iterator i = guitars.iterator();i.hasNext();){
			guitar = (Guitar)i.next();
			
			if(searchGuitar.getBuilderB() != guitar.getBuilderB()){
				continue ;
			}
			String model = searchGuitar.getModel().toLowerCase();
			if(model!=null && !model.equals("") && model.equals(guitar.getModel().toLowerCase())){
				continue;
			}
			
			if(searchGuitar.getTypeT() != guitar.getTypeT()){
				continue ;
			}
			if(searchGuitar.getBackWood() != guitar.getBackWood()){
				continue ;
			}
			if(searchGuitar.getTopWood() != guitar.getTopWood()){
				continue ;
			}
			return guitar;
		}
		return guitar;
	}*/
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public List search(Guitar searchGuitar){
		List matchingGuitars = new LinkedList();
		Guitar guitar = new Guitar();
		for(Iterator i = guitars.iterator();i.hasNext();){
			guitar = (Guitar)i.next();
			
			if(searchGuitar.getBuilderB() != guitar.getBuilderB()){
				matchingGuitars.add(guitar);
				continue ;
			}
			String model = searchGuitar.getModel().toLowerCase();
			if(model!=null && !model.equals("") && model.equals(guitar.getModel().toLowerCase())){
				matchingGuitars.add(guitar);
				continue;
			}
			
			if(searchGuitar.getTypeT() != guitar.getTypeT()){
				matchingGuitars.add(guitar);
				continue ;
			}
			if(searchGuitar.getBackWood() != guitar.getBackWood()){
				matchingGuitars.add(guitar);
				continue ;
			}
			if(searchGuitar.getTopWood() != guitar.getTopWood()){
				matchingGuitars.add(guitar);
				continue ;
			}
		}
		return matchingGuitars;
	}
}
