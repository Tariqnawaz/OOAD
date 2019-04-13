package headFirst.chapter4.dogDoorRandy;

public class BarkRecognizer {
	private DogDoor door;
	
	public BarkRecognizer(DogDoor door){
		this.door = door;
	}
	
	public void  recognize(String bark){
		try{
		    System.out.println("BarkRecognizer: Heard a " +bark);
			if(door.getAllowedBark().equals(bark)){
				door.open();
			}else{
				System.out.println("this dog is not allowed");
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
}
