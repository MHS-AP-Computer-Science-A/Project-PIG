public class PigDice {
    //Your code here


	
	public String toString() {
		String d1 = "";
		if(first == 1) d1 = "\u2680";
		if(first == 2) d1 = "\u2681";
		if(first == 3) d1 = "\u2682";
		if(first == 4) d1 = "\u2683";
		if(first == 5) d1 = "\u2684";
		if(first == 6) d1 = "\u2685";
		
		String d2 = "";
		if(second == 1) d2 = "\u2680";
		if(second == 2) d2 = "\u2681";
		if(second == 3) d2 = "\u2682";
		if(second == 4) d2 = "\u2683";
		if(second == 5) d2 = "\u2684";
		if(second == 6) d2 = "\u2685";
		
		return d1 + " " + d2;		
	}
}
