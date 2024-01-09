/**
 * The FirstMethodChallenge class demonstrates the use of methods to calculate
 * and display a player's high score position based on their score in a game.
 */

public class FirstMethodChallenge {

    /**
     * The main method serves as the entry point of the program, showcasing
     * the calculation and display of high score positions for different players.
     *
     * @param args Command-line arguments (not used in this program).
     */

    public static void main(String[] args) {

        // Calculate and display high score position for player "Adam"
        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Adam", highScorePosition);

        // Calculate and display high score position for player "Bob"
        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Bob", highScorePosition);

        // Calculate and display high score position for player "Percy"
        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Percy", highScorePosition);

        // Calculate and display high score position for player "Gilbert"
        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Gilbert", highScorePosition);

        // Calculate and display high score position for player "James"
        highScorePosition = calculateHighScorePosition(25);
        displayHighScorePosition("James", highScorePosition);
    }

    /**
     * The displayHighScorePosition method prints a message indicating a player's
     * name and their position on the high score list.
     *
     * @param playerName        The name of the player.
     * @param highScorePosition The calculated high score position for the player.
     */

    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get into position "
                + highScorePosition + " on the high score list");
    }

    /**
     * The calculateHighScorePosition method determines a player's high score
     * position based on their game score.
     *
     * @param playerScore The score achieved by the player in the game.
     * @return The calculated high score position for the player.
     */

    public static int calculateHighScorePosition(int playerScore) {

        int position = 4;

        // Determine high score position based on player's score
        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }

        return position; // Return the calculated high score position
    }
}
