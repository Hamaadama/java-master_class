/**
 * This class provides methods for converting speeds from kilometers per hour to miles per hour
 * and for printing the converted values.
 */

public class SpeedConverter {

    /**
     * The main method demonstrates the use of the SpeedConverter class by converting and printing
     * speeds in miles per hour from given kilometers per hour values.
     * 
     * @param args The command-line arguments (not used in this example).
     */

    public static void main(String[] args) {
        
        // Convert and print speeds in miles per hour
        printConversion(toMilesPerHour(9));
        printConversion(toMilesPerHour(0));
        printConversion(toMilesPerHour(-3));
    }
    
    /**
     * Converts kilometers per hour to miles per hour.
     * 
     * @param kilometersPerHour The speed in kilometers per hour to be converted.
     * @return The equivalent speed in miles per hour, or -1 if the input is negative.
     */

    public static long toMilesPerHour(double kilometersPerHour){

        if (kilometersPerHour < 0){
            return -1; // Return -1 for invalid input (negative speed)
        } else {
            // Convert kilometers per hour to miles per hour using the conversion factor 1.609
            return Math.round(kilometersPerHour / 1.609);
        }
    }

    /**
     * Prints the conversion result of kilometers per hour to miles per hour.
     * 
     * @param kilometersPerHour The speed in kilometers per hour to be converted and printed.
     */
    public static void printConversion(double kilometersPerHour){

        if (kilometersPerHour < 0){
            System.out.println("Invalid Value"); // Print "Invalid Value" for negative input
        } else {
            // Convert kilometers per hour to miles per hour and print the result
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }
    }
}
