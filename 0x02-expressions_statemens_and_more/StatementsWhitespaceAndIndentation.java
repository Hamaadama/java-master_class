/**
 * This Java program illustrates the use of statements, whitespace, and indentation.
 */
public class StatementsWhitespaceAndIndentation {

    /**
     * The main method, the entry point of the program.
     *
     * @param args Command line arguments (not used in this example).
     */
    public static void main(String[] args) {

        // Declaration and initialization of a variable
        int myVariable = 50;

        // Increment and decrement operations on 'myVariable'
        myVariable++;
        myVariable--;

        // Printing a simple text statement
        System.out.println("This is a test");

        // Concatenating multiple strings in a single print statement
        System.out.println("This is" + " another" +
                " still more.");

        // Declaration and initialization of another variable (unused)
        int anotherVariable = 50;

        // Decrementing 'myVariable' again (already decremented above)
        myVariable--;

        // Printing the value of 'myVariable'
        System.out.println("myVariable = " + myVariable);

        // Checking a condition using an if statement
        if (myVariable == 0) {
            // This block will not be executed as the condition is always false
            System.out.println("It's now zero");
        }
    }
}
