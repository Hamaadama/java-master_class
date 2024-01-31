/**
 * This class provides a method for determining if a dog should wake up its owner based on
 * whether it's barking and the hour of the day.
 */
public class BarkingDog {

    /**
     * The main method demonstrates the use of the BarkingDog class by calling the
     * shouldWakeUp method with different parameters and printing the results.
     * 
     * @param args The command-line arguments (not used in this example).
     */
    public static void main(String[] args) {

        // Test the shouldWakeUp method with different scenarios and print the results
        System.out.println(shouldWakeUp(true, 1));   // Should print "true"
        System.out.println(shouldWakeUp(false, 2));  // Should print "false"
        System.out.println(shouldWakeUp(true, 8));   // Should print "false"
        System.out.println(shouldWakeUp(true, -1));  // Should print "false"
    }

    /**
     * Determines whether a dog should wake up its owner based on barking and the hour of the day.
     * The dog should wake up the owner if it's barking and the hour is between 0 (midnight) and 8
     * (exclusive) or if it's 23 (11:00 PM).
     * 
     * @param barking   A boolean indicating whether the dog is barking (true for barking, false otherwise).
     * @param hourOfDay An integer representing the current hour of the day (24-hour format).
     * @return true if the dog should wake up the owner, false otherwise.
     */
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        // Check if the dog is barking and the hour falls within the specified conditions
        return (barking && ((hourOfDay >= 0 && hourOfDay < 8) || hourOfDay == 23));
    }
}
