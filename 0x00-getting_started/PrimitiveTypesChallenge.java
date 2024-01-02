/*This is a file where I will be playing
 with the primitive data types of java*/

public class PrimitiveTypesChallenge {
	// class implementation
	
	public static void main(String args[]){
		
		System.out.println("\nIn Java the byte data type occupies " + Byte.SIZE + " bits in the memory");
        	byte myMinByteValue = Byte.MIN_VALUE;
        	byte myMaxByteValue = Byte.MAX_VALUE;
        	System.out.println("The byte data type is range between " + myMinByteValue + " and " + myMaxByteValue + "\n");

		System.out.println("In Java the short data type occupies " + Short.SIZE + " bits in the memory");
		short myMinShortValue = Short.MIN_VALUE;
		short myMaxShortValue = Short.MAX_VALUE;
		System.out.println("The short data type is range between " + myMinShortValue + " and " + myMaxShortValue + "\n");

		System.out.println("In Java the int data type occupies " + Integer.SIZE + " bits in the memory");
                int myMinIntValue = Integer.MIN_VALUE;
                int myMaxIntValue = Integer.MAX_VALUE;
                System.out.println("The int data type is range between " + myMinIntValue + " and " + myMaxIntValue + "\n");

		System.out.println("In Java the long data type occupies " + Long.SIZE + " bits in the memory");
                long myMinLongValue = Long.MIN_VALUE;
                long myMaxLongValue = Long.MAX_VALUE;
                System.out.println("The long data type is range between " + myMinLongValue + " and " + myMaxLongValue + "\n");

		byte myByteNumber = 9;
		short myShortNumber = 30;
		int myIntNumber = 90;
		long myLongNumber = (long)(50000 + (10 * (myByteNumber + myShortNumber + myIntNumber)));
		System.out.println("This is just a result of a random calculation: " + myLongNumber + "\n");
	}
}

