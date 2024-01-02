/**
 * This is a file where I will slightly
 * be playing with the String class java
 */

public class StringClass {
	//class implementations

	public static void main(String args[]){

		String myString = "This is a string";
		System.out.println("My string is equal to " + myString);
		myString = myString + ", and this is more.";
		System.out.println("My string is equal to " + myString);
		
		// Showcases the concatenation aspect of a String.
		String numberString = "250.55";
		numberString = numberString + "49.45";
		System.out.println("I am a concatenation of 2 number strings: " + numberString);

		// showcases that int has been treated as a string.
		String lastString = "10";
		int myInt = 50;
		lastString = lastString + myInt;
		System.out.println("I am a concatenation of a string and an int: " + lastString);

		//showcases that double has been treated as a string as well.
		double doubleNumber = 120.47;
		lastString = lastString + doubleNumber;
		System.out.println("I am a concatenation of a string and a double: " + lastString);

	}
}
