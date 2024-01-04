/** This is a very small challege on prencedence in Java*/

public class PrecedenceOperatorsChallenge {
    public static void main(String[] args) {
        double myDouble = 20.00;
        double mySecondDouble = 80.00;
        double sumProduct = ((myDouble + mySecondDouble) * 100.00);
        System.out.println("My total = " + sumProduct);
        double myRemainder = sumProduct % 40.00;
        System.out.println("The remainder = " + myRemainder);
        boolean myBoolean = (myRemainder == 0.00);
        System.out.println("I am: " + myBoolean);

        if (!myBoolean){
            System.out.println("Got some remainder");
        }

    }
}
