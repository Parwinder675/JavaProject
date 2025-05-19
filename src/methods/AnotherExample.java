package methods;

public class AnotherExample {

	
	public void add() {
		System.out.println(20+30);
		
	}
	// make sure it return value type is int
	public int addTwoNumbers(int a, int b) {
		return c = a+b;
		
	}
	// make sure that returning value will be String
	public String getCity() {
		return "Jaipur";
			
	}
	
	
	
	public static void main(String[]args) {
		AnotherExample vt= new AnotherExample();
		vt.add();
		// to return c as in int you need to write
		int number = vt.addTwoNumbers(20, 15);
	System.out.println("Number is "+ number);// line for print
		String myCity=vt.getCity();
		System.out.println("MyCity is "
				+ ""
				+ ""+myCity);
		
	}
}
