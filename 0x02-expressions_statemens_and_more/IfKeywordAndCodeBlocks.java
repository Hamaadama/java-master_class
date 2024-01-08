/**
 * This Java program demonstrates the use of the 'if' keyword and code blocks.
 * Note: Some variables and conditions are intentionally unused or always true/false for demonstration purposes.
 */

public class IfKeywordAndCodeBlocks {

    /**
     * The main method, the entry point of the program.
     *
     * @param args Command line arguments (not used in this example).
     */

    public static void main(String[] args) {

        // Variables representing game state (some are intentionally unused)
        boolean gameOver = true; // Unused variable
        int score = 800;
        int levelCompleted = 5; // Unused variable
        int bonus = 100; // Unused variable

        // Checking conditions using 'if', 'else if', and 'else' statements
        if (score < 5000) {
            // This block will always be executed, making the following conditions unreachable
            System.out.println("Your score is less than 5000");
        } else if (score < 1000) {
            // This block will never be executed because the previous condition is always true
            System.out.println("Your score is less than 1000");
        } else {
            // This block will never be executed because the first condition is always true
            System.out.println("Got here");
        }

        // Note: The conditions and unused variables might be intentional for demonstration purposes.
    }
}
