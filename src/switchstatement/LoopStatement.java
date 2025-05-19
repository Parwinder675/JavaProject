package switchstatement;

public class LoopStatement {

	public static void main(String[] args) {
		
		getGrade("B");

	}
	public static void getGrade(String grade) {
	

    if(grade.equals("A")) {
       
            System.out.println("Excellent!");
    }

    if(grade.equals("B")) {
           
            System.out.println("Good job!");
	}

    if(grade.equals("C")) {
    	System.out.println("Well done");
    }
            
    if(grade.equals("D")) {
            System.out.println("You passed");
	}

    if(grade.equals("F")) 
            System.out.println("Better try again");
          
    else {
            System.out.println("Invalid grade");
    }
}
}


