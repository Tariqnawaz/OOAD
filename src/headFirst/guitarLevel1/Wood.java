package headFirst.guitarLevel1;

public enum Wood {
	INDIAN_ROSEWOOD, BRAZILIAN_ROSEWOOD ,MAHOGANY, MAPLE, COCOBOLO , CEDAR,ADIRONDACK , ALDER , SITKA;
	
	public String toString(){
		switch(this){
		case INDIAN_ROSEWOOD:
			return "Indian_Rosewood";
		case BRAZILIAN_ROSEWOOD:
			return "Brazil_Rosewood";
		case MAHOGANY:
			return "mahogany";
		case MAPLE:
			return "maple";
		case COCOBOLO:
			return "cocobolo";
		case CEDAR:
			return "cedar";
		case ADIRONDACK:
			return "adirondack";
		case ALDER:
			return "alder";
		case SITKA:
			return "sitka";	
		default :
			System.out.println("Crateira doesn't match..Thank You !");
			return null;
		}
	}
}
