/**
 * This Java program demonstrates the use of keywords and expressions.
 * It calculates kilometers from miles and manipulates scores and health.
 */

public class KeywordsAndExpressions {

    /**
     * The main method, the entry point of the program.
     *
     * @param args Command line arguments (not used in this example).
     */
    public static void main(String[] args) {
        // Calculating kilometers from miles using an expression
        double kilometers = (100 * 1.609344);
        System.out.println("100 miles =  " + kilometers + " kms");

        // Manipulating a variable based on a condition
        int highScore = 50;
        if (highScore > 25) {
            // Adding bonus points to the high score
            highScore = 1000 + highScore;
        }

        // Using logical expressions to check multiple conditions
        int health = 100;
        if ((health < 25) && (highScore > 1000)) {
            // Subtracting points from high score and printing the result
            highScore = highScore - 1000;
            System.out.println("highScore = " + highScore);
        }
    }}
