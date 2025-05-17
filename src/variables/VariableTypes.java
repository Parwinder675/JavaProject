package variables;

public class VariableTypes {
	// static
	// instance
	//local
	
	
	
	// instance variable 
	String name= " Parwinder";
	
	// static variable(class)
	static String day ="Sunday";
	
	// local variable= its inside the method
	// if a variable declared within the method called local 
	public void test() {
		int num;
		System.out.println(num);
	}
	
	
	public void test01()
	{
		// non static variable within non static method 
		
		// no need to create object because its within same class
		System.out.println(name);
	}
	
	public static void test02()
	{
		// non static variable within static method
		VariableTypes vt = new VariableTypes();
		System.out.println(vt.name);
		
	}
	
	
	

}
