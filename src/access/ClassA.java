package access;

class ClassA {
String name = "Parwinder";
static String day = "Sunday";


public void getCity(){
	System.out.println("Jaipur");
}

public static void getDay(){
	System.out.println("Today is Sunday");
}



public static void main(String[]args) {
	ClassA obj = new ClassA();
	obj.getCity();
	
	getDay();
	
	System.out.println(obj.name);// non static within class
	System.out.println(day);// static within class
	
	
	
}
 

}
