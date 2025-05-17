package methods;

public class MethodTypes {
	
	// non-parametrised method because its brackets are empty beside add
	public void add() {
		System.out.println(20+30);
	}
	
	// Parameterized method because beside subtract there are parametrs
public void subtract(int a, int b ) {
	System.out.println(a-b);
}
// another example of parametrised method
public void getCity(String City)  {
	System.out.println(City);
}



public static void main(String[]args)

{
MethodTypes mt = new MethodTypes();
mt.add();
mt.subtract(15, 10);// it asked for two arguments for a&b
mt.getCity("Jaipur");// give argument
}
}
