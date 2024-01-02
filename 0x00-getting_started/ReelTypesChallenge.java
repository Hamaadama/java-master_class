/**
 * This is a file where I will be playing with
 * the float and double data types of java
 */

public class ReelTypesChallenge {
	// class implementation
	
	public static void main(String args[]){
		
		//displays the min and max of float, and the space occupied by this data type in memory.
		System.out.println("In Java the float data type occupies " + Float.SIZE + " bits in the memory");
        	float myMinFloatValue = Float.MIN_VALUE;
        	float myMaxFloatValue = Float.MAX_VALUE;
        	System.out.println("The float data type is range between " + myMinFloatValue + " and " + myMaxFloatValue + "\n");

		//displays the min and max of double, and the space occupied by this data type in memory.
		System.out.println("In Java the double data type occupies " + Double.SIZE + " bits in the memory");
		double myMinDoubleValue = Double.MIN_VALUE;
		double myMaxDoubleValue = Double.MAX_VALUE;
		System.out.println("The double data type is range between " + myMinDoubleValue + " and " + myMaxDoubleValue + "\n");

		/* float myFloatNumber = 5.25; this will throw an error, because double is the default data type for reels.
		 * We can solve this problem by casting: float myFloatNumber = (float)5.25; or by precising that the number
		 * is a float number: float myFloatNumber = 5.25f. Could do the  same for a double: by adding a d: 5.25d.
		 * However I will advise usind double for reels. It is the default data type, your code will be faster.*/


		//This wrapped the int value to 2
		int myIntValue = (5 / 2);
		System.out.println("I am an int number: " + myIntValue);
		//This will print the float number with a 7 decimal precision, however float is more precise than that.
		float myFloatValue = (5f / 3f);
		System.out.println("I am a float number: " + myFloatValue);
		//The same here it will print the number with 16 decimal precision, but double is also better precise.
		double myDoubleValue = (5d / 3d);
		System.out.println("I am a double number: " + myDoubleValue);


		//The following lines of code is to convert a given number of pounds to kilograms.
		double myPoundValue = 200;
		double convertedKilograms = (myPoundValue * 0.45359237);
		System.out.println(myPoundValue + " pounds is equal to: " + convertedKilograms + " kg(s).");


	}
}
