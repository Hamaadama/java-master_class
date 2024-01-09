/**
 * The IfThenElseChallenge class demonstrates the use of conditional statements
 * (if-else) in Java to calculate and display final scores based on different
 * sets of conditions for a game scenario.
 */

public class IfThenElseChallenge {

    /**
     * The main method serves as the entry point of the program.
     *
     * @param args Command-line arguments (not used in this program).
     */

    public static void main(String[] args) {

        // Initial game state variables
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        // Calculate and display final score for the first set of conditions
        int finalScore = score;
        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
        }

        // Update game state variables for the second set of conditions
        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        // Calculate and display final score for the second set of conditions
        finalScore = score;
        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
    }
}
