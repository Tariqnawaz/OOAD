package headFirst.chapter4.dogDoorMaria;

public class DoorDogSimulator {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		DogDoor door = new DogDoor();
		BarkRecognizer recognizer = new BarkRecognizer(door);
		Remote remote = new Remote(door);
		//Bark barkObj = new Bark(door.getAllowedBark());
		Bark barkObj = new Bark("");
		System.out.println();
		//remote.pressButton();
		System.out.println("Fido's starts barking...");
		recognizer.recognize(barkObj);
		System.out.println("Fido has gone outside...");
		System.out.println("Fido all done...");
		
		
		try{
			Thread.currentThread().sleep(10000);
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("...but he's stuck outside!");
			System.out.println("...fido starting barking");
			recognizer.recognize(barkObj);
			System.out.println("Fido's back inside...");
		}
		
	}

}
