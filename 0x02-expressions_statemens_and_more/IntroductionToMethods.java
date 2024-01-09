/**
 * The IntroductionToMethods class illustrates the use of methods in Java to
 * modularize code and improve readability. It calculates and displays final
 * scores for a game scenario using different sets of conditions.
 */

public class IntroductionToMethods {

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

        int finalScore = score;

        // Call the calculateScore method with the first set of conditions
        calculateScore(gameOver, score, levelCompleted, bonus);

        // Update game state variables for the second set of conditions
        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        finalScore = score;

        // Calculate and display final score for the second set of conditions
        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
    }

    /**
     * The calculateScore method calculates the final score based on the given
     * conditions and displays the result.
     *
     * @param gameOver       A boolean indicating whether the game is over.
     * @param score          The initial score before applying bonuses.
     * @param levelCompleted The level completed in the game.
     * @param bonus          The bonus points earned.
     */

    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        int finalScore = score;

        // Calculate and display final score for the given conditions
        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
        }
    }
}
