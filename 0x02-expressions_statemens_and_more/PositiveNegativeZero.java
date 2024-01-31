/**
 * This class defines a method to check whether a given number is positive, negative, or zero.
 */

public class PositiveNegativeZero {
    
    /**
     * Checks whether the provided number is positive, negative, or zero and prints the result.
     *
     * @param number The number to be checked.
     */

    public static void checkNumber(int number){
        
        // Check if the number is greater than 0
        if (number > 0){
            System.out.println("positive"); // Print "positive" if the condition is true
        } 
        // Check if the number is less than 0
        else if (number < 0){
            System.out.println("negative"); // Print "negative" if the condition is true
        } 
        // If neither condition is met, it means the number is equal to 0
        else {
            System.out.println("zero"); // Print "zero" if neither of the above conditions is true
        }
    }
}

