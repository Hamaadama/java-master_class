/** Very small Challenge on Ternary Operator*/

public class TernaryOperator {
    public static void main(String[] args) {
        // learning phase, operation can be simplified.
        String makeOfCar = "volkswagen";

        // introduction to ternary operation.
        boolean isDomestic = makeOfCar == "volkswagen" ? false : true;
        if (isDomestic){
            System.out.println("This car is domestic to our country.");
        }
        String s = (isDomestic) ? "This car is domestic" : "This car is not domestic";
        System.out.println(s);
    }
}
