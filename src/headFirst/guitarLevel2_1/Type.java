package headFirst.guitarLevel2_1;

public enum Type {
	ACOUSTIC , ELECTRIC ;
	
	public String toString(){
		switch(this){
		case ACOUSTIC:
			return "acoustic";
		case ELECTRIC:
			return "electric";
		default :
			System.out.println("Crateira doesn't match..Thank You !");
			return null;
		}
	}
}
