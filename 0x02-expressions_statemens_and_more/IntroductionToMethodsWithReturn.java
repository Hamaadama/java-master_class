/**
 * This class demonstrates the use of a method to calculate and retrieve
 * the high score for a game scenario based on different conditions.
 */

public class IntroductionToMethodsWithReturn {

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

        // Calculate and display the high score for the first set of conditions
        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("The highScore is " + highScore);

        // Update game state variables for the second set of conditions
        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        // Calculate and display the high score for the second set of conditions
        System.out.println("The next highScore is " +
                calculateScore(gameOver, score, levelCompleted, bonus));
    }

    /**
     * The calculateScore method calculates the final score based on the given
     * conditions and returns the resulting high score.
     *
     * @param gameOver       A boolean indicating whether the game is over.
     * @param score          The initial score before applying bonuses.
     * @param levelCompleted The level completed in the game.
     * @param bonus          The bonus points earned.
     *
     * @return The high score calculated based on the provided conditions.
     */
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        int finalScore = score;

        // Calculate final score for the given conditions
        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
        }

        return finalScore; // Return the high score
    }
}
