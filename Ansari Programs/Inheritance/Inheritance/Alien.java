
public class Alien {

	//protected variables
	protected static int numberofEyes;
	protected static int numberofArms;
	protected static int numberofHeads;
	
	
	public String toString(){
		return "The Alien has " + numberofEyes + " eyes " + numberofArms + " arms " + numberofHeads + " heads";
	}
	
	public Alien( int eyes, int arms, int heads){
		
		//intializes objects
		numberofEyes = eyes;
		numberofArms = arms;
		numberofHeads = heads;
		
	}

}