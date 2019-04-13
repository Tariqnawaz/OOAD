package headFirst.guitarLevel3;

import headFirst.guitarLevel3.Builder;
import headFirst.guitarLevel3.Type;
import headFirst.guitarLevel3.Wood;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
	private List guitars;
	
	public Inventory(){
		guitars = new LinkedList();
	}
	
	public void addGuitar(String serialNumber , Builder builder , String model , Type type , Wood backWood , Wood topWood , double price , int numString){
		GuitarSpec guitarSpec = new GuitarSpec(builder , model , type, backWood, topWood, numString);
		
		Guitar guitar = new Guitar(serialNumber, price, guitarSpec);
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
	
	public boolean matches(GuitarSpec searchGuitar){
		if(searchGuitar.builder != searchGuitar.builder)
			return false;
		return true;
	}
	
	public List search(GuitarSpec searchGuitar){
		List matchingGuitars = new LinkedList();
		
		return matchingGuitars;
		
	}
	
	/*@SuppressWarnings({ "rawtypes", "unchecked" })
	public List search(GuitarSpec searchGuitar){
		List matchingGuitars = new LinkedList();
		//Guitar guitar = new Guitar();
		try{
			for(Iterator i = guitars.iterator();i.hasNext();){
				Guitar guitar = (Guitar)i.next();
				GuitarSpec guitarSpec = guitar.getSpec();
				//GuitarSpec guitarSpec = (GuitarSpec)i.next();
				if(searchGuitar.getBuilder() != guitarSpec.getBuilder()){
					matchingGuitars.add(guitarSpec);
					continue ;
				}
				String model = searchGuitar.getModel().toLowerCase();
				if(model!=null && !model.equals("") && model.equals(guitarSpec.getModel().toLowerCase())){
					matchingGuitars.add(guitarSpec);
					continue;
				}
				
				if(searchGuitar.getType() != guitarSpec.getType()){
					matchingGuitars.add(guitarSpec);
					continue ;
				}
				if(searchGuitar.getBackWood() != guitarSpec.getBackWood()){
					matchingGuitars.add(guitarSpec);
					continue ;
				}
				if(searchGuitar.getTopWood() != guitarSpec.getTopWood()){
					matchingGuitars.add(guitarSpec);
					continue ;
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return matchingGuitars;
	}*/
}
