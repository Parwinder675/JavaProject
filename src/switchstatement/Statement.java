package switchstatement;

public class Statement {

	public static void main(String[] args) {
		String finalGrade = getGrade("B");
		System.out.println(finalGrade);

	}
	public static  String getGrade(String grade) {
	String gd= null;

    switch (grade) {
        case "A":
            System.out.println("Excellent!");
            gd ="Hurray we got your result "+ grade;
            break;
            
        case "B":
            System.out.println("Good job!");
            gd ="Hurray we got your result"+ grade;
            break;
            
        case "C":
            System.out.println("Well done");
            gd ="Hurray we got your result"+ grade;
            break;
            
        case "D":
            System.out.println("You passed");
            gd ="Hurray we got your result"+ grade;
            break;
        case "F":
            System.out.println("Better try again");
            gd ="Hurray we got your result"+ grade;
            break;
            
        default:
            System.out.println("Invalid grade");
    }
    return gd;
}
	
}



