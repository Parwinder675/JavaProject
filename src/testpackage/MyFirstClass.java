package testpackage;

public class MyFirstClass {
//noun
	String nose;
	
	int Age;
	
	
	//verbs- action words
	
	public static void Speak() {
		System.out.println("java");
		// call the another non static method
		// Created object to call non static method
		MyFirstClass anotherVar = new MyFirstClass();
		anotherVar.Sleep();
	}
	
	public void Sleep() {
		System.out.println("I Sleep");
		eat();// call another non static in non static class so you dont need object
	}
	
	public void eat() {
		System.out.println("I eat");
	}
	
	// if you need to call a method it should be static or create a object 
	// to access the non static method
	
	public static void main (String[]args) {
		Speak();// static class
		
		
		// ClassName nameofReferenceVariable = new ClassName();
		MyFirstClass refVar= new MyFirstClass();
		
		refVar.Sleep(); // non static class
	}
	
}
