package headFirst.chapter2.dogDoorlevel2;

public class DoorDogSimulator {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		DogDoor door = new DogDoor();
		Remote remote = new Remote(door);
		
		
		System.out.println();
		remote.pressButton();
		System.out.println("Fido has gone outside...");
		System.out.println("Fido's starts barking...");
		
		try{
			Thread.currentThread().sleep(10000);
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("...but he's stuck outside!");
			System.out.println("Fido's all done...");
			System.out.println("...so gina grabs the remote control");
			remote.pressButton();
			System.out.println("Fido's back inside...");
		}
		
	}

}
