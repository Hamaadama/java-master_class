/**
 * This is a file where I will be playing with
 * the char and Boolean data types of java
 */

public class CharAndBoolean {
	// class implementation
	
	public static void main(String args[]){
	
		//Different representation of a char in java.
		System.out.println("A char has a width of " + Character.SIZE + " bits in Java.");
		char myChar = 'D';
		char myCharNumber = 68;
		char myUnicode = '\u0044';

		System.out.println("I am the letter " + myChar + " represented by me: (D).");
		System.out.println("I am the letter " + myCharNumber + " represented by my int equivalent.");
		System.out.println("I am the letter " + myUnicode + " represented by my unicode.");

		// A very simple introduction to boolean numbers
		System.out.println("A boolean has a width of " + Byte.SIZE + " bits in Java.");
		boolean myTrueBooleanValue = true;
		boolean myFalseBooleanValue = false;
		boolean isAdamCool = true;
		System.out.println("Is ADAM a cool guy? Response: " + isAdamCool);

	}
}
