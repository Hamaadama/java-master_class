/**
 * This file is on logical and operator.
 */

public class ThirdClass {
    public static void main(String[] args) {
        int topScore = 100;
        if(topScore >= 100){
            System.out.println("You got the high score!");
        }
        int secondTopScore = 60;
        if(topScore > secondTopScore && topScore < 100){
            System.out.println("Greater than second top score and less than 100");
        }
    }
}
