/**
 * This class provides a method for converting kilobytes to megabytes and
 * printing the result in a specific format.
 */
public class MegaBytesConverter {

    /**
     * The main method demonstrates the use of the MegaBytesConverter class by
     * converting and printing kilobytes to megabytes.
     * 
     * @param args The command-line arguments (not used in this example).
     */
    public static void main(String[] args) {

        // Convert and print kilobytes to megabytes
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-1024);
        printMegaBytesAndKiloBytes(5000);
    }

    /**
     * Converts kilobytes to megabytes and prints the result in a specific format.
     * 
     * @param kiloBytes The size in kilobytes to be converted and printed.
     */
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        int megaBytes = (kiloBytes / 1024); // Calculate megabytes
        int remainingKiloBytes = (kiloBytes % 1024); // Calculate remaining kilobytes

        if (kiloBytes < 0) {
            System.out.println("Invalid Value"); // Print "Invalid Value" for negative input
        } else {
            // Print the conversion result in the format: "X KB = Y MB and Z KB"
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainingKiloBytes + " KB");
        }
    }
}
