/**
 * This file is a brief introduction on
 * Operators, Operands and Expressions.
 */

public class OperatorsOperandsAndExpressions {
	//class implementations

	public static void main(String args[]){
	
		// Here we have 1, and 2 as operands +, and = as 
		// operators. = is also called  assignment operator.
		
		int result = 1 + 2; // 1 + 2 = 3
		System.out.println( "I am the result of 1 + 2: " + result);
		int previousResult = result;
		result = result - 1; // 3 - 1 = 2
		System.out.println("I am the result of 3 - 1: " + result);

		// chars are stored as int in the memory.
		char firstChar = 'A';
		char secondChar = 'D';
		System.out.print("Here A and D are ints and their sum is: ");
		System.out.println(firstChar + secondChar);
		
		// Here adding  the empty string makes concatenation happens.
		System.out.print("Here the addition of en empty String makes us chars: ");
		System.out.println("" + firstChar + secondChar);

		// multiplication operation with ints
		result = result * 10; // 2 * 10 = 20
		System.out.println("I am the result of 2 * 10: " + result);

		// division operation with ints
		result = result / 4; // 20 / 4 = 5
		System.out.println("I am the result of 20 / 4: " + result);

		// reminder or modulo operation with ints.
		result = result % 3; // 5 % 3 = 2
		System.out.println("I am the result of 5 % 3: " + result);


	}

}
