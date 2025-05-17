package controlstatement;

public class BreakContinue {

	private static final String Continue = null;

	public static void main(String[] args) {
		
		//for loop
		for(int i=0; i<10; i++) {
			
		if(i==3) {
			System.out.println("Breaking the loop at i=" +i);
		continue;
		}
		
		System.out.println("i = " +i);
		
		}
		System.out.println("................");
		// while loop
		int j=0;
		while(j<10) {
			j++;
			
		if(j==3) {
			System.out.println("Skipping j="+j);
			continue;
			
			}
			System.out.println("j="+j);
		
			
		}
		
		
	}

}
