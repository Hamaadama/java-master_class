/**
 * This is on abbreviating operators.
 */

public class AbbreviatingOperators{
	public static void main(String args[]){

		// normal incrementation by 1.
		int result = 1;
		result = result + 1;
		System.out.println("result = " + result);

		// short form of an incrementation by 1.
		result++;
		System.out.println("result = " + result);

		// short form of an decrementation by 1.
		result--;
		System.out.println("result = " + result);

		// another form of decrementation.
		// the same can be done on incrementation.
		result -= 1;
		System.out.println("result = " + result);

		// short form of incrementation by 5.
		result += 5;
		System.out.println("result = " + result);

	}
}
