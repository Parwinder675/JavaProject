package access;

public class ClassB {
	
	public static void main(String[]args) {
		 ClassA cla = new ClassA();// non static 
		 cla.getCity();
		 
		 ClassA.getDay();// static method
		// static variable
		 //use the variable before you using it another class
		String vari = ClassA.day;
		System.out.println(vari);
		
		// OR USE IT LIKE
		//sYSTEM.OUT.PRINTLN(ClassA.day):
		
		
		// non static variable
		// you need an object
		
		System.out.println(cla.name);
		
		 
		
	}
	
	

	
	

}
