

public class MathTest{
	
	public static void main(String[] args){
		double squareRoot,sin,cosine,floor,ceiling,round,max,min,random;
	
		squareRoot = Math.sqrt(37);
		
		sin = Math.sin(Math.toRadians(300));
		cosine = Math.cos(Math.toRadians(300));
		floor = Math.floor(22.8);
		ceiling = Math.ceil(22.8);
		round = Math.round(22.8);
		max = Math.max('D',71);
		min = Math.min('D',71);	
		random = (Math.random()*20);
		
		
		System.out.println("SquareRoot " + squareRoot);
		
		System.out.println("Sin " + sin);
		System.out.println("Cosine " + cosine);
		System.out.println("Floor " + floor);
		System.out.println("Ceiling " + ceiling);
		System.out.println("Round " + round);
		System.out.println("Max " + max);
		System.out.println("Min " + min);
		System.out.println("Random " + random);
		
	}

}