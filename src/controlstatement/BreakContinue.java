package controlstatement;

public class BreakContinue {

	

	public static void main(String[] args) {
		BreakContinue bc = new BreakContinue();
		bc.runLoop();
		bc.breakLoop();
		
	}
	
		public  void runLoop() {
		//for loop
		for(int i=0; i<10; i++) {
			
		if(i==3) {
			System.out.println("Breaking the loop at i=" +i);
		break;
		}
		
		System.out.println("i = " +i);
		}
		
		}
		
		public void breakLoop(){
			System.out.println("................");
		
		// while loop
		int j=0 ;
		while(j<10) {
			j++;
			
	if(j==3) {
		System.out.println("Skipping j="+j);
		continue;
			
		}			System.out.println("j="+j);
	
		
		}       
		
	
}

}
