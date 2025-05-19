package controlstatement;

public class AnotherBreakExample {


	    public static void main(String[] args) {
	        for (int i = 1; i <= 10; i++) {
	            if (isEven(i)) {
	                continue; // Skip even numbers
	            }

	            if (isGreaterThanSeven(i)) {
	                break; // Stop if number is greater than 7
	            }

	            System.out.println("Processing number: " + i);
	        }
	    }
	    // Helper method to check if number is even
	    public static boolean isEven(int number) {
	        return number % 2 == 0;
	    }

	    // Helper method to check if number is greater than 7
	    public static boolean isGreaterThanSeven(int number) {
	        return number > 7;
	    }
	  
	}

