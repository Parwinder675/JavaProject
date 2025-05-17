package inheritance;

public class MobilePhone extends Electronics {

	public void portable() {
		System.out.println("mobiles are portable")	;
			

			}
			public  void multifunction() {
				System.out.println("It is multifunction");
				
			}
			// overridden method from parent class= runtime polymorphism
			public void Brand() {
				System.out.println("Brand is samsung")	;
				
					}
			//method overloading
			public void Brand(String name, int year) {
				System.out.println("name is" +name);
			
			/*	overloading methods = compile time polymorphism
			 **    only allowed in 3 conditions
				     types of parameters
				order of parameters
				number of parameters */
			}

			public static void main(String[]args) {
				// call child class
				MobilePhone mp = new MobilePhone();
				mp.portable();
				mp.multifunction();
                mp.Brand("samsung",0);//calling overloading method
				
				// call parent class
				
				Electronics ec = new Electronics();
				ec.Brand();
				ec.power();
				
				
				// call child class by creating object of both classes
				Electronics em = new MobilePhone();
				//em.portable(); not allowed because parent can't access child class
				em.power();
				em.Brand();// as overridden method , now it can call child class
				
			}
}

			
